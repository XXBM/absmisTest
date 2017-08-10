package com.absmis.service.enterprise;


import com.absmis.domain.enterprise.EstateOwner;
import com.absmis.repository.enterprise.EstateOwnerRepository;
import com.absmis.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EstateOwnerService extends BasicService<EstateOwner, Long> {
    @Autowired
    EstateOwnerRepository estateOwnerRepository;
    /*增加*/
    public void addEstateOwner(EstateOwner estateOwner){
        this.estateOwnerRepository.save(estateOwner);
    }

    /*修改*/
    public void updateEstateOwner(EstateOwner estateOwner){
        this.estateOwnerRepository.saveAndFlush(estateOwner);}

    /*findById*/
    public EstateOwner findById(Long id){
        return estateOwnerRepository.findOne(id);
    }

    /*删除*/
    public void deleteEstateOwner(Long id){
        this.estateOwnerRepository.delete(id);
    }

    //分页显示
    public Page<EstateOwner> findAll(Pageable pageable){
        return this.estateOwnerRepository.findAll(pageable);
    }

}