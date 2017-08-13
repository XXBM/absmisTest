package com.absmis.service.enterprise;


import com.absmis.domain.enterprise.Project;
import com.absmis.repository.enterprise.ProjectRepository;
import com.absmis.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by xuling on 2016/10/11.
 */

@Service
public class ProjectService extends BasicService<Project, Long> {
    @Autowired
    ProjectRepository projectRepository;
    /*增加*/
    public void addProject(Project project){
        this.projectRepository.save(project);
    }

    /*修改*/
    public void updateProject(Project project){
        this.projectRepository.saveAndFlush(project);}

    /*findById*/
    public Project findById(Long id){
        return projectRepository.findOne(id);
    }

    /*删除*/
    public void deleteProject(Long id){
        this.projectRepository.delete(id);
    }

    //分页显示
    public Page<Project> findAll(Pageable pageable){
        return this.projectRepository.findAll(pageable);
    }

}