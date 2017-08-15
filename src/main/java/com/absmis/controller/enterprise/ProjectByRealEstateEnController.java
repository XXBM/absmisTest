package com.absmis.controller.enterprise;

import com.absmis.domain.enterprise.ProjectByRealEstateEn;
import com.absmis.service.enterprise.ProjectByRealEstateEnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by xuling on 2016/10/11.
 */

@RestController
public class ProjectByRealEstateEnController {
    @Autowired
    ProjectByRealEstateEnService projectByRealEstateEnService;

    //添加
    @RequestMapping(value = "/addProjectByRealEstateEn", method = RequestMethod.POST)
    public Map<String, Object> addProjectByRealEstateEn(@RequestBody ProjectByRealEstateEn projectByRealEstateEn)throws Exception {
        this.projectByRealEstateEnService.addProjectByRealEstateEn(projectByRealEstateEn);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("projectByRealEstateEn", projectByRealEstateEn);
        return map;
    }

    /**
     * 获取到所有
     */
    @RequestMapping(value = "/findAllProjectByRealEstateEns", method = RequestMethod.GET)
    public List<ProjectByRealEstateEn> findProjectByRealEstateEn()throws Exception {
        List<ProjectByRealEstateEn> projectByRealEstateEns = projectByRealEstateEnService.findAllT();
        return projectByRealEstateEns;
    }


    //实现分页
    @RequestMapping(value = "/displayAllProjectByRealEstateEns", method = RequestMethod.GET)
    public Map<String, Object> findAllProjectByRealEstateEn(@RequestParam(value = "page") Integer page, @RequestParam(value = "rows") Integer size)throws Exception {
        Page<ProjectByRealEstateEn> list = this.projectByRealEstateEnService.findAllT(new PageRequest(page - 1, size));
        Map<String, Object> map = new HashMap<String, Object>();
        int total = this.projectByRealEstateEnService.findAllT().size();
        map.put("total", total);
        map.put("rows", list.getContent());
        return map;
    }

    //修改学院信息    完成 改
    @RequestMapping(value = "/updateProjectByRealEstateEn", method = RequestMethod.PUT)
    public Map<String, Object> updateProjectByRealEstateEn(@RequestBody ProjectByRealEstateEn projectByRealEstateEn)throws Exception {
        this.projectByRealEstateEnService.updateProjectByRealEstateEn(projectByRealEstateEn);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("projectByRealEstateEn", projectByRealEstateEn);
        return map;
    }

    //删除一个学院   完成 删
    @RequestMapping(value = "/deleteProjectByRealEstateEn", method = RequestMethod.DELETE)
    public void deleteProjectByRealEstateEn(@RequestParam("id") Long id)throws Exception {
        this.projectByRealEstateEnService.deleteProjectByRealEstateEn(id);
    }


    //批量删除   完成 删
    @RequestMapping(value = "/deleteProjectByRealEstateEns",method = RequestMethod.DELETE)
    public void deleteProjectByRealEstateEns(@RequestParam("ids") String ids){
        String deleteIds[] = ids.split(",");
        for(int i = 0; i<deleteIds.length; i++){
            this.projectByRealEstateEnService.deleteById(Long.parseLong(deleteIds[i]));
        }
    }
}
