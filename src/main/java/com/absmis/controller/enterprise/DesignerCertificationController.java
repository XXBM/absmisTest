package com.absmis.controller.enterprise;

import com.absmis.domain.enterprise.DesignerCertification;
import com.absmis.service.enterprise.DesignerCertificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by xuling on 2016/10/11.
 */

@RestController
public class DesignerCertificationController {
    @Autowired
    DesignerCertificationService designerCertificationService;

    /**
     * 获取到所有
     */
    @RequestMapping(value = "/findAllDesignerCertification", method = RequestMethod.GET)
    public List<DesignerCertification> findDesignerCertification()throws Exception {
        List<DesignerCertification> designerCertifications = designerCertificationService.findAllT();
        return designerCertifications;
    }
}
