package com.absmis.controller.enterprise;

import com.absmis.domain.enterprise.RealEstateEnCertification;
import com.absmis.service.enterprise.RealEstateEnCertificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RealEstateEnCertificationController {
    @Autowired
    RealEstateEnCertificationService realEstateEnCertificationService;

    /**
     * 获取到所有
     */
    @RequestMapping(value = "/findAllRealEstateEnCertification", method = RequestMethod.GET)
    public List<RealEstateEnCertification> findRealEstateEnCertification()throws Exception {
        List<RealEstateEnCertification> realEstateEnCertifications = realEstateEnCertificationService.findAllT();
        return realEstateEnCertifications;
    }
}
