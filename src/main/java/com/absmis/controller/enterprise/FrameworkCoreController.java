package com.absmis.controller.enterprise;

import com.absmis.domain.enterprise.FrameworkCore;
import com.absmis.service.enterprise.FrameworkCoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FrameworkCoreController {
    @Autowired
    FrameworkCoreService frameworkCoreService;

    /**
     * 获取到所有
     */
    @RequestMapping(value = "/findAllFrameworkCores", method = RequestMethod.GET)
    public List<FrameworkCore> findFrameworkCore()throws Exception {
        List<FrameworkCore> frameworkCores = frameworkCoreService.findAllT();
        return frameworkCores;
    }
}
