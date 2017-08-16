package com.absmis.controller.enterprise;

import com.absmis.domain.enterprise.StructureForm;
import com.absmis.service.enterprise.StructureFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StructureFormController {
    @Autowired
    StructureFormService structureFormService;



    /**
     * 获取到所有
     */
    @RequestMapping(value = "/findAllStructureForms", method = RequestMethod.GET)
    public List<StructureForm> findStructureForm()throws Exception {
        List<StructureForm> structureForms = structureFormService.findAllT();
        return structureForms;
    }
}
