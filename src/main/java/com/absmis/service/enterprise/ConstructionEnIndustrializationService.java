package com.absmis.service.enterprise;


import com.absmis.domain.enterprise.ConstructionEnIndustrialization;
import com.absmis.repository.enterprise.ConstructionEnIndustrializationRepository;
import com.absmis.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

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

}