package com.absmis.controller.enterprise;

import com.absmis.domain.enterprise.BuilderCertification;
import com.absmis.service.enterprise.BuilderCertificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BuilderCertificationController {
    @Autowired
    BuilderCertificationService builderCertificationService;

    /**
     * 获取到所有
     */
    @RequestMapping(value = "/findAllBuilderCertification", method = RequestMethod.GET)
    public List<BuilderCertification> findBuilderCertification()throws Exception {
        List<BuilderCertification> builderCertifications = builderCertificationService.findAllT();
        return builderCertifications;
    }
}
