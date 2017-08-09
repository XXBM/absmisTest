package com.absmis.domain.enterprise;


import javax.persistence.DiscriminatorValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
//    @javax.persistence.Column(nullable = false)
//    private String qualificationDes;
    @JoinColumn(name = "designerCertification_id")
    @ManyToOne
    private DesignerCertification designerCertification;

    public Designer() {
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

    public DesignerCertification getDesignerCertification() {
        return designerCertification;
    }

    public void setDesignerCertification(DesignerCertification designerCertification) {
        this.designerCertification = designerCertification;
    }
}

