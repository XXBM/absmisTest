package com.absmis.service.enterprise;


import com.absmis.domain.enterprise.Builder;
import com.absmis.repository.enterprise.BuilderRepository;
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
public class BuilderService extends BasicService<Builder, Long> {
    @Autowired
    BuilderRepository builderRepository;
    /*增加*/
    public void addBuilder(Builder builder){
        this.builderRepository.save(builder);
    }

    /*修改*/
    public void updateBuilder(Builder builder){
        this.builderRepository.saveAndFlush(builder);}

    /*findById*/
    public Builder findById(Long id){
        return builderRepository.findOne(id);
    }

    /*删除*/
    public void deleteBuilder(Long id){
        this.builderRepository.delete(id);
    }

    //分页显示
    public Page<Builder> findAll(Pageable pageable){
        return this.builderRepository.findAll(pageable);
    }

    /**
     * 多条件查询
     */
    public Page<Builder> findBySepc(Specification<Builder> specification, Pageable pageable) {
        return this.builderRepository.findAll(specification, pageable);
    }

    /**
     * 多条件查询
     */
    public List<Builder> findBySepc(Specification<Builder> specification) {
        return this.builderRepository.findAll(specification);
    }
    public List<Builder> findBySepc(Specification<Builder> specification, Sort sort) {
        return this.builderRepository.findAll(specification,sort);
    }

    public Specification<Builder> queryName(String property){
        return new Specification<Builder>() {
            @Override
            public Predicate toPredicate(Root<Builder> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> predicate = new ArrayList<>();
                //条件一：查询在岗人员
                predicate.add(cb.like(root.get("name"),"%"+property+"%"));
                Predicate[] pre = new Predicate[predicate.size()];
                query.distinct(true);
                return query.where(predicate.toArray(pre)).getRestriction();
            }
        };
    }
}