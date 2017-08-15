package com.absmis.service.enterprise;


import com.absmis.domain.enterprise.ProjectByEstateOwner;
import com.absmis.repository.enterprise.ProjectByEstateOwnerRepository;
import com.absmis.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by xuling on 2016/10/11.
 */

@Service
public class ProjectByEstateOwnerService extends BasicService<ProjectByEstateOwner, Long> {
    @Autowired
    ProjectByEstateOwnerRepository projectByEstateOwnerRepository;
    /*增加*/
    public void addProjectByEstateOwner(ProjectByEstateOwner projectByEstateOwner){
        this.projectByEstateOwnerRepository.save(projectByEstateOwner);
    }

    /*修改*/
    public void updateProjectByEstateOwner(ProjectByEstateOwner projectByEstateOwner){
        this.projectByEstateOwnerRepository.saveAndFlush(projectByEstateOwner);}

    /*findById*/
    public ProjectByEstateOwner findById(Long id){
        return projectByEstateOwnerRepository.findOne(id);
    }

    /*删除*/
    public void deleteProjectByEstateOwner(Long id){
        this.projectByEstateOwnerRepository.delete(id);
    }

    //分页显示
    public Page<ProjectByEstateOwner> findAll(Pageable pageable){
        return this.projectByEstateOwnerRepository.findAll(pageable);
    }

}