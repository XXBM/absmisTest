package com.absmis.controller.enterprise;

import com.absmis.domain.authority.User;
import com.absmis.domain.enterprise.ConstructionEn;
import com.absmis.domain.enterprise.ConstructionEnIndustrialization;
import com.absmis.service.authority.UserService;
import com.absmis.service.enterprise.ConstructionEnIndustrializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ConstructionEnIndustrializationController {
    @Autowired
    ConstructionEnIndustrializationService constructionEnIndustrializationService;
    @Autowired
    UserService userService;
    String username = null;
    User storedUser = null;

    //添加
    @RequestMapping(value = "/addConstructionEnIndustrialization", method = RequestMethod.POST)
    public Map<String, Object> addConstructionEnIndustrialization(@RequestBody ConstructionEnIndustrialization constructionEnIndustrialization)throws Exception {
        username = SecurityContextHolder.getContext().getAuthentication().getName();
        storedUser = userService.findByUsername(username);
        constructionEnIndustrialization.setConstructionEn((ConstructionEn)storedUser);
        this.constructionEnIndustrializationService.addConstructionEnIndustrialization(constructionEnIndustrialization);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("constructionEnIndustrialization", constructionEnIndustrialization);
        return map;
    }

    /**
     * 获取到所有
     */
    @RequestMapping(value = "/findAllConstructionEnIndustrializations", method = RequestMethod.GET)
    public List<ConstructionEnIndustrialization> findConstructionEnIndustrialization()throws Exception {
        List<ConstructionEnIndustrialization> constructionEnIndustrializations = constructionEnIndustrializationService.findAllT();
        return constructionEnIndustrializations;
    }


    //实现分页
    @RequestMapping(value = "/displayAllConstructionEnIndustrializations", method = RequestMethod.GET)
    public Map<String, Object> findAllConstructionEnIndustrialization(@RequestParam(value = "page") Integer page, @RequestParam(value = "rows") Integer size)throws Exception {
        Page<ConstructionEnIndustrialization> list = this.constructionEnIndustrializationService.findAllT(new PageRequest(page - 1, size));
        Map<String, Object> map = new HashMap<String, Object>();
        int total = this.constructionEnIndustrializationService.findAllT().size();
        map.put("total", total);
        map.put("rows", list.getContent());
        return map;
    }

    //修改学院信息    完成 改
    @RequestMapping(value = "/updateConstructionEnIndustrialization", method = RequestMethod.PUT)
    public Map<String, Object> updateConstructionEnIndustrialization(@RequestBody ConstructionEnIndustrialization constructionEnIndustrialization)throws Exception {
        this.constructionEnIndustrializationService.updateConstructionEnIndustrialization(constructionEnIndustrialization);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("constructionEnIndustrialization", constructionEnIndustrialization);
        return map;
    }

    //单个删除   完成 删
    @RequestMapping(value = "/deleteConstructionEnIndustrialization", method = RequestMethod.DELETE)
    public void deleteConstructionEnIndustrialization(@RequestParam("id") Long id)throws Exception {
        this.constructionEnIndustrializationService.deleteConstructionEnIndustrialization(id);
    }

    //批量删除   完成 删
    @RequestMapping(value = "/deleteConstructionEnIndustrializations",method = RequestMethod.DELETE)
    public void deleteConstructionEnIndustrializations(@RequestParam("ids") String ids){
        String deleteIds[] = ids.split(",");
        for(int i = 0; i<deleteIds.length; i++){
            this.constructionEnIndustrializationService.deleteById(Long.parseLong(deleteIds[i]));
        }
    }
}
