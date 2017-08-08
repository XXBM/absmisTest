package com.absmis.domain.enterprise;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated Industrialization
 */

@javax.persistence.Entity
public class SubUnitEnIndustrialization {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //整体墙板
    private Double integralWall;
    //结构保温装饰一体化外墙
    private Double integrativeExternalWall;
    //预制楼梯
    private Double prebuiltStairs;
    //整体厨房
    private Double integralKitchen;
    //整体卫生间
    private Double integralToilet;
    //整体内装体系
    private Double integralInteriorDecoration;

    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    protected SubUnitEn subUnitEn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Double structuralInsulatedDecorateIntegration;

    public SubUnitEnIndustrialization() {
        super();
    }

    public Double getIntegralWall() {
        return integralWall;
    }

    public void setIntegralWall(Double integralWall) {
        this.integralWall = integralWall;
    }

    public Double getIntegrativeExternalWall() {
        return integrativeExternalWall;
    }

    public void setIntegrativeExternalWall(Double integrativeExternalWall) {
        this.integrativeExternalWall = integrativeExternalWall;
    }

    public Double getPrebuiltStairs() {
        return prebuiltStairs;
    }

    public void setPrebuiltStairs(Double prebuiltStairs) {
        this.prebuiltStairs = prebuiltStairs;
    }

    public Double getIntegralKitchen() {
        return integralKitchen;
    }

    public void setIntegralKitchen(Double integralKitchen) {
        this.integralKitchen = integralKitchen;
    }

    public Double getIntegralToilet() {
        return integralToilet;
    }

    public void setIntegralToilet(Double integralToilet) {
        this.integralToilet = integralToilet;
    }

    public Double getIntegralInteriorDecoration() {
        return integralInteriorDecoration;
    }

    public void setIntegralInteriorDecoration(Double integralInteriorDecoration) {
        this.integralInteriorDecoration = integralInteriorDecoration;
    }

    public Double getStructuralInsulatedDecorateIntegration() {
        return structuralInsulatedDecorateIntegration;
    }

    public void setStructuralInsulatedDecorateIntegration(Double structuralInsulatedDecorateIntegration) {
        this.structuralInsulatedDecorateIntegration = structuralInsulatedDecorateIntegration;
    }

    public SubUnitEn getSubUnitEn() {
        return subUnitEn;
    }

    public void setSubUnitEn(SubUnitEn subUnitEn) {
        this.subUnitEn = subUnitEn;
    }
}

