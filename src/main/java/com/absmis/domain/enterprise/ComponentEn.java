package com.absmis.domain.enterprise;


import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Set;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated 构件企业
 */

@javax.persistence.Entity
public class ComponentEn extends Organization {
    //建筑产业化信息
    @JsonIgnore
    @javax.persistence.OneToMany(mappedBy = "componentEn")
    private Set<ComponentEnIndustrialization> componentEnIndustrializations;

    public ComponentEn() {
        super();
    }

    public Set<ComponentEnIndustrialization> getComponentEnIndustrializations() {
        return componentEnIndustrializations;
    }


    public void setComponentEnIndustrializations(Set<ComponentEnIndustrialization> componentEnIndustrializations) {
        this.componentEnIndustrializations = componentEnIndustrializations;
    }
}

