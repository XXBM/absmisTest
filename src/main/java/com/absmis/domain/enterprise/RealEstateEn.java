package com.absmis.domain.enterprise;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.DiscriminatorValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    private String qualificationNo;
    //资质
    //private String qualificationDes;
    @JoinColumn(name = "estateEnCertification_id")
    @ManyToOne
    private RealEstateEnCertification estateEnCertification;
    //项目
    @JsonIgnore
    @javax.persistence.OneToMany(mappedBy = "realEstateEn")
    private Set<Project> project;

    public RealEstateEn() {
        super();
    }

    @Override
    String getQualification() {
        return null;
    }

    public String getQualificationNo() {
        return qualificationNo;
    }

    public void setQualificationNo(String qualificationNo) {
        this.qualificationNo = qualificationNo;
    }

    public RealEstateEnCertification getEstateEnCertification() {
        return estateEnCertification;
    }

    public void setEstateEnCertification(RealEstateEnCertification estateEnCertification) {
        this.estateEnCertification = estateEnCertification;
    }

    public Set<Project> getProject() {
        return project;
    }

    public void setProject(Set<Project> project) {
        this.project = project;
    }
}

