package com.absmis.controller.enterprise;

import com.absmis.domain.enterprise.MachineryEn;
import com.absmis.service.authority.RoleService;
import com.absmis.service.enterprise.CheckedStatusService;
import com.absmis.service.enterprise.MachineryEnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xuling on 2016/10/11.
 */

@RestController
public class MachineryEnController {
    @Autowired
    MachineryEnService machineryEnService;
    @Autowired
    RoleService roleService;
    @Autowired
    CheckedStatusService checkedStatusService;
    //根据企业名称模糊查询
    @RequestMapping(value = "/queryMachineryEnByName", method = RequestMethod.GET)
    public Map<String, Object> queryMachineryEnByName(
            @RequestParam(value = "nameQuery") String query,
            @RequestParam(value = "page") Integer page,
            @RequestParam(value = "rows") Integer size)throws Exception {
        Pageable pageable = new PageRequest(page-1,size);
        Specification<MachineryEn> specification = this.machineryEnService.queryName(query);
        Page<MachineryEn> list = this.machineryEnService.findBySepc(specification,pageable);
        Map<String, Object> map = new HashMap<String, Object>();
        int total = this.machineryEnService.findBySepc(specification).size();
        map.put("total", total);
        map.put("rows", list.getContent());
        return map;
    }
    //添加
    @RequestMapping(value = "/addMachineryEn", method = RequestMethod.POST)
    public Map<String, Object> addMachineryEn(@RequestBody MachineryEn machineryEn)throws Exception {
        machineryEn.setPassword(machineryEn.getUsername());
        machineryEn.setRole(roleService.findOne((long)6));
        this.machineryEnService.addMachineryEn(machineryEn);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("machineryEn", machineryEn);
        return map;
    }
    //非传统企业审核信息    完成 改
    @RequestMapping(value = "/checkMachineryEn", method = RequestMethod.POST)
    public Map<String, Object> checkMachineryEn(
            @RequestParam("id") Long id,
            @RequestParam("checkedStatusId") Long checkedId
    )throws Exception {
        MachineryEn machineryEn = machineryEnService.findOne(id);
        machineryEn.setCheckedStatus(checkedStatusService.findOne(checkedId));
        this.machineryEnService.update(machineryEn);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("machineryEn", machineryEn);
        return map;
    }
    /**
     * 获取到所有
     */
    @RequestMapping(value = "/findAllMachineryEns", method = RequestMethod.GET)
    public List<MachineryEn> findMachineryEn()throws Exception {
        List<MachineryEn> machineryEns = machineryEnService.findAllT();
        return machineryEns;
    }


    //实现分页
    @RequestMapping(value = "/displayAllMachineryEns", method = RequestMethod.GET)
    public Map<String, Object> findAllMachineryEn(@RequestParam(value = "page") Integer page, @RequestParam(value = "rows") Integer size)throws Exception {
        Page<MachineryEn> list = this.machineryEnService.findAllT(new PageRequest(page - 1, size));
        Map<String, Object> map = new HashMap<String, Object>();
        int total = this.machineryEnService.findAllT().size();
        map.put("total", total);
        map.put("rows", list.getContent());
        return map;
    }

    //修改学院信息    完成 改
    @RequestMapping(value = "/updateMachineryEn", method = RequestMethod.PUT)
    public Map<String, Object> updateMachineryEn(@RequestBody MachineryEn machineryEn)throws Exception {
        this.machineryEnService.updateMachineryEn(machineryEn);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("machineryEn", machineryEn);
        return map;
    }

    //删除一个学院   完成 删
    @RequestMapping(value = "/deleteMachineryEn", method = RequestMethod.DELETE)
    public void deleteMachineryEn(@RequestParam("id") Long id)throws Exception {
        this.machineryEnService.deleteMachineryEn(id);
    }

    //批量删除   完成 删
    @RequestMapping(value = "/deleteMachineryEns",method = RequestMethod.DELETE)
    public void deleteMachineryEns(@RequestParam("ids") String ids){
        String deleteIds[] = ids.split(",");
        for(int i = 0; i<deleteIds.length; i++){
            this.machineryEnService.deleteById(Long.parseLong(deleteIds[i]));
        }
    }
}
