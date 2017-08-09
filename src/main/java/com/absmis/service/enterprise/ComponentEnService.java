package com.absmis.service.enterprise;


import com.absmis.domain.enterprise.ComponentEn;
import com.absmis.repository.enterprise.ComponentEnRepository;
import com.absmis.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xuling on 2016/10/11.
 */

@Service
public class ComponentEnService extends BasicService<ComponentEn, Long> {
    @Autowired
    ComponentEnRepository componentEnRepository;
    public void addComponentEn(ComponentEn componentEn){
        this.componentEnRepository.save(componentEn);
    }


}