package com.absmis.controller.enterprise;

import com.absmis.domain.enterprise.Framework;
import com.absmis.service.enterprise.FrameworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FrameworkController {
    @Autowired
    FrameworkService frameworkService;

    /**
     * 获取到所有
     */
    @RequestMapping(value = "/findAllFrameworks", method = RequestMethod.GET)
    public List<Framework> findFramework()throws Exception {
        List<Framework> frameworks = frameworkService.findAllT();
        return frameworks;
    }
}
