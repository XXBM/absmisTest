package com.absmis.service.enterprise;


import com.absmis.domain.enterprise.ComponentEnIndustrialization;
import com.absmis.repository.enterprise.ComponentEnIndustrializationRepository;
import com.absmis.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by xuling on 2016/10/11.
 */

@Service
public class ComponentEnIndustrializationService extends BasicService<ComponentEnIndustrialization, Long> {
    @Autowired
    ComponentEnIndustrializationRepository componentEnIndustrializationRepository;
    /*增加*/
    public void addComponentEnIndustrialization(ComponentEnIndustrialization componentEnIndustrialization){
        this.componentEnIndustrializationRepository.save(componentEnIndustrialization);
    }

    /*修改*/
    public void updateComponentEnIndustrialization(ComponentEnIndustrialization componentEnIndustrialization){
        this.componentEnIndustrializationRepository.saveAndFlush(componentEnIndustrialization);}

    /*findById*/
    public ComponentEnIndustrialization findById(Long id){
        return componentEnIndustrializationRepository.findOne(id);
    }

    /*删除*/
    public void deleteComponentEnIndustrialization(Long id){
        this.componentEnIndustrializationRepository.delete(id);
    }

    //分页显示
    public Page<ComponentEnIndustrialization> findAll(Pageable pageable){
        return this.componentEnIndustrializationRepository.findAll(pageable);
    }

}