package com.absmis.service.enterprise;


import com.absmis.domain.enterprise.DesignerCertification;
import com.absmis.repository.enterprise.DesignerCertificationRepository;
import com.absmis.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by xuling on 2016/10/11.
 */

@Service
public class DesignerCertificationService extends BasicService<DesignerCertification, Long> {
    @Autowired
    DesignerCertificationRepository designerCertificationRepository;
    /*增加*/
    public void addDesignerCertification(DesignerCertification designerCertification){
        this.designerCertificationRepository.save(designerCertification);
    }

    /*修改*/
    public void updateDesignerCertification(DesignerCertification designerCertification){
        this.designerCertificationRepository.saveAndFlush(designerCertification);}

    /*findById*/
    public DesignerCertification findById(Long id){
        return designerCertificationRepository.findOne(id);
    }

    /*删除*/
    public void deleteDesignerCertification(Long id){
        this.designerCertificationRepository.delete(id);
    }

    //分页显示
    public Page<DesignerCertification> findAll(Pageable pageable){
        return this.designerCertificationRepository.findAll(pageable);
    }

}