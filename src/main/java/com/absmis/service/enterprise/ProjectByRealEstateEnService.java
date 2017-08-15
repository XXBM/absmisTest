package com.absmis.service.enterprise;


import com.absmis.domain.enterprise.ProjectByRealEstateEn;
import com.absmis.repository.enterprise.ProjectByRealEstateEnRepository;
import com.absmis.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by xuling on 2016/10/11.
 */

@Service
public class ProjectByRealEstateEnService extends BasicService<ProjectByRealEstateEn, Long> {
    @Autowired
    ProjectByRealEstateEnRepository projectByRealEstateEnRepository;
    /*增加*/
    public void addProjectByRealEstateEn(ProjectByRealEstateEn projectByRealEstateEn){
        this.projectByRealEstateEnRepository.save(projectByRealEstateEn);
    }

    /*修改*/
    public void updateProjectByRealEstateEn(ProjectByRealEstateEn projectByRealEstateEn){
        this.projectByRealEstateEnRepository.saveAndFlush(projectByRealEstateEn);}

    /*findById*/
    public ProjectByRealEstateEn findById(Long id){
        return projectByRealEstateEnRepository.findOne(id);
    }

    /*删除*/
    public void deleteProjectByRealEstateEn(Long id){
        this.projectByRealEstateEnRepository.delete(id);
    }

    //分页显示
    public Page<ProjectByRealEstateEn> findAll(Pageable pageable){
        return this.projectByRealEstateEnRepository.findAll(pageable);
    }

}