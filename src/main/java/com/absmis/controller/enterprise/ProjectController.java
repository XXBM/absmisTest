package com.absmis.controller.enterprise;

import com.absmis.domain.enterprise.Project;
import com.absmis.service.enterprise.ProjectService;
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
public class ProjectController {
    @Autowired
    ProjectService projectService;

    //添加
    @RequestMapping(value = "/addProject", method = RequestMethod.POST)
    public Map<String, Object> addProject(@RequestBody Project project)throws Exception {
        this.projectService.addProject(project);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("project", project);
        return map;
    }

    /**
     * 获取到所有
     */
    @RequestMapping(value = "/findAllProjects", method = RequestMethod.GET)
    public List<Project> findProject()throws Exception {
        List<Project> projects = projectService.findAllT();
        return projects;
    }


    //实现分页
    @RequestMapping(value = "/displayAllProjects", method = RequestMethod.GET)
    public Map<String, Object> findAllProject(@RequestParam(value = "page") Integer page, @RequestParam(value = "rows") Integer size)throws Exception {
        Page<Project> list = this.projectService.findAllT(new PageRequest(page - 1, size));
        Map<String, Object> map = new HashMap<String, Object>();
        int total = this.projectService.findAllT().size();
        map.put("total", total);
        map.put("rows", list.getContent());
        return map;
    }

    //实现分页
//    @RequestMapping(value = "/displayAllProjectsByEn", method = RequestMethod.GET)
//    public Map<String, Object> findAllProjectsByEn(@RequestParam(value = "page") Integer page, @RequestParam(value = "rows") Integer size)throws Exception {
//        Page<Project> list = this.projectService.findAllT(new PageRequest(page - 1, size));
//        Map<String, Object> map = new HashMap<String, Object>();
//        int total = this.projectService.findAllT().size();
//        map.put("total", total);
//        map.put("rows", list.getContent());
//        return map;
//    }

    //修改学院信息    完成 改
    @RequestMapping(value = "/updateProject", method = RequestMethod.PUT)
    public Map<String, Object> updateProject(@RequestBody Project project)throws Exception {
        this.projectService.updateProject(project);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("project", project);
        return map;
    }

    //删除一个学院   完成 删
    @RequestMapping(value = "/deleteProject", method = RequestMethod.DELETE)
    public void deleteProject(@RequestParam("id") Long id)throws Exception {
        this.projectService.deleteProject(id);
    }


    //批量删除   完成 删
    @RequestMapping(value = "/deleteProjects",method = RequestMethod.DELETE)
    public void deleteProjects(@RequestParam("ids") String ids){
        String deleteIds[] = ids.split(",");
        for(int i = 0; i<deleteIds.length; i++){
            this.projectService.deleteById(Long.parseLong(deleteIds[i]));
        }
    }
}
