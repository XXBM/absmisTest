package com.absmis.service.enterprise;


import com.absmis.domain.enterprise.ComponentEn;
import com.absmis.repository.enterprise.ComponentEnRepository;
import com.absmis.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by xuling on 2016/10/11.
 */

@Service
public class ComponentEnService extends BasicService<ComponentEn, Long> {
    @Autowired
    ComponentEnRepository componentEnRepository;
    /*增加*/
    public void addComponentEn(ComponentEn componentEn){
        this.componentEnRepository.save(componentEn);
    }

    /*修改*/
    public void updateComponentEn(ComponentEn componentEn){
        this.componentEnRepository.saveAndFlush(componentEn);}

    /*findById*/
    public ComponentEn findById(Long id){
        return componentEnRepository.findOne(id);
    }

    /*删除*/
    public void deleteComponentEn(Long id){
        this.componentEnRepository.delete(id);
    }

    //分页显示
    public Page<ComponentEn> findAll(Pageable pageable){
        return this.componentEnRepository.findAll(pageable);
    }

}