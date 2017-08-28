package com.absmis.controller.enterprise;

import com.absmis.domain.authority.User;
import com.absmis.domain.enterprise.SubUnitEn;
import com.absmis.domain.enterprise.SubUnitEnIndustrialization;
import com.absmis.domain.message.SubUnitEnIndustrializationInfo;
import com.absmis.service.authority.UserService;
import com.absmis.service.enterprise.SubUnitEnIndustrializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SubUnitEnIndustrializationController {
    @Autowired
    SubUnitEnIndustrializationService subUnitEnIndustrializationService;
    @Autowired
    UserService userService;
    String username = null;
    User storedUser = null;

    //根据企业和申报起止时间查询
    @RequestMapping(value = "/queryQuarterSubUnitEnIn", method = RequestMethod.GET)
    public SubUnitEnIndustrializationInfo queryQuarter()throws Exception {
        username = SecurityContextHolder.getContext().getAuthentication().getName();
        storedUser = userService.findByUsername(username);
        Specification<SubUnitEnIndustrialization> specification = this.subUnitEnIndustrializationService.queryQuarter(storedUser.getId(),2017,3);
        List<SubUnitEnIndustrialization> list = this.subUnitEnIndustrializationService.findBySepc(specification);
        System.out.println(list.size()+"一共有几条");
        double integralWallNum = 0;
        double integrativeExternalWallNum = 0;
        double prebuiltStairsNum = 0;
        double integralKitchenNum = 0;
        double integralToiletNum = 0;
        double integralInteriorDecorationNum = 0;
        double integralWallAbility = 0;
        double integrativeExternalWallAbility = 0;
        double prebuiltStairsAbility = 0;
        double integralKitchenAbility = 0;
        double integralToiletAbility = 0;
        double integralInteriorDecorationAbility = 0;
        double integralWallScale = 0;
        double integrativeExternalWallScale = 0;
        double prebuiltStairsScale = 0;
        double integralKitchenScale = 0;
        double integralToiletScale = 0;
        double integralInteriorDecorationScale = 0;
        for(int i=0;i<list.size();i++){
             integralWallNum += list.get(i).getIntegralWallNum();
             integrativeExternalWallNum += list.get(i).getIntegrativeExternalWallNum();
             prebuiltStairsNum += list.get(i).getPrebuiltStairsNum();
             integralKitchenNum += list.get(i).getIntegralKitchenNum();
             integralToiletNum += list.get(i).getIntegralToiletNum();
             integralInteriorDecorationNum += list.get(i).getIntegralInteriorDecorationNum();
             integralWallAbility += list.get(i).getIntegralWallAbility();
             integrativeExternalWallAbility += list.get(i).getIntegrativeExternalWallAbility();
             prebuiltStairsAbility += list.get(i).getPrebuiltStairsAbility();
             integralKitchenAbility += list.get(i).getIntegralKitchenAbility();
             integralToiletAbility += list.get(i).getIntegralToiletAbility();
             integralInteriorDecorationAbility += list.get(i).getIntegralInteriorDecorationAbility();
             integralWallScale += list.get(i).getIntegralWallScale();
             integrativeExternalWallScale += list.get(i).getIntegrativeExternalWallScale();
             prebuiltStairsScale += list.get(i).getPrebuiltStairsScale();
             integralKitchenScale += list.get(i).getIntegralKitchenScale();
             integralToiletScale += list.get(i).getIntegralToiletScale();
             integralInteriorDecorationScale += list.get(i).getIntegralInteriorDecorationScale();
        }
        SubUnitEnIndustrializationInfo subUnitEnIndustrializationInfo = new SubUnitEnIndustrializationInfo();
        subUnitEnIndustrializationInfo.setIntegralWallNum(integralWallNum);
        subUnitEnIndustrializationInfo.setIntegrativeExternalWallNum(integrativeExternalWallNum);
        subUnitEnIndustrializationInfo.setPrebuiltStairsNum(prebuiltStairsNum);
        subUnitEnIndustrializationInfo.setIntegralKitchenNum(integralKitchenNum);
        subUnitEnIndustrializationInfo.setIntegralToiletNum(integralToiletNum);
        subUnitEnIndustrializationInfo.setIntegralInteriorDecorationNum(integralInteriorDecorationNum);
        subUnitEnIndustrializationInfo.setIntegralWallAbility(integralWallAbility);
        subUnitEnIndustrializationInfo.setIntegrativeExternalWallAbility(integrativeExternalWallAbility);
        subUnitEnIndustrializationInfo.setPrebuiltStairsAbility(prebuiltStairsAbility);
        subUnitEnIndustrializationInfo.setIntegralKitchenAbility(integralKitchenAbility);
        subUnitEnIndustrializationInfo.setIntegralToiletAbility(integralToiletAbility);
        subUnitEnIndustrializationInfo.setIntegralInteriorDecorationAbility(integralInteriorDecorationAbility);
        subUnitEnIndustrializationInfo.setIntegralWallScale(integralWallScale);
        subUnitEnIndustrializationInfo.setIntegrativeExternalWallScale(integrativeExternalWallScale);
        subUnitEnIndustrializationInfo.setPrebuiltStairsScale(prebuiltStairsScale);
        subUnitEnIndustrializationInfo.setIntegralKitchenScale(integralKitchenScale);
        subUnitEnIndustrializationInfo.setIntegralToiletScale(integralToiletScale);
        subUnitEnIndustrializationInfo.setIntegralInteriorDecorationScale(integralInteriorDecorationScale);
        return subUnitEnIndustrializationInfo;
    }



    //根据企业和申报起止时间查询
    @RequestMapping(value = "/querySubUnitEnInCheck", method = RequestMethod.GET)
    public Map<String, Object> querySubUnitEnIn(
            @RequestParam(value = "startTime") String startTime,
            @RequestParam(value = "endTime") String endTime,
            @RequestParam(value = "page") Integer page,
            @RequestParam(value = "rows") Integer size)throws Exception {
        username = SecurityContextHolder.getContext().getAuthentication().getName();
        storedUser = userService.findByUsername(username);
        Pageable pageable = new PageRequest(page-1,size);
        Specification<SubUnitEnIndustrialization> specification = this.subUnitEnIndustrializationService.queryEnIndustrialization(storedUser.getId(),startTime,endTime);
        Page<SubUnitEnIndustrialization> list = this.subUnitEnIndustrializationService.findBySepc(specification,pageable);
        Map<String, Object> map = new HashMap<String, Object>();
        int total = this.subUnitEnIndustrializationService.findBySepc(specification).size();
        map.put("total", total);
        map.put("rows", list.getContent());
        return map;
    }

    //根据企业和申报起止时间查询
    @RequestMapping(value = "/querySubUnitEnIn", method = RequestMethod.GET)
    public Map<String, Object> querySubUnitEnIn(
            @RequestParam(value = "subUnitEnName") String name,
            @RequestParam(value = "startTime") String startTime,
            @RequestParam(value = "endTime") String endTime,
            @RequestParam(value = "page") Integer page,
            @RequestParam(value = "rows") Integer size)throws Exception {
        Pageable pageable = new PageRequest(page-1,size);
        Specification<SubUnitEnIndustrialization> specification = this.subUnitEnIndustrializationService.queryIndustrialization(name,startTime,endTime);
        Page<SubUnitEnIndustrialization> list = this.subUnitEnIndustrializationService.findBySepc(specification,pageable);
        Map<String, Object> map = new HashMap<String, Object>();
        int total = this.subUnitEnIndustrializationService.findBySepc(specification).size();
        map.put("total", total);
        map.put("rows", list.getContent());
        return map;
    }
    //添加
    @RequestMapping(value = "/addSubUnitEnIndustrialization", method = RequestMethod.POST)
    public Map<String, Object> addSubUnitEnIndustrialization(@RequestBody SubUnitEnIndustrialization subUnitEnIndustrialization)throws Exception {
        username = SecurityContextHolder.getContext().getAuthentication().getName();
        storedUser = userService.findByUsername(username);
        subUnitEnIndustrialization.setSubUnitEn((SubUnitEn)storedUser);
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
