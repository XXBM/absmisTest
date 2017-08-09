package com.absmis.controller.enterprise;

import com.absmis.domain.enterprise.ComponentEn;
import com.absmis.service.enterprise.ComponentEnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xuling on 2016/10/11.
 */

@RestController
public class ComponentEnController {
    @Autowired
    ComponentEnService componentEnService;

    //添加一个新的学院  完成 增
    @RequestMapping(value = "/addComponentEn", method = RequestMethod.POST)
    public Map<String, Object> addComponentEn(@RequestBody ComponentEn componentEn)throws Exception {
        this.componentEnService.addComponentEn(componentEn);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("componentEn", componentEn);
        return map;
    }
}
