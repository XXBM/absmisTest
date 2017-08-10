package com.absmis.controller.enterprise;

import com.absmis.domain.enterprise.ShearWall;
import com.absmis.service.enterprise.ShearWallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShearWallController {
    @Autowired
    ShearWallService shearWallService;

    /**
     * 获取到所有
     */
    @RequestMapping(value = "/findAllShearWall", method = RequestMethod.GET)
    public List<ShearWall> findShearWall()throws Exception {
        List<ShearWall> shearWalls = shearWallService.findAllT();
        return shearWalls;
    }
}
