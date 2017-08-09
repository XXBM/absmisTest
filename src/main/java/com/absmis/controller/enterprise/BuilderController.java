package com.absmis.controller.enterprise;

import com.absmis.domain.enterprise.Builder;
import com.absmis.service.enterprise.BuilderService;
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
public class BuilderController {
    @Autowired
    BuilderService builderService;

    //添加
    @RequestMapping(value = "/addBuilder", method = RequestMethod.POST)
    public Map<String, Object> addBuilder(@RequestBody Builder builder)throws Exception {
        this.builderService.addBuilder(builder);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("builder", builder);
        return map;
    }

    /**
     * 获取到所有
     */
    @RequestMapping(value = "/findAllBuilder", method = RequestMethod.GET)
    public List<Builder> findBuilder()throws Exception {
        List<Builder> builders = builderService.findAllT();
        return builders;
    }


    //实现分页
    @RequestMapping(value = "/displayAllBuilder", method = RequestMethod.GET)
    public Map<String, Object> findAllBuilder(@RequestParam(value = "page") Integer page, @RequestParam(value = "rows") Integer size)throws Exception {
        Page<Builder> list = this.builderService.findAllT(new PageRequest(page - 1, size));
        Map<String, Object> map = new HashMap<String, Object>();
        int total = this.builderService.findAllT().size();
        map.put("total", total);
        map.put("rows", list.getContent());
        return map;
    }

    //修改学院信息    完成 改
    @RequestMapping(value = "/updateBuilder", method = RequestMethod.PUT)
    public Map<String, Object> updateBuilder(@RequestBody Builder builder)throws Exception {
        this.builderService.updateBuilder(builder);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("builder", builder);
        return map;
    }

    //删除一个学院   完成 删
    @RequestMapping(value = "/deleteBuilder", method = RequestMethod.DELETE)
    public void deleteBuilder(@RequestParam("id") Long id)throws Exception {
        this.builderService.deleteBuilder(id);
    }
}
