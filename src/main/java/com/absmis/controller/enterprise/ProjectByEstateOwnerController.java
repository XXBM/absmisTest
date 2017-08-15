package com.absmis.controller.enterprise;

import com.absmis.domain.enterprise.ProjectByEstateOwner;
import com.absmis.service.enterprise.ProjectByEstateOwnerService;
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
public class ProjectByEstateOwnerController {
    @Autowired
    ProjectByEstateOwnerService projectByEstateOwnerService;

    //添加
    @RequestMapping(value = "/addProjectByEstateOwner", method = RequestMethod.POST)
    public Map<String, Object> addProjectByEstateOwner(@RequestBody ProjectByEstateOwner projectByEstateOwner)throws Exception {
        this.projectByEstateOwnerService.addProjectByEstateOwner(projectByEstateOwner);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("projectByEstateOwner", projectByEstateOwner);
        return map;
    }

    /**
     * 获取到所有
     */
    @RequestMapping(value = "/findAllProjectByEstateOwners", method = RequestMethod.GET)
    public List<ProjectByEstateOwner> findProjectByEstateOwner()throws Exception {
        List<ProjectByEstateOwner> projectByEstateOwners = projectByEstateOwnerService.findAllT();
        return projectByEstateOwners;
    }


    //实现分页
    @RequestMapping(value = "/displayAllProjectByEstateOwners", method = RequestMethod.GET)
    public Map<String, Object> findAllProjectByEstateOwner(@RequestParam(value = "page") Integer page, @RequestParam(value = "rows") Integer size)throws Exception {
        Page<ProjectByEstateOwner> list = this.projectByEstateOwnerService.findAllT(new PageRequest(page - 1, size));
        Map<String, Object> map = new HashMap<String, Object>();
        int total = this.projectByEstateOwnerService.findAllT().size();
        map.put("total", total);
        map.put("rows", list.getContent());
        return map;
    }

    //修改学院信息    完成 改
    @RequestMapping(value = "/updateProjectByEstateOwner", method = RequestMethod.PUT)
    public Map<String, Object> updateProjectByEstateOwner(@RequestBody ProjectByEstateOwner projectByEstateOwner)throws Exception {
        this.projectByEstateOwnerService.updateProjectByEstateOwner(projectByEstateOwner);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("projectByEstateOwner", projectByEstateOwner);
        return map;
    }

    //删除一个学院   完成 删
    @RequestMapping(value = "/deleteProjectByEstateOwner", method = RequestMethod.DELETE)
    public void deleteProjectByEstateOwner(@RequestParam("id") Long id)throws Exception {
        this.projectByEstateOwnerService.deleteProjectByEstateOwner(id);
    }


    //批量删除   完成 删
    @RequestMapping(value = "/deleteProjectByEstateOwners",method = RequestMethod.DELETE)
    public void deleteProjectByEstateOwners(@RequestParam("ids") String ids){
        String deleteIds[] = ids.split(",");
        for(int i = 0; i<deleteIds.length; i++){
            this.projectByEstateOwnerService.deleteById(Long.parseLong(deleteIds[i]));
        }
    }
}