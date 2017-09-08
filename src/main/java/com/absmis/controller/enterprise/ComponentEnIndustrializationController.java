package com.absmis.controller.enterprise;

import com.absmis.domain.authority.User;
import com.absmis.domain.enterprise.ComponentEn;
import com.absmis.domain.enterprise.ComponentEnIndustrialization;
import com.absmis.service.authority.UserService;
import com.absmis.service.enterprise.CheckedStatusService;
import com.absmis.service.enterprise.ComponentEnIndustrializationService;
import com.absmis.service.enterprise.ComponentEnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ComponentEnIndustrializationController {
    @Autowired
    ComponentEnIndustrializationService componentEnIndustrializationService;
    @Autowired
    ComponentEnService componentEnService;
    @Autowired
    CheckedStatusService checkedStatusService;
    @Autowired
    UserService userService;
    String username = null;
    User storedUser = null;
    public static Calendar startingTime;


    //根据企业和申报起止时间查询
    @RequestMapping(value = "/queryQuarterComponentEnIn", method = RequestMethod.GET)
    public ComponentEnIndustrialization queryQuarter(
            @RequestParam(value = "enId") Long enId,
            @RequestParam(value = "year") Integer year,
            @RequestParam(value = "quarter") Integer quarter
    )throws Exception {
        return componentEnIndustrializationService.getByComponentEnIdAndYearAndQuarter(enId,year,quarter);
    }

    //check根据企业和申报起止时间查询
    @RequestMapping(value = "/queryComponentEnInCheck", method = RequestMethod.GET)
    public Map<String, Object> queryComponentEnInCheck(
            @RequestParam(value = "startTime") String startTime,
            @RequestParam(value = "endTime") String endTime,
            @RequestParam(value = "page") Integer page,
            @RequestParam(value = "rows") Integer size)throws Exception {
        username = SecurityContextHolder.getContext().getAuthentication().getName();
        storedUser = userService.findByUsername(username);
        Pageable pageable = new PageRequest(page-1,size);
        Specification<ComponentEnIndustrialization> specification = this.componentEnIndustrializationService.queryEnIndustrialization(storedUser.getId(),startTime,endTime);
        Page<ComponentEnIndustrialization> list = this.componentEnIndustrializationService.findBySepc(specification,pageable);
        Map<String, Object> map = new HashMap<String, Object>();
        int total = this.componentEnIndustrializationService.findBySepc(specification).size();
        map.put("total", total);
        map.put("rows", list.getContent());
        return map;
    }

    //根据企业和申报起止时间查询
    @RequestMapping(value = "/queryComponentEnIn", method = RequestMethod.GET)
    public Map<String, Object> queryComponentEnIn(
            @RequestParam(value = "componentEnName") String name,
            @RequestParam(value = "startTime") String startTime,
            @RequestParam(value = "endTime") String endTime,
            @RequestParam(value = "page") Integer page,
            @RequestParam(value = "rows") Integer size)throws Exception {
        Pageable pageable = new PageRequest(page-1,size);
        Specification<ComponentEnIndustrialization> specification = this.componentEnIndustrializationService.queryIndustrialization(name,startTime,endTime);
        Page<ComponentEnIndustrialization> list = this.componentEnIndustrializationService.findBySepc(specification,pageable);
        Map<String, Object> map = new HashMap<String, Object>();
        int total = this.componentEnIndustrializationService.findBySepc(specification).size();
        map.put("total", total);
        map.put("rows", list.getContent());
        return map;
    }

    //添加
    @RequestMapping(value = "/addComponentEnIndustrialization", method = RequestMethod.POST)
    public Map<String, Object> addComponentEnIndustrialization(@RequestBody ComponentEnIndustrialization componentEnIndustrialization)throws Exception {
        username = SecurityContextHolder.getContext().getAuthentication().getName();
        storedUser = userService.findByUsername(username);
        List<ComponentEnIndustrialization> first = componentEnIndustrializationService.findByComponentEnId(storedUser.getId());
        componentEnIndustrialization.setComponentEn((ComponentEn)storedUser);
        this.componentEnIndustrializationService.addComponentEnIndustrialization(componentEnIndustrialization);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("componentEnIndustrialization", componentEnIndustrialization);
        return map;
    }

    /**
     * 获取到所有
     */
    @RequestMapping(value = "/findAllComponentEnIndustrializations", method = RequestMethod.GET)
    public List<ComponentEnIndustrialization> findComponentEnIndustrialization()throws Exception {
        List<ComponentEnIndustrialization> componentEnIndustrializations = componentEnIndustrializationService.findAllT();
        return componentEnIndustrializations;
    }


    //实现分页
    @RequestMapping(value = "/displayAllComponentEnIndustrializations", method = RequestMethod.GET)
    public Map<String, Object> findAllComponentEnIndustrialization(@RequestParam(value = "page") Integer page, @RequestParam(value = "rows") Integer size)throws Exception {
        Page<ComponentEnIndustrialization> list = this.componentEnIndustrializationService.findAllT(new PageRequest(page - 1, size));
        Map<String, Object> map = new HashMap<String, Object>();
        int total = this.componentEnIndustrializationService.findAllT().size();
        map.put("total", total);
        map.put("rows", list.getContent());
        return map;
    }

    //修改学院信息    完成 改
    @RequestMapping(value = "/updateComponentEnIndustrialization", method = RequestMethod.PUT)
    public Map<String, Object> updateComponentEnIndustrialization(@RequestBody ComponentEnIndustrialization componentEnIndustrialization)throws Exception {
        this.componentEnIndustrializationService.updateComponentEnIndustrialization(componentEnIndustrialization);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("componentEnIndustrialization", componentEnIndustrialization);
        return map;
    }

    //check
    @RequestMapping(value = "/checkComponentEnIndustrialization", method = RequestMethod.POST)
    public Map<String, Object> checkComponentEnIndustrialization(
            @RequestParam("id") Long id,
            @RequestParam("constructionEnId") Long constructionEnId,
            @RequestParam("checkedStatusId") Long checkedStatusId
    )throws Exception {
        ComponentEnIndustrialization componentEnIndustrialization = componentEnIndustrializationService.findById(id);
        componentEnIndustrialization.setComponentEn(componentEnService.findOne(constructionEnId));
        componentEnIndustrialization.setCheckedStatus(checkedStatusService.findOne(checkedStatusId));
        this.componentEnIndustrializationService.updateComponentEnIndustrialization(componentEnIndustrialization);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("componentEnIndustrialization", componentEnIndustrialization);
        return map;
    }

    //单个删除   完成 删
    @RequestMapping(value = "/deleteComponentEnIndustrialization", method = RequestMethod.DELETE)
    public void deleteComponentEnIndustrialization(@RequestParam("id") Long id)throws Exception {
        this.componentEnIndustrializationService.deleteComponentEnIndustrialization(id);
    }

    //批量删除   完成 删
    @RequestMapping(value = "/deleteComponentEnIndustrializations",method = RequestMethod.DELETE)
    public void deleteComponentEnIndustrializations(@RequestParam("ids") String ids){
        String deleteIds[] = ids.split(",");
        for(int i = 0; i<deleteIds.length; i++){
            this.componentEnIndustrializationService.deleteById(Long.parseLong(deleteIds[i]));
        }
    }
}
