package com.absmis.domain.enterprise;


import javax.persistence.DiscriminatorValue;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * 施工单位
 *
 * @generated
 */

@javax.persistence.Entity
@DiscriminatorValue("Builder")
public class Builder extends ConstructionEn {
    //资质证书编号
    private String qualificationNo;
    //资质
    private String qualificationDes;


    public Builder() {
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

