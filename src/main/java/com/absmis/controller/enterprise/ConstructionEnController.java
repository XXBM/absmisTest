package com.absmis.controller.enterprise;

import com.absmis.domain.enterprise.ConstructionEn;
import com.absmis.domain.enterprise.Organization;
import com.absmis.service.enterprise.ConstructionEnService;
import com.absmis.service.enterprise.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ConstructionEnController {
    @Autowired
    ConstructionEnService constructionEnService;
    @Autowired
    OrganizationService organizationService;
    /**
     * 获取到所有传统企业
     */
    @RequestMapping(value = "/findAllConstructionEns", method = RequestMethod.GET)
    public List<ConstructionEn> findConstructionEn()throws Exception {
        List<ConstructionEn> constructionEns = constructionEnService.findAllT();
        return constructionEns;
    }

    //实现分页 获取所有传统企业
    @RequestMapping(value = "/displayAllConstructionEns", method = RequestMethod.GET)
    public Map<String, Object> findAllConstructionEn(@RequestParam(value = "page") Integer page, @RequestParam(value = "rows") Integer size)throws Exception {
        Page<ConstructionEn> list = this.constructionEnService.findAllT(new PageRequest(page - 1, size));
        Map<String, Object> map = new HashMap<String, Object>();
        int total = this.constructionEnService.findAllT().size();
        map.put("total", total);
        map.put("rows", list.getContent());
        return map;
    }

    //实现分页 获取非传统企业
    @RequestMapping(value = "/displayOrganizations", method = RequestMethod.GET)
    public Map<String, Object> findAllOranization(@RequestParam(value = "page") Integer page, @RequestParam(value = "rows") Integer size)throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        Page<Organization> listO = this.organizationService.findAllT(new PageRequest(page - 1, size));
        Page<ConstructionEn> listC = this.constructionEnService.findAllT(new PageRequest(page - 1, size));
        List<Organization> organizations = this.organizationService.findAllT();
        List<ConstructionEn> constructionEns = this.constructionEnService.findAllT();
        organizations.removeAll(constructionEns);
//        for(){
//            listO.
//        }
        int totalC = this.constructionEnService.findAllT().size();
        int totalO = this.organizationService.findAllT().size();
        map.put("total", totalO-totalC);
        map.put("rows", listO.getContent());
        return map;
    }
}
