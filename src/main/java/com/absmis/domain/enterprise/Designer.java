package com.absmis.domain.enterprise;


import javax.persistence.DiscriminatorValue;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *     设计单位
 *
 * @generated
 */

@javax.persistence.Entity
@DiscriminatorValue("Designer")
public class Designer extends ConstructionEn {

    //资质证书编号
    @javax.persistence.Column(nullable = false)
    private String qualificationNo;
    //资质
    @javax.persistence.Column(nullable = false)
    private String qualificationDes;

    public Designer() {
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
}

