package com.absmis.service.enterprise;


import com.absmis.domain.enterprise.Designer;
import com.absmis.repository.enterprise.DesignerRepository;
import com.absmis.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by xuling on 2016/10/11.
 */

@Service
public class DesignerService extends BasicService<Designer, Long> {
    @Autowired
    DesignerRepository designerRepository;
    /*增加*/
    public void addDesigner(Designer designer){
        this.designerRepository.save(designer);
    }

    /*修改*/
    public void updateDesigner(Designer designer){
        this.designerRepository.saveAndFlush(designer);}

    /*findById*/
    public Designer findById(Long id){
        return designerRepository.findOne(id);
    }

    /*删除*/
    public void deleteDesigner(Long id){
        this.designerRepository.delete(id);
    }

    //分页显示
    public Page<Designer> findAll(Pageable pageable){
        return this.designerRepository.findAll(pageable);
    }

}