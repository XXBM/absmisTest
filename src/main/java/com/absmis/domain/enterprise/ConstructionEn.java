package com.absmis.domain.enterprise;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * ConstructionEnIndustrialization
 *
 * @generated
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("ConstructionEn")
public abstract class ConstructionEn extends Organization {
    protected Double cumulant;
    @JsonIgnore
    @javax.persistence.OneToMany(mappedBy = "constructionEn")
    protected Set<ConstructionEnIndustrialization> componentEnIndustrializations;

    public ConstructionEn() {
        super();
    }

    public Double getCumulant() {
        return cumulant;
    }

    public void setCumulant(Double cumulant) {
        this.cumulant = cumulant;
    }

    public Set<ConstructionEnIndustrialization> getComponentEnIndustrializations() {
        return componentEnIndustrializations;
    }

    public void setComponentEnIndustrializations(Set<ConstructionEnIndustrialization> componentEnIndustrializations) {
        this.componentEnIndustrializations = componentEnIndustrializations;
    }

    abstract String getQualificationDes();

}

