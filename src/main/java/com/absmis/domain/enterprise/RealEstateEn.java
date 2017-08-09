package com.absmis.domain.enterprise;

import javax.persistence.DiscriminatorValue;
import java.util.Set;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * 房地产企业
 *
 * @generated
 */

@javax.persistence.Entity
@DiscriminatorValue("RealEstateEn")
public class RealEstateEn extends ConstructionEn {
	 //资质证书编号
    @javax.persistence.Column(nullable = false)
    protected String qualificationNo;
    //资质
    @javax.persistence.Column(nullable = false)
    protected String qualificationDes;


    //项目
    @javax.persistence.OneToMany(mappedBy = "realEstateEn")
    protected Set<Project> project;

    public RealEstateEn() {
        super();
    }

    public String getQualificationNo() {
        return qualificationNo;
    }

    public void setQualificationNo(String qualificationNo) {
        this.qualificationNo = qualificationNo;
    }

    public String getQualificationDes() {
        return qualificationDes;
    }

    public void setQualificationDes(String qualificationDes) {
        this.qualificationDes = qualificationDes;
    }

    public Set<Project> getProject() {
        return project;
    }

    public void setProject(Set<Project> project) {
        this.project = project;
    }
}

