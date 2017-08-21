package com.absmis.service.enterprise;


import com.absmis.domain.enterprise.ConstructionEnIndustrialization;
import com.absmis.repository.enterprise.ConstructionEnIndustrializationRepository;
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
public class ConstructionEnIndustrializationService extends BasicService<ConstructionEnIndustrialization, Long> {
    @Autowired
    ConstructionEnIndustrializationRepository constructionEnIndustrializationRepository;
    /*增加*/
    public void addConstructionEnIndustrialization(ConstructionEnIndustrialization constructionEnIndustrialization){
        this.constructionEnIndustrializationRepository.save(constructionEnIndustrialization);
    }

    /*修改*/
    public void updateConstructionEnIndustrialization(ConstructionEnIndustrialization constructionEnIndustrialization){
        this.constructionEnIndustrializationRepository.saveAndFlush(constructionEnIndustrialization);}

    /*findById*/
    public ConstructionEnIndustrialization findById(Long id){
        return constructionEnIndustrializationRepository.findOne(id);
    }

    /*删除*/
    public void deleteConstructionEnIndustrialization(Long id){
        this.constructionEnIndustrializationRepository.delete(id);
    }

    //分页显示
    public Page<ConstructionEnIndustrialization> findAll(Pageable pageable){
        return this.constructionEnIndustrializationRepository.findAll(pageable);
    }

    /**
     * 多条件查询
     */
    public Page<ConstructionEnIndustrialization> findBySepc(Specification<ConstructionEnIndustrialization> specification, Pageable pageable) {
        return this.constructionEnIndustrializationRepository.findAll(specification, pageable);
    }

    /**
     * 多条件查询
     */
    public List<ConstructionEnIndustrialization> findBySepc(Specification<ConstructionEnIndustrialization> specification) {
        return this.constructionEnIndustrializationRepository.findAll(specification);
    }
    public List<ConstructionEnIndustrialization> findBySepc(Specification<ConstructionEnIndustrialization> specification, Sort sort) {
        return this.constructionEnIndustrializationRepository.findAll(specification,sort);
    }


    public Specification<ConstructionEnIndustrialization> queryEnIndustrialization(
            Long id,
            String startTime,
            String endTime){
        return new Specification<ConstructionEnIndustrialization>() {
            @Override
            public Predicate toPredicate(Root<ConstructionEnIndustrialization> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> predicate = new ArrayList<>();
                //条件一：查询在岗人员
                predicate.add(cb.equal(root.get("constructionEn"), id));
                if (startTime!=""){
                    predicate.add(cb.greaterThanOrEqualTo(root.get("declareTime").as(String.class), startTime));
                }
                if(endTime!=""){
                    predicate.add(cb.lessThanOrEqualTo(root.get("declareTime").as(String.class), endTime));
                }
                Predicate[] pre = new Predicate[predicate.size()];
                query.distinct(true);
                return query.where(predicate.toArray(pre)).getRestriction();
            }
        };
    }

    public Specification<ConstructionEnIndustrialization> queryIndustrialization(
            String name,
            String startTime,
            String endTime){
        return new Specification<ConstructionEnIndustrialization>() {
            @Override
            public Predicate toPredicate(Root<ConstructionEnIndustrialization> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> predicate = new ArrayList<>();
                //条件一：查询在岗人员
                if (name!=""){
                    predicate.add(cb.like(root.get("constructionEn").get("name"),"%"+name+"%"));
                }
                if (startTime!=""){
                    predicate.add(cb.greaterThanOrEqualTo(root.get("declareTime").as(String.class), startTime));
                }
                if(endTime!=""){
                    predicate.add(cb.lessThanOrEqualTo(root.get("declareTime").as(String.class), endTime));
                }
                Predicate[] pre = new Predicate[predicate.size()];
                query.distinct(true);
                return query.where(predicate.toArray(pre)).getRestriction();
            }
        };
    }



}