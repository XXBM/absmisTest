package com.absmis.domain.enterprise;


import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Embeddable;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 *
 */
@Embeddable
@DynamicInsert(true)
@DynamicUpdate(true)
public class EngineeringIndustrialization {
    protected Double unitAssemblyRate;


    protected Double exteriorWallArea;


    protected Double wallShadowArea;


    protected Double conArea;


    @javax.persistence.Column(nullable = false)
    protected String component;


    @javax.persistence.Column(nullable = false)
    protected String subUnit;


    @javax.persistence.Column(nullable = false)
    protected String floorScope;


    public EngineeringIndustrialization() {
        super();
    }

    public Double getUnitAssemblyRate() {
        return unitAssemblyRate;
    }

    public void setUnitAssemblyRate(Double unitAssemblyRate) {
        this.unitAssemblyRate = unitAssemblyRate;
    }

    public Double getExteriorWallArea() {
        return exteriorWallArea;
    }

    public void setExteriorWallArea(Double exteriorWallArea) {
        this.exteriorWallArea = exteriorWallArea;
    }

    public Double getWallShadowArea() {
        return wallShadowArea;
    }

    public void setWallShadowArea(Double wallShadowArea) {
        this.wallShadowArea = wallShadowArea;
    }

    public Double getConArea() {
        return conArea;
    }

    public void setConArea(Double conArea) {
        this.conArea = conArea;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getSubUnit() {
        return subUnit;
    }

    public void setSubUnit(String subUnit) {
        this.subUnit = subUnit;
    }

    public String getFloorScope() {
        return floorScope;
    }

    public void setFloorScope(String floorScope) {
        this.floorScope = floorScope;
    }

}

