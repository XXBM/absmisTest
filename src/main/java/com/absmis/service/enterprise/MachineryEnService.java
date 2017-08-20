package com.absmis.service.enterprise;


import com.absmis.domain.enterprise.MachineryEn;
import com.absmis.repository.enterprise.MachineryEnRepository;
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
import java.util.ArrayList;
import java.util.List;

@Service
public class MachineryEnService extends BasicService<MachineryEn, Long> {
    @Autowired
    MachineryEnRepository machineryEnRepository;
    /*增加*/
    public void addMachineryEn(MachineryEn machineryEn){
        this.machineryEnRepository.save(machineryEn);
    }

    /*修改*/
    public void updateMachineryEn(MachineryEn machineryEn){
        this.machineryEnRepository.saveAndFlush(machineryEn);}

    /*findById*/
    public MachineryEn findById(Long id){
        return machineryEnRepository.findOne(id);
    }

    /*删除*/
    public void deleteMachineryEn(Long id){
        this.machineryEnRepository.delete(id);
    }

    //分页显示
    public Page<MachineryEn> findAll(Pageable pageable){
        return this.machineryEnRepository.findAll(pageable);
    }

    /**
     * 多条件查询
     */
    public Page<MachineryEn> findBySepc(Specification<MachineryEn> specification, Pageable pageable) {
        return this.machineryEnRepository.findAll(specification, pageable);
    }

    /**
     * 多条件查询
     */
    public List<MachineryEn> findBySepc(Specification<MachineryEn> specification) {
        return this.machineryEnRepository.findAll(specification);
    }
    public List<MachineryEn> findBySepc(Specification<MachineryEn> specification, Sort sort) {
        return this.machineryEnRepository.findAll(specification,sort);
    }

    public Specification<MachineryEn> queryName(String property){
        return new Specification<MachineryEn>() {
            @Override
            public Predicate toPredicate(Root<MachineryEn> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> predicate = new ArrayList<>();
                //条件一：查询在岗人员
                predicate.add(cb.like(root.get("name"),property));
                Predicate[] pre = new Predicate[predicate.size()];
                query.distinct(true);
                return query.where(predicate.toArray(pre)).getRestriction();
            }
        };
    }

}