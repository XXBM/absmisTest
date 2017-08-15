package com.absmis.controller.enterprise;

import com.absmis.domain.enterprise.SubUnitEn;
import com.absmis.service.authority.RoleService;
import com.absmis.service.enterprise.SubUnitEnService;
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
public class SubUnitEnController {
    @Autowired
    SubUnitEnService subUnitEnService;
    @Autowired
    RoleService roleService;

    //添加
    @RequestMapping(value = "/addSubUnitEn", method = RequestMethod.POST)
    public Map<String, Object> addSubUnitEn(@RequestBody SubUnitEn subUnitEn)throws Exception {
        subUnitEn.setPassword(subUnitEn.getUsername());
        subUnitEn.setRole(roleService.findOne((long)7));
        this.subUnitEnService.addSubUnitEn(subUnitEn);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("subUnitEn", subUnitEn);
        return map;
    }

    /**
     * 获取到所有
     */
    @RequestMapping(value = "/findAllSubUnitEns", method = RequestMethod.GET)
    public List<SubUnitEn> findSubUnitEn()throws Exception {
        List<SubUnitEn> subUnitEns = subUnitEnService.findAllT();
        return subUnitEns;
    }


    //实现分页
    @RequestMapping(value = "/displayAllSubUnitEns", method = RequestMethod.GET)
    public Map<String, Object> findAllSubUnitEn(@RequestParam(value = "page") Integer page, @RequestParam(value = "rows") Integer size)throws Exception {
        Page<SubUnitEn> list = this.subUnitEnService.findAllT(new PageRequest(page - 1, size));
        Map<String, Object> map = new HashMap<String, Object>();
        int total = this.subUnitEnService.findAllT().size();
        map.put("total", total);
        map.put("rows", list.getContent());
        return map;
    }

    //修改学院信息    完成 改
    @RequestMapping(value = "/updateSubUnitEn", method = RequestMethod.PUT)
    public Map<String, Object> updateSubUnitEn(@RequestBody SubUnitEn subUnitEn)throws Exception {
        this.subUnitEnService.updateSubUnitEn(subUnitEn);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("subUnitEn", subUnitEn);
        return map;
    }

    //删除一个学院   完成 删
    @RequestMapping(value = "/deleteSubUnitEn", method = RequestMethod.DELETE)
    public void deleteSubUnitEn(@RequestParam("id") Long id)throws Exception {
        this.subUnitEnService.deleteSubUnitEn(id);
    }

    //批量删除   完成 删
    @RequestMapping(value = "/deleteSubUnitEns",method = RequestMethod.DELETE)
    public void deleteSubUnitEns(@RequestParam("ids") String ids){
        String deleteIds[] = ids.split(",");
        for(int i = 0; i<deleteIds.length; i++){
            this.subUnitEnService.deleteById(Long.parseLong(deleteIds[i]));
        }
    }
}
