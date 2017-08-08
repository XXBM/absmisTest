package com.absmis.domain.enterprise;


import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Set;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated Industrialization
 */

@javax.persistence.Entity
public class SubUnitEn extends Organization {

    public SubUnitEn() {
        super();
    }

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

