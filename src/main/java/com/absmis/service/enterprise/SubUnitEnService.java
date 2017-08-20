package com.absmis.service.enterprise;


import com.absmis.domain.enterprise.SubUnitEn;
import com.absmis.repository.enterprise.SubUnitEnRepository;
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
public class SubUnitEnService extends BasicService<SubUnitEn, Long> {
    @Autowired
    SubUnitEnRepository subUnitEnRepository;
    /*增加*/
    public void addSubUnitEn(SubUnitEn subUnitEn){
        this.subUnitEnRepository.save(subUnitEn);
    }

    /*修改*/
    public void updateSubUnitEn(SubUnitEn subUnitEn){
        this.subUnitEnRepository.saveAndFlush(subUnitEn);}

    /*findById*/
    public SubUnitEn findById(Long id){
        return subUnitEnRepository.findOne(id);
    }

    /*删除*/
    public void deleteSubUnitEn(Long id){
        this.subUnitEnRepository.delete(id);
    }

    //分页显示
    public Page<SubUnitEn> findAll(Pageable pageable){
        return this.subUnitEnRepository.findAll(pageable);
    }

    /**
     * 多条件查询
     */
    public Page<SubUnitEn> findBySepc(Specification<SubUnitEn> specification, Pageable pageable) {
        return this.subUnitEnRepository.findAll(specification, pageable);
    }

    /**
     * 多条件查询
     */
    public List<SubUnitEn> findBySepc(Specification<SubUnitEn> specification) {
        return this.subUnitEnRepository.findAll(specification);
    }
    public List<SubUnitEn> findBySepc(Specification<SubUnitEn> specification, Sort sort) {
        return this.subUnitEnRepository.findAll(specification,sort);
    }

    public Specification<SubUnitEn> findNoTra(String property){
        return new Specification<SubUnitEn>() {
            @Override
            public Predicate toPredicate(Root<SubUnitEn> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
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