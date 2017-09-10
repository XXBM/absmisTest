package com.absmis.controller.enterprise;

import com.absmis.domain.enterprise.*;
import com.absmis.domain.message.ConstructionEnInfo;
import com.absmis.service.enterprise.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ConstructionEnController {
    @Autowired
    ConstructionEnService constructionEnService;
    @Autowired
    OrganizationService organizationService;
    @Autowired
    CheckedStatusService checkedStatusService;
    @Autowired
    RealEstateEnService realEstateEnService;
    @Autowired
    DesignerService designerService;
    @Autowired
    BuilderService builderService;
    @Autowired
    ConstructionEnIndustrializationService constructionEnIndustrializationService;



    //根据企业和申报起止时间查询
    @RequestMapping(value = "/querytjConstructionEn", method = RequestMethod.GET)
    public List<ConstructionEnInfo> queryConstructionEn(
            @RequestParam(value = "year") Integer year,
            @RequestParam(value = "quarter")Integer quarter
    )throws Exception{
        //TODO 从事装配式建筑规模累计量
        Specification<RealEstateEn> realEstateEnSpecification = this.realEstateEnService.queryByCumulant();
        List<RealEstateEn> realEstateEns = realEstateEnService.findBySepc(realEstateEnSpecification);
        Specification<RealEstateEn> realEstateEnSpecificationM = this.realEstateEnService.queryByAnnualCumulant(year,quarter);
        List<RealEstateEn> realEstateEnsM = realEstateEnService.findBySepc(realEstateEnSpecificationM);
        double totalScaleR = 0;
        for(int i=0;i<realEstateEns.size();i++){
            ConstructionEnIndustrialization constructionEnIndustrialization =constructionEnIndustrializationService.getByConstructionEnIdAndYearAndQuarter(realEstateEns.get(i).getId(),year,quarter);
            totalScaleR += constructionEnIndustrialization.getTotalScale();
        }
        for(int i=0;i<realEstateEnsM.size();i++){
            ConstructionEnIndustrialization constructionEnIndustrialization =constructionEnIndustrializationService.getByConstructionEnIdAndYearAndQuarter(realEstateEnsM.get(i).getId(),year,quarter);
            totalScaleR += constructionEnIndustrialization.getTotalScale();
        }
        Specification<Builder> builderSpecification = this.builderService.queryByCumulant();
        List<Builder> builders = builderService.findBySepc(builderSpecification);
        Specification<Builder> builderSpecificationM = this.builderService.queryByAnnualCumulant(year,quarter);
        List<Builder> buildersM = builderService.findBySepc(builderSpecificationM);
        double totalScaleB = 0;
        for(int i=0;i<builders.size();i++){
            ConstructionEnIndustrialization constructionEnIndustrialization =constructionEnIndustrializationService.getByConstructionEnIdAndYearAndQuarter(builders.get(i).getId(),year,quarter);
            totalScaleB += constructionEnIndustrialization.getTotalScale();
        }
        for(int i=0;i<buildersM.size();i++){
            ConstructionEnIndustrialization constructionEnIndustrialization =constructionEnIndustrializationService.getByConstructionEnIdAndYearAndQuarter(buildersM.get(i).getId(),year,quarter);
            totalScaleB += constructionEnIndustrialization.getTotalScale();
        }
        Specification<Designer> designerSpecification = this.designerService.queryByCumulant();
        List<Designer> designers = designerService.findBySepc(designerSpecification);
        Specification<Designer> designerSpecificationM = this.designerService.queryByAnnualCumulant(year,quarter);
        List<Designer> designersM = designerService.findBySepc(designerSpecificationM);
        double totalScaleD = 0;
        for(int i=0;i<designers.size();i++){
            ConstructionEnIndustrialization constructionEnIndustrialization =constructionEnIndustrializationService.getByConstructionEnIdAndYearAndQuarter(designers.get(i).getId(),year,quarter);
            totalScaleD += constructionEnIndustrialization.getTotalScale();
        }
        for(int i=0;i<designersM.size();i++){
            ConstructionEnIndustrialization constructionEnIndustrialization =constructionEnIndustrializationService.getByConstructionEnIdAndYearAndQuarter(designersM.get(i).getId(),year,quarter);
            totalScaleD += constructionEnIndustrialization.getTotalScale();
        }
        List<ConstructionEnInfo> constructionEnInfos = new ArrayList<>();
        ConstructionEnInfo integralWallEnInfo = new ConstructionEnInfo("房地产开发企业",(double)(realEstateEns.size()+realEstateEnsM.size()),totalScaleR);
        constructionEnInfos.add(integralWallEnInfo);
        ConstructionEnInfo integrativeExternalWallEnInfo = new ConstructionEnInfo("施工单位",(double)(builders.size()+buildersM.size()),totalScaleB);
        constructionEnInfos.add(integrativeExternalWallEnInfo);
        ConstructionEnInfo prebuiltStairsEnInfo = new ConstructionEnInfo("设计单位",(double)(designers.size()+designersM.size()),totalScaleD);
        constructionEnInfos.add(prebuiltStairsEnInfo);
        return constructionEnInfos;
    }


    //根据企业名称模糊查询
    @RequestMapping(value = "/queryConstructionEnByName", method = RequestMethod.GET)
    public Map<String, Object> queryConstructionEnByName(
            @RequestParam(value = "nameQuery") String query,
            @RequestParam(value = "page") Integer page,
            @RequestParam(value = "rows") Integer size)throws Exception {
        Pageable pageable = new PageRequest(page-1,size);
        Specification<ConstructionEn> specification = this.constructionEnService.queryName(query);
        Page<ConstructionEn> list = this.constructionEnService.findBySepc(specification,pageable);
        Map<String, Object> map = new HashMap<String, Object>();
        int total = this.constructionEnService.findBySepc(specification).size();
        map.put("total", total);
        map.put("rows", list.getContent());
        return map;
    }
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

    //非传统企业审核信息    完成 改
    @RequestMapping(value = "/updateTraditionalEn", method = RequestMethod.POST)
    public Map<String, Object> updateTraditionalEn(
            @RequestParam("id") Long id,
            @RequestParam("checkedStatusId") Long checkedId
    )throws Exception {
        Organization organization = organizationService.findOne(id);
        organization.setCheckedStatus(checkedStatusService.findOne(checkedId));
        this.organizationService.update(organization);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("project", organization);
        return map;
    }

    //实现分页 获取非传统企业
    @RequestMapping(value = "/displayOrganizations", method = RequestMethod.GET)
    public Map<String, Object> findAllOranization(@RequestParam(value = "page") Integer page, @RequestParam(value = "rows") Integer size)throws Exception {
        List<Organization> organizations = organizationService.findAllT();
        List<ConstructionEn> constructionEns = constructionEnService.findAllT();
        organizations.removeAll(constructionEns);
        List<Long> property = new ArrayList<>();
        for(int i=0;i<organizations.size();i++){
            property.add(organizations.get(i).getId());
        }
        Map<String, Object> map = new HashMap<String, Object>();
        Pageable pageable = new PageRequest(page-1,size);
        Specification<Organization> specification = this.organizationService.findNoTra(property);
        Page<Organization> list = this.organizationService.findBySepc(specification,pageable);
        int total = this.organizationService.findBySepc(specification).size();
        map.put("total", total);
        map.put("rows", list.getContent());
        return map;
    }

    //模糊查询 获取非传统企业
    @RequestMapping(value = "/queryOrganizations", method = RequestMethod.GET)
    public Map<String, Object> findAllOranization(
            @RequestParam(value = "queryName") String name,
            @RequestParam(value = "page") Integer page,
            @RequestParam(value = "rows") Integer size)throws Exception {
        List<Organization> organizations = organizationService.findAllT();
        List<ConstructionEn> constructionEns = constructionEnService.findAllT();
        organizations.removeAll(constructionEns);
        List<Long> property = new ArrayList<>();
        for(int i=0;i<organizations.size();i++){
            property.add(organizations.get(i).getId());
        }
        Map<String, Object> map = new HashMap<String, Object>();
        Pageable pageable = new PageRequest(page-1,size);
        Specification<Organization> specification = this.organizationService.findNoTraAndQueryName(property,name);
        Page<Organization> list = this.organizationService.findBySepc(specification,pageable);
        int total = this.organizationService.findBySepc(specification).size();
        map.put("total", total);
        map.put("rows", list.getContent());
        return map;
    }
}
