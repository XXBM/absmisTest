package com.absmis.service.enterprise;


import com.absmis.domain.enterprise.Project;
import com.absmis.repository.enterprise.ProjectRepository;
import com.absmis.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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


    /**
     * 多条件查询
     */
    public Page<Project> findBySepc(Specification<Project> specification, Pageable pageable) {
        return this.projectRepository.findAll(specification, pageable);
    }

    /**
     * 多条件查询
     */
    public List<Project> findBySepc(Specification<Project> specification) {
        return this.projectRepository.findAll(specification);
    }
    public List<Project> findBySepc(Specification<Project> specification, Sort sort) {
        return this.projectRepository.findAll(specification,sort);
    }


    public Specification<Project> queryProject(
            String startTime,
            String endTime){
        return new Specification<Project>() {
            @Override
            public Predicate toPredicate(Root<Project> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> predicate = new ArrayList<>();
                if (startTime!=""&& startTime!="Invalid date" && startTime != new SimpleDateFormat("yyyy-MM-dd").format(new Date())){
                    predicate.add(cb.greaterThanOrEqualTo(root.get("startingTime").as(String.class), startTime));
                }
                if(endTime!=""&& startTime!="Invalid date" && startTime != new SimpleDateFormat("yyyy-MM-dd").format(new Date())){
                    predicate.add(cb.lessThanOrEqualTo(root.get("startingTime").as(String.class), endTime));
                }
                Predicate[] pre = new Predicate[predicate.size()];
                query.distinct(true);
                return query.where(predicate.toArray(pre)).getRestriction();
            }
        };
    }


}