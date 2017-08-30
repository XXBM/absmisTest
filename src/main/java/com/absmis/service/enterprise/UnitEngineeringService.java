package com.absmis.service.enterprise;


import com.absmis.domain.enterprise.UnitEngineering;
import com.absmis.repository.enterprise.UnitEngineeringRepository;
import com.absmis.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class UnitEngineeringService extends BasicService<UnitEngineering, Long> {
    @Autowired
    UnitEngineeringRepository unitEngineeringRepository;

    public Page<UnitEngineering> findByProjectId(Long id, Pageable pageable) {
        return this.unitEngineeringRepository.findByProjectId(id, pageable);
    }
    public List<UnitEngineering> findByProjectId(Long id) {
        return this.unitEngineeringRepository.findByProjectId(id);
    }

    /*增加*/
    public void addUnitEngineering(UnitEngineering unitEngineering){
        this.unitEngineeringRepository.save(unitEngineering);
    }

    /*修改*/
    public void updateUnitEngineering(UnitEngineering unitEngineering){
        this.unitEngineeringRepository.saveAndFlush(unitEngineering);}

    /*findById*/
    public UnitEngineering findById(Long id){
        return unitEngineeringRepository.findOne(id);
    }

    /*删除*/
    public void deleteUnitEngineering(Long id){
        this.unitEngineeringRepository.delete(id);
    }

    //分页显示
    public Page<UnitEngineering> findAll(Pageable pageable){
        return this.unitEngineeringRepository.findAll(pageable);
    }

}