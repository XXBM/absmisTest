package com.absmis.controller.enterprise;

import com.absmis.domain.enterprise.SubUnitEnIndustrialization;
import com.absmis.service.enterprise.SubUnitEnIndustrializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SubUnitEnIndustrializationController {
    @Autowired
    SubUnitEnIndustrializationService subUnitEnIndustrializationService;

    //添加
    @RequestMapping(value = "/addSubUnitEnIndustrialization", method = RequestMethod.POST)
    public Map<String, Object> addSubUnitEnIndustrialization(@RequestBody SubUnitEnIndustrialization subUnitEnIndustrialization)throws Exception {
        this.subUnitEnIndustrializationService.addSubUnitEnIndustrialization(subUnitEnIndustrialization);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("subUnitEnIndustrialization", subUnitEnIndustrialization);
        return map;
    }

    /**
     * 获取到所有
     */
    @RequestMapping(value = "/findAllSubUnitEnIndustrializations", method = RequestMethod.GET)
    public List<SubUnitEnIndustrialization> findSubUnitEnIndustrialization()throws Exception {
        List<SubUnitEnIndustrialization> subUnitEnIndustrializations = subUnitEnIndustrializationService.findAllT();
        return subUnitEnIndustrializations;
    }


    //实现分页
    @RequestMapping(value = "/displayAllSubUnitEnIndustrializations", method = RequestMethod.GET)
    public Map<String, Object> findAllSubUnitEnIndustrialization(@RequestParam(value = "page") Integer page, @RequestParam(value = "rows") Integer size)throws Exception {
        Page<SubUnitEnIndustrialization> list = this.subUnitEnIndustrializationService.findAllT(new PageRequest(page - 1, size));
        Map<String, Object> map = new HashMap<String, Object>();
        int total = this.subUnitEnIndustrializationService.findAllT().size();
        map.put("total", total);
        map.put("rows", list.getContent());
        return map;
    }

    //修改学院信息    完成 改
    @RequestMapping(value = "/updateSubUnitEnIndustrialization", method = RequestMethod.PUT)
    public Map<String, Object> updateSubUnitEnIndustrialization(@RequestBody SubUnitEnIndustrialization subUnitEnIndustrialization)throws Exception {
        this.subUnitEnIndustrializationService.updateSubUnitEnIndustrialization(subUnitEnIndustrialization);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("subUnitEnIndustrialization", subUnitEnIndustrialization);
        return map;
    }

    //单个删除   完成 删
    @RequestMapping(value = "/deleteSubUnitEnIndustrialization", method = RequestMethod.DELETE)
    public void deleteSubUnitEnIndustrialization(@RequestParam("id") Long id)throws Exception {
        this.subUnitEnIndustrializationService.deleteSubUnitEnIndustrialization(id);
    }

    //批量删除   完成 删
    @RequestMapping(value = "/deleteSubUnitEnIndustrializations",method = RequestMethod.DELETE)
    public void deleteSubUnitEnIndustrializations(@RequestParam("ids") String ids){
        String deleteIds[] = ids.split(",");
        for(int i = 0; i<deleteIds.length; i++){
            this.subUnitEnIndustrializationService.deleteById(Long.parseLong(deleteIds[i]));
        }
    }
}
