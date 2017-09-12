package com.absmis.service.enterprise;


import com.absmis.domain.enterprise.Supervisor;
import com.absmis.repository.enterprise.SupervisorRepository;
import com.absmis.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SupervisorService extends BasicService<Supervisor, Long> {
    @Autowired
    SupervisorRepository supervisorRepository;

    /*增加*/
    public void addSupervisor(Supervisor supervisor){
        this.supervisorRepository.save(supervisor);
    }

    /*修改*/
    public void updateSupervisor(Supervisor supervisor){
        this.supervisorRepository.saveAndFlush(supervisor);}

    /*findById*/
    public Supervisor findById(Long id){
        return supervisorRepository.findOne(id);
    }

    /*删除*/
    public void deleteSupervisor(Long id){
        this.supervisorRepository.delete(id);
    }

    //分页显示
    public Page<Supervisor> findAll(Pageable pageable){
        return this.supervisorRepository.findAll(pageable);
    }


    /**
     * 多条件查询
     */
    public Page<Supervisor> findBySepc(Specification<Supervisor> specification, Pageable pageable) {
        return this.supervisorRepository.findAll(specification, pageable);
    }

    /**
     * 多条件查询
     */
    public List<Supervisor> findBySepc(Specification<Supervisor> specification) {
        return this.supervisorRepository.findAll(specification);
    }
    public List<Supervisor> findBySepc(Specification<Supervisor> specification, Sort sort) {
        return this.supervisorRepository.findAll(specification,sort);
    }
}