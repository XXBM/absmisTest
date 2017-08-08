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
public class MachineryEn extends Organization {


    @JsonIgnore
    @javax.persistence.OneToMany(mappedBy = "machineryEn")
    protected Set<MachineryEnIndustrialization> machineryEnIndustrializations;

    public MachineryEn() {
        super();
    }

    public Set<MachineryEnIndustrialization> getMachineryEnIndustrializations() {
        return machineryEnIndustrializations;
    }

    public void setMachineryEnIndustrializations(Set<MachineryEnIndustrialization> machineryEnIndustrializations) {
        this.machineryEnIndustrializations = machineryEnIndustrializations;
    }
}

