package com.absmis.controller.enterprise;

import com.absmis.domain.enterprise.MachineryEnIndustrialization;
import com.absmis.service.enterprise.MachineryEnIndustrializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MachineryEnIndustrializationController {
    @Autowired
    MachineryEnIndustrializationService machineryEnIndustrializationService;

    //添加
    @RequestMapping(value = "/addMachineryEnIndustrialization", method = RequestMethod.POST)
    public Map<String, Object> addMachineryEnIndustrialization(@RequestBody MachineryEnIndustrialization machineryEnIndustrialization)throws Exception {
        this.machineryEnIndustrializationService.addMachineryEnIndustrialization(machineryEnIndustrialization);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("machineryEnIndustrialization", machineryEnIndustrialization);
        return map;
    }

    /**
     * 获取到所有
     */
    @RequestMapping(value = "/findAllMachineryEnIndustrialization", method = RequestMethod.GET)
    public List<MachineryEnIndustrialization> findMachineryEnIndustrialization()throws Exception {
        List<MachineryEnIndustrialization> machineryEnIndustrializations = machineryEnIndustrializationService.findAllT();
        return machineryEnIndustrializations;
    }


    //实现分页
    @RequestMapping(value = "/displayAllMachineryEnIndustrialization", method = RequestMethod.GET)
    public Map<String, Object> findAllMachineryEnIndustrialization(@RequestParam(value = "page") Integer page, @RequestParam(value = "rows") Integer size)throws Exception {
        Page<MachineryEnIndustrialization> list = this.machineryEnIndustrializationService.findAllT(new PageRequest(page - 1, size));
        Map<String, Object> map = new HashMap<String, Object>();
        int total = this.machineryEnIndustrializationService.findAllT().size();
        map.put("total", total);
        map.put("rows", list.getContent());
        return map;
    }

    //修改学院信息    完成 改
    @RequestMapping(value = "/updateMachineryEnIndustrialization", method = RequestMethod.PUT)
    public Map<String, Object> updateMachineryEnIndustrialization(@RequestBody MachineryEnIndustrialization machineryEnIndustrialization)throws Exception {
        this.machineryEnIndustrializationService.updateMachineryEnIndustrialization(machineryEnIndustrialization);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("machineryEnIndustrialization", machineryEnIndustrialization);
        return map;
    }

    //单个删除   完成 删
    @RequestMapping(value = "/deleteMachineryEnIndustrialization", method = RequestMethod.DELETE)
    public void deleteMachineryEnIndustrialization(@RequestParam("id") Long id)throws Exception {
        this.machineryEnIndustrializationService.deleteMachineryEnIndustrialization(id);
    }

    //批量删除   完成 删
    @RequestMapping(value = "/deleteMachineryEnIndustrializations",method = RequestMethod.DELETE)
    public void deleteMachineryEnIndustrializations(@RequestParam("ids") String ids){
        String deleteIds[] = ids.split(",");
        for(int i = 0; i<deleteIds.length; i++){
            this.machineryEnIndustrializationService.deleteById(Long.parseLong(deleteIds[i]));
        }
    }
}
