package com.absmis.controller.enterprise;

import com.absmis.domain.enterprise.ComponentEn;
import com.absmis.service.enterprise.ComponentEnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xuling on 2016/10/11.
 */

@RestController
public class ComponentEnController {
    @Autowired
    ComponentEnService componentEnService;

    //添加
    @RequestMapping(value = "/addComponentEn", method = RequestMethod.POST)
    public Map<String, Object> addComponentEn(@RequestBody ComponentEn componentEn)throws Exception {
        this.componentEnService.addComponentEn(componentEn);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("componentEn", componentEn);
        return map;
    }

    /**
     * 获取到所有
     */
    @RequestMapping(value = "/findAllComponentEn", method = RequestMethod.GET)
    public List<ComponentEn> findComponentEn()throws Exception {
        List<ComponentEn> componentEns = componentEnService.findAllT();
        return componentEns;
    }


    //实现分页
    @RequestMapping(value = "/displayAll", method = RequestMethod.GET)
    public Map<String, java.lang.Object> findAllComponentEn(@RequestParam(value = "page") Integer page, @RequestParam(value = "rows") Integer size)throws Exception {
        Page<ComponentEn> list = this.componentEnService.findAllT(new PageRequest(page - 1, size));
        Map<String, java.lang.Object> map = new HashMap<String, java.lang.Object>();
        int total = this.componentEnService.findAllT().size();
        map.put("total", total);
        map.put("rows", list.getContent());
        return map;
    }

    //修改学院信息    完成 改
    @RequestMapping(value = "/updateComponentEn", method = RequestMethod.PUT)
    public Map<String, java.lang.Object> updateComponentEn(@RequestBody ComponentEn componentEn)throws Exception {
        this.componentEnService.updateComponentEn(componentEn);
        Map<String, java.lang.Object> map = new HashMap<String, java.lang.Object>();
        map.put("componentEn", componentEn);
        return map;
    }

    //删除一个学院   完成 删
    @RequestMapping(value = "/deleteComponentEn", method = RequestMethod.DELETE)
    public void deleteComponentEn(@RequestParam("id") Long id)throws Exception {
        this.componentEnService.deleteComponentEn(id);
    }
}
