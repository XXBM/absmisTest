package com.absmis.service.enterprise;


import com.absmis.domain.enterprise.MachineryEn;
import com.absmis.repository.enterprise.MachineryEnRepository;
import com.absmis.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MachineryEnService extends BasicService<MachineryEn, Long> {
    @Autowired
    MachineryEnRepository machineryEnRepository;
    /*增加*/
    public void addMachineryEn(MachineryEn machineryEn){
        this.machineryEnRepository.save(machineryEn);
    }

    /*修改*/
    public void updateMachineryEn(MachineryEn machineryEn){
        this.machineryEnRepository.saveAndFlush(machineryEn);}

    /*findById*/
    public MachineryEn findById(Long id){
        return machineryEnRepository.findOne(id);
    }

    /*删除*/
    public void deleteMachineryEn(Long id){
        this.machineryEnRepository.delete(id);
    }

    //分页显示
    public Page<MachineryEn> findAll(Pageable pageable){
        return this.machineryEnRepository.findAll(pageable);
    }

}