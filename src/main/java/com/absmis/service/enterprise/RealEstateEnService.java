package com.absmis.service.enterprise;


import com.absmis.domain.enterprise.RealEstateEn;
import com.absmis.repository.enterprise.RealEstateEnRepository;
import com.absmis.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by xuling on 2016/10/11.
 */

@Service
public class RealEstateEnService extends BasicService<RealEstateEn, Long> {
    @Autowired
    RealEstateEnRepository realEstateEnRepository;
    /*增加*/
    public void addRealEstateEn(RealEstateEn realEstateEn){
        this.realEstateEnRepository.save(realEstateEn);
    }

    /*修改*/
    public void updateRealEstateEn(RealEstateEn realEstateEn){
        this.realEstateEnRepository.saveAndFlush(realEstateEn);}

    /*findById*/
    public RealEstateEn findById(Long id){
        return realEstateEnRepository.findOne(id);
    }

    /*删除*/
    public void deleteRealEstateEn(Long id){
        this.realEstateEnRepository.delete(id);
    }

    //分页显示
    public Page<RealEstateEn> findAll(Pageable pageable){
        return this.realEstateEnRepository.findAll(pageable);
    }

}