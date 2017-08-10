package com.absmis.service.enterprise;


import com.absmis.domain.enterprise.SubUnitEnIndustrialization;
import com.absmis.repository.enterprise.SubUnitEnIndustrializationRepository;
import com.absmis.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SubUnitEnIndustrializationService extends BasicService<SubUnitEnIndustrialization, Long> {
    @Autowired
    SubUnitEnIndustrializationRepository subUnitEnIndustrializationRepository;
    /*增加*/
    public void addSubUnitEnIndustrialization(SubUnitEnIndustrialization subUnitEnIndustrialization){
        this.subUnitEnIndustrializationRepository.save(subUnitEnIndustrialization);
    }

    /*修改*/
    public void updateSubUnitEnIndustrialization(SubUnitEnIndustrialization subUnitEnIndustrialization){
        this.subUnitEnIndustrializationRepository.saveAndFlush(subUnitEnIndustrialization);}

    /*findById*/
    public SubUnitEnIndustrialization findById(Long id){
        return subUnitEnIndustrializationRepository.findOne(id);
    }

    /*删除*/
    public void deleteSubUnitEnIndustrialization(Long id){
        this.subUnitEnIndustrializationRepository.delete(id);
    }

    //分页显示
    public Page<SubUnitEnIndustrialization> findAll(Pageable pageable){
        return this.subUnitEnIndustrializationRepository.findAll(pageable);
    }

}