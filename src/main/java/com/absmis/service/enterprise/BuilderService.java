package com.absmis.service.enterprise;


import com.absmis.domain.enterprise.Builder;
import com.absmis.repository.enterprise.BuilderRepository;
import com.absmis.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by xuling on 2016/10/11.
 */

@Service
public class BuilderService extends BasicService<Builder, Long> {
    @Autowired
    BuilderRepository builderRepository;
    /*增加*/
    public void addBuilder(Builder builder){
        this.builderRepository.save(builder);
    }

    /*修改*/
    public void updateBuilder(Builder componentEn){
        this.builderRepository.saveAndFlush(componentEn);}

    /*findById*/
    public Builder findById(Long id){
        return builderRepository.findOne(id);
    }

    /*删除*/
    public void deleteBuilder(Long id){
        this.builderRepository.delete(id);
    }

    //分页显示
    public Page<Builder> findAll(Pageable pageable){
        return this.builderRepository.findAll(pageable);
    }

}