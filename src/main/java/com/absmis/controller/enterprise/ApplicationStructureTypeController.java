package com.absmis.controller.enterprise;

import com.absmis.domain.enterprise.ApplicationStructureType;
import com.absmis.domain.message.DataGridResult;
import com.absmis.service.enterprise.ApplicationStructureTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApplicationStructureTypeController {
    @Autowired
    ApplicationStructureTypeService applicationStructureTypeService;

    //实现分页
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public DataGridResult findAll(
            @RequestParam(value = "page") Integer page,
            @RequestParam(value = "rows") Integer size
    )throws Exception {
        DataGridResult countrylists = this.applicationStructureTypeService.getCountryList(page,size);
        return countrylists;
    }

    /**
     * 获取到所有
     */
    @RequestMapping(value = "/findAllApplicationStructureTypes", method = RequestMethod.GET)
    public List<ApplicationStructureType> findApplicationStructureType()throws Exception {
        List<ApplicationStructureType> applicationStructureTypes = applicationStructureTypeService.findAllT();
        return applicationStructureTypes;
    }
}
