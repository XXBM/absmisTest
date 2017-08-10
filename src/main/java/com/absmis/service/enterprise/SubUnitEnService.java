package com.absmis.service.enterprise;


import com.absmis.domain.enterprise.SubUnitEn;
import com.absmis.repository.enterprise.SubUnitEnRepository;
import com.absmis.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

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

}