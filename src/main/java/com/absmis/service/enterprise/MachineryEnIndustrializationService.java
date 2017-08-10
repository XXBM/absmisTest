package com.absmis.service.enterprise;


import com.absmis.domain.enterprise.MachineryEnIndustrialization;
import com.absmis.repository.enterprise.MachineryEnIndustrializationRepository;
import com.absmis.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MachineryEnIndustrializationService extends BasicService<MachineryEnIndustrialization, Long> {
    @Autowired
    MachineryEnIndustrializationRepository machineryEnIndustrializationRepository;
    /*增加*/
    public void addMachineryEnIndustrialization(MachineryEnIndustrialization machineryEnIndustrialization){
        this.machineryEnIndustrializationRepository.save(machineryEnIndustrialization);
    }

    /*修改*/
    public void updateMachineryEnIndustrialization(MachineryEnIndustrialization machineryEnIndustrialization){
        this.machineryEnIndustrializationRepository.saveAndFlush(machineryEnIndustrialization);}

    /*findById*/
    public MachineryEnIndustrialization findById(Long id){
        return machineryEnIndustrializationRepository.findOne(id);
    }

    /*删除*/
    public void deleteMachineryEnIndustrialization(Long id){
        this.machineryEnIndustrializationRepository.delete(id);
    }

    //分页显示
    public Page<MachineryEnIndustrialization> findAll(Pageable pageable){
        return this.machineryEnIndustrializationRepository.findAll(pageable);
    }

}