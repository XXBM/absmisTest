package com.absmis.controller.enterprise;

import com.absmis.domain.enterprise.EstateOwner;
import com.absmis.service.enterprise.EstateOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
public class EstateOwnerController {
    @Autowired
    EstateOwnerService estateOwnerService;

    //添加
    @RequestMapping(value = "/addEstateOwner", method = RequestMethod.POST)
    public Map<String, Object> addEstateOwner(@RequestBody EstateOwner estateOwner)throws Exception {
        this.estateOwnerService.addEstateOwner(estateOwner);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("estateOwner", estateOwner);
        return map;
    }

    /**
     * 获取到所有
     */
    @RequestMapping(value = "/findAllEstateOwner", method = RequestMethod.GET)
    public List<EstateOwner> findEstateOwner()throws Exception {
        List<EstateOwner> estateOwners = estateOwnerService.findAllT();
        return estateOwners;
    }


    //实现分页
    @RequestMapping(value = "/displayAllEstateOwner", method = RequestMethod.GET)
    public Map<String, Object> findAllEstateOwner(@RequestParam(value = "page") Integer page, @RequestParam(value = "rows") Integer size)throws Exception {
        Page<EstateOwner> list = this.estateOwnerService.findAllT(new PageRequest(page - 1, size));
        Map<String, Object> map = new HashMap<String, Object>();
        int total = this.estateOwnerService.findAllT().size();
        map.put("total", total);
        map.put("rows", list.getContent());
        return map;
    }

    //修改学院信息    完成 改
    @RequestMapping(value = "/updateEstateOwner", method = RequestMethod.PUT)
    public Map<String, Object> updateEstateOwner(@RequestBody EstateOwner estateOwner)throws Exception {
        this.estateOwnerService.updateEstateOwner(estateOwner);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("estateOwner", estateOwner);
        return map;
    }

    //删除一个学院   完成 删
    @RequestMapping(value = "/deleteEstateOwner", method = RequestMethod.DELETE)
    public void deleteEstateOwner(@RequestParam("id") Long id)throws Exception {
        this.estateOwnerService.deleteEstateOwner(id);
    }
}
