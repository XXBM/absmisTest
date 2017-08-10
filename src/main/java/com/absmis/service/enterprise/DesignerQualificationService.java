package com.absmis.service.enterprise;


import com.absmis.domain.enterprise.DesignerQualification;
import com.absmis.repository.enterprise.DesignerQualificationRepository;
import com.absmis.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by xuling on 2016/10/11.
 */

@Service
public class DesignerQualificationService extends BasicService<DesignerQualification, Long> {
    @Autowired
    DesignerQualificationRepository designerQualificationRepository;
    /*增加*/
    public void addDesignerCertification(DesignerQualification designerQualification){
        this.designerQualificationRepository.save(designerQualification);
    }

    /*修改*/
    public void updateDesignerCertification(DesignerQualification designerQualification){
        this.designerQualificationRepository.saveAndFlush(designerQualification);}

    /*findById*/
    public DesignerQualification findById(Long id){
        return designerQualificationRepository.findOne(id);
    }

    /*删除*/
    public void deleteDesignerCertification(Long id){
        this.designerQualificationRepository.delete(id);
    }

    //分页显示
    public Page<DesignerQualification> findAll(Pageable pageable){
        return this.designerQualificationRepository.findAll(pageable);
    }



}