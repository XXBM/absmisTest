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
    /*生产条数*/
    //整体墙板
    private Double integralWallNum;
    //结构保温装饰一体化外墙
    private Double integrativeExternalWallNum;
    //预制楼梯
    private Double prebuiltStairsNum;
    //整体厨房
    private Double integralKitchenNum;
    //整体卫生间
    private Double integralToiletNum;
    //整体内装体系
    private Double integralInteriorDecorationNum;

    /*生产能力*/
    //整体墙板
    private Double integralWallAbility;
    //结构保温装饰一体化外墙
    private Double integrativeExternalWallAbility;
    //预制楼梯
    private Double prebuiltStairsAbility;
    //整体厨房
    private Double integralKitchenAbility;
    //整体卫生间
    private Double integralToiletAbility;
    //整体内装体系
    private Double integralInteriorDecorationAbility;

    /*应用规模*/
    //整体墙板
    private Double integralWallScale;
    //结构保温装饰一体化外墙
    private Double integrativeExternalWallScale;
    //预制楼梯
    private Double prebuiltStairsScale;
    //整体厨房
    private Double integralKitchenScale;
    //整体卫生间
    private Double integralToiletScale;
    //整体内装体系
    private Double integralInteriorDecorationScale;

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

    public Double getIntegralWallNum() {
        return integralWallNum;
    }

    public void setIntegralWallNum(Double integralWallNum) {
        this.integralWallNum = integralWallNum;
    }

    public Double getIntegrativeExternalWallNum() {
        return integrativeExternalWallNum;
    }

    public void setIntegrativeExternalWallNum(Double integrativeExternalWallNum) {
        this.integrativeExternalWallNum = integrativeExternalWallNum;
    }

    public Double getPrebuiltStairsNum() {
        return prebuiltStairsNum;
    }

    public void setPrebuiltStairsNum(Double prebuiltStairsNum) {
        this.prebuiltStairsNum = prebuiltStairsNum;
    }

    public Double getIntegralKitchenNum() {
        return integralKitchenNum;
    }

    public void setIntegralKitchenNum(Double integralKitchenNum) {
        this.integralKitchenNum = integralKitchenNum;
    }

    public Double getIntegralToiletNum() {
        return integralToiletNum;
    }

    public void setIntegralToiletNum(Double integralToiletNum) {
        this.integralToiletNum = integralToiletNum;
    }

    public Double getIntegralInteriorDecorationNum() {
        return integralInteriorDecorationNum;
    }

    public void setIntegralInteriorDecorationNum(Double integralInteriorDecorationNum) {
        this.integralInteriorDecorationNum = integralInteriorDecorationNum;
    }

    public Double getIntegralWallAbility() {
        return integralWallAbility;
    }

    public void setIntegralWallAbility(Double integralWallAbility) {
        this.integralWallAbility = integralWallAbility;
    }

    public Double getIntegrativeExternalWallAbility() {
        return integrativeExternalWallAbility;
    }

    public void setIntegrativeExternalWallAbility(Double integrativeExternalWallAbility) {
        this.integrativeExternalWallAbility = integrativeExternalWallAbility;
    }

    public Double getPrebuiltStairsAbility() {
        return prebuiltStairsAbility;
    }

    public void setPrebuiltStairsAbility(Double prebuiltStairsAbility) {
        this.prebuiltStairsAbility = prebuiltStairsAbility;
    }

    public Double getIntegralKitchenAbility() {
        return integralKitchenAbility;
    }

    public void setIntegralKitchenAbility(Double integralKitchenAbility) {
        this.integralKitchenAbility = integralKitchenAbility;
    }

    public Double getIntegralToiletAbility() {
        return integralToiletAbility;
    }

    public void setIntegralToiletAbility(Double integralToiletAbility) {
        this.integralToiletAbility = integralToiletAbility;
    }

    public Double getIntegralInteriorDecorationAbility() {
        return integralInteriorDecorationAbility;
    }

    public void setIntegralInteriorDecorationAbility(Double integralInteriorDecorationAbility) {
        this.integralInteriorDecorationAbility = integralInteriorDecorationAbility;
    }

    public Double getIntegralWallScale() {
        return integralWallScale;
    }

    public void setIntegralWallScale(Double integralWallScale) {
        this.integralWallScale = integralWallScale;
    }

    public Double getIntegrativeExternalWallScale() {
        return integrativeExternalWallScale;
    }

    public void setIntegrativeExternalWallScale(Double integrativeExternalWallScale) {
        this.integrativeExternalWallScale = integrativeExternalWallScale;
    }

    public Double getPrebuiltStairsScale() {
        return prebuiltStairsScale;
    }

    public void setPrebuiltStairsScale(Double prebuiltStairsScale) {
        this.prebuiltStairsScale = prebuiltStairsScale;
    }

    public Double getIntegralKitchenScale() {
        return integralKitchenScale;
    }

    public void setIntegralKitchenScale(Double integralKitchenScale) {
        this.integralKitchenScale = integralKitchenScale;
    }

    public Double getIntegralToiletScale() {
        return integralToiletScale;
    }

    public void setIntegralToiletScale(Double integralToiletScale) {
        this.integralToiletScale = integralToiletScale;
    }

    public Double getIntegralInteriorDecorationScale() {
        return integralInteriorDecorationScale;
    }

    public void setIntegralInteriorDecorationScale(Double integralInteriorDecorationScale) {
        this.integralInteriorDecorationScale = integralInteriorDecorationScale;
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

