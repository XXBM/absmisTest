package com.absmis.domain.enterprise;


import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Embeddable;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *     单位工程产业化信息
 *
 * @generated
 *
 */
@Embeddable
@DynamicInsert(true)
@DynamicUpdate(true)
public class EngineeringIndustrialization {
    //单体装配率
    protected Double unitAssemblyRate;
    //外墙预制比例应用产业化技术的建筑面积
    protected Double exteriorWallArea;
    //预制外墙水平投影面积
    protected Double wallShadowArea;
    //不纳入地上容积率的建筑面积
    protected Double conArea;
    //应用结构类型
    @javax.persistence.Column(nullable = false)
    protected String component;
    // 应用构件部品
    @javax.persistence.Column(nullable = false)
    protected String subUnit;
    //应用楼层范围
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

