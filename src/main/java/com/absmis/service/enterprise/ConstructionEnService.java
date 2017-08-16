package com.absmis.service.enterprise;


import com.absmis.domain.enterprise.ConstructionEn;
import com.absmis.repository.enterprise.ConstructionEnRepository;
import com.absmis.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xuling on 2016/10/11.
 */



@Service
public class ConstructionEnService extends BasicService<ConstructionEn, Long> {
    @Autowired
    ConstructionEnRepository constructionEnRepository;
    /**
     * 多条件查询
     */
    public Page<ConstructionEn> findBySepc(Specification<ConstructionEn> specification, Pageable pageable) {
        return this.constructionEnRepository.findAll(specification, pageable);
    }

    /**
     * 多条件查询
     */
    public List<ConstructionEn> findBySepc(Specification<ConstructionEn> specification) {
        return this.constructionEnRepository.findAll(specification);
    }
    public List<ConstructionEn> findBySepc(Specification<ConstructionEn> specification,Sort sort) {
        return this.constructionEnRepository.findAll(specification,sort);
    }
}