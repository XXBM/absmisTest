package com.absmis.controller.enterprise;

import com.absmis.domain.enterprise.ApplicationStructureType;
import com.absmis.service.enterprise.ApplicationStructureTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApplicationStructureTypeController {
    @Autowired
    ApplicationStructureTypeService applicationStructureTypeService;



    /**
     * 获取到所有
     */
    @RequestMapping(value = "/findAllApplicationStructureTypes", method = RequestMethod.GET)
    public List<ApplicationStructureType> findApplicationStructureType()throws Exception {
        List<ApplicationStructureType> applicationStructureTypes = applicationStructureTypeService.findAllT();
        return applicationStructureTypes;
    }
}
