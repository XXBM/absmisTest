package com.absmis.controller.enterprise;

import com.absmis.domain.enterprise.UnitEngineering;
import com.absmis.service.enterprise.UnitEngineeringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by xuling on 2016/10/11.
 */

@RestController
public class UnitEngineeringController {
    @Autowired
    UnitEngineeringService unitEngineeringService;

    //添加
    @RequestMapping(value = "/addUnitEngineering", method = RequestMethod.POST)
    public Map<String, Object> addUnitEngineering(@RequestBody UnitEngineering unitEngineering)throws Exception {
        //EngineeringIndustrialization engineeringIndustrialization = new EngineeringIndustrialization((double)2,(double)2,null,null,null,null,null);
        //unitEngineering.setEngineeringIndustrialization(engineeringIndustrialization);
        this.unitEngineeringService.addUnitEngineering(unitEngineering);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("unitEngineering", unitEngineering);
        return map;
    }

    /**
     * 获取到所有
     */
    @RequestMapping(value = "/findAllUnitEngineerings", method = RequestMethod.GET)
    public List<UnitEngineering> findUnitEngineering()throws Exception {
        List<UnitEngineering> unitEngineerings = unitEngineeringService.findAllT();
        return unitEngineerings;
    }


    //实现分页
    @RequestMapping(value = "/displayAllUnitEngineerings", method = RequestMethod.GET)
    public Map<String, Object> findAllUnitEngineering(@RequestParam(value = "page") Integer page, @RequestParam(value = "rows") Integer size)throws Exception {
        Page<UnitEngineering> list = this.unitEngineeringService.findAllT(new PageRequest(page - 1, size));
        Map<String, Object> map = new HashMap<String, Object>();
        int total = this.unitEngineeringService.findAllT().size();
        map.put("total", total);
        map.put("rows", list.getContent());
        return map;
    }

    //实现分页
    @RequestMapping(value = "/displayAllUnitEngineeringsByPro", method = RequestMethod.GET)
    public Map<String, Object> findAllUnitEngineeringByProject(
            @RequestParam(value = "page") Long id,
            @RequestParam(value = "page") Integer page,
            @RequestParam(value = "rows") Integer size)throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        Pageable pageable = new PageRequest(page - 1, size);
        Page<UnitEngineering> list = this.unitEngineeringService.findByProjectId(id, pageable);
        int total = this.unitEngineeringService.findByProjectId(id).size();
        map.put("total", total);
        map.put("rows", list.getContent());
        return map;
    }
    //修改学院信息    完成 改
    @RequestMapping(value = "/updateUnitEngineering", method = RequestMethod.PUT)
    public Map<String, Object> updateUnitEngineering(@RequestBody UnitEngineering unitEngineering)throws Exception {
        this.unitEngineeringService.updateUnitEngineering(unitEngineering);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("unitEngineering", unitEngineering);
        return map;
    }

    //删除一个学院   完成 删
    @RequestMapping(value = "/deleteUnitEngineering", method = RequestMethod.DELETE)
    public void deleteUnitEngineering(@RequestParam("id") Long id)throws Exception {
        this.unitEngineeringService.deleteUnitEngineering(id);
    }


    //批量删除   完成 删
    @RequestMapping(value = "/deleteUnitEngineerings",method = RequestMethod.DELETE)
    public void deleteUnitEngineerings(@RequestParam("ids") String ids){
        String deleteIds[] = ids.split(",");
        for(int i = 0; i<deleteIds.length; i++){
            this.unitEngineeringService.deleteById(Long.parseLong(deleteIds[i]));
        }
    }
}
