package com.absmis.domain.enterprise;

import javax.persistence.DiscriminatorValue;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * 项目
 *
 * @generated
 */

@javax.persistence.Entity
@DiscriminatorValue("ProjectEstateOwner")
public class ProjectByEstateOwner extends Project {
    //建设单位
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(name = "estateOwner_id")
    private EstateOwner estateOwner;

    public ProjectByEstateOwner() {
        super();
    }

    @Override
    public String getOwner() {
        return "建设单位";
    }

    public EstateOwner getEstateOwner() {
        return estateOwner;
    }

    public void setEstateOwner(EstateOwner estateOwner) {
        this.estateOwner = estateOwner;
    }
}
