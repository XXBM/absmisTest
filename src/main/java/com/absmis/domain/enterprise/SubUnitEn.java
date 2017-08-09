package com.absmis.domain.enterprise;


import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Set;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *     部品企业
 *
 * @generated
 */

@javax.persistence.Entity
public class SubUnitEn extends Organization {


    public SubUnitEn() {
        super();
    }

    //建筑产业化信息
    @JsonIgnore
    @javax.persistence.OneToMany(mappedBy = "subUnitEn")
    protected Set<SubUnitEnIndustrialization> subUnitEnIndustrializations;

    public Set<SubUnitEnIndustrialization> getSubUnitEnIndustrializations() {
        return subUnitEnIndustrializations;
    }

    public void setSubUnitEnIndustrializations(Set<SubUnitEnIndustrialization> subUnitEnIndustrializations) {
        this.subUnitEnIndustrializations = subUnitEnIndustrializations;
    }
}

