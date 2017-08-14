package com.absmis.controller.enterprise;

import com.absmis.domain.enterprise.FrameworkShear;
import com.absmis.service.enterprise.FrameworkShearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FrameworkShearController {
    @Autowired
    FrameworkShearService frameworkShearService;

    /**
     * 获取到所有
     */
    @RequestMapping(value = "/findAllFrameworkShears", method = RequestMethod.GET)
    public List<FrameworkShear> findFrameworkShear()throws Exception {
        List<FrameworkShear> frameworkShears = frameworkShearService.findAllT();
        return frameworkShears;
    }
}
