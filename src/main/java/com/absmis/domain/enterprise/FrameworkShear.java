package com.absmis.domain.enterprise;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *     框架及剪框
 *
 * @generated
 */

@Embeddable
@DynamicInsert(true)
@DynamicUpdate(true)
public class FrameworkShear implements Serializable {
    //柱
    private boolean columnFs;
    //梁
    private boolean beamFs;
    //楼板
    private boolean floorFs;
    //楼梯
    private boolean stairsFs;
    //外墙
    private boolean exteriorWallFs;
    //内墙
    private boolean interiorWallFs;
    //整体厨房
    private boolean integralKitchenFs;
    //整体卫生间
    private boolean integralToiletFs;
    //太阳能
    private boolean solarEnergyFs;
    public FrameworkShear() {
        super();
    }

    public boolean isColumnFs() {
        return columnFs;
    }

    public void setColumnFs(boolean columnFs) {
        this.columnFs = columnFs;
    }

    public boolean isBeamFs() {
        return beamFs;
    }

    public void setBeamFs(boolean beamFs) {
        this.beamFs = beamFs;
    }

    public boolean isFloorFs() {
        return floorFs;
    }

    public void setFloorFs(boolean floorFs) {
        this.floorFs = floorFs;
    }

    public boolean isStairsFs() {
        return stairsFs;
    }

    public void setStairsFs(boolean stairsFs) {
        this.stairsFs = stairsFs;
    }

    public boolean isExteriorWallFs() {
        return exteriorWallFs;
    }

    public void setExteriorWallFs(boolean exteriorWallFs) {
        this.exteriorWallFs = exteriorWallFs;
    }

    public boolean isInteriorWallFs() {
        return interiorWallFs;
    }

    public void setInteriorWallFs(boolean interiorWallFs) {
        this.interiorWallFs = interiorWallFs;
    }

    public boolean isIntegralKitchenFs() {
        return integralKitchenFs;
    }

    public void setIntegralKitchenFs(boolean integralKitchenFs) {
        this.integralKitchenFs = integralKitchenFs;
    }

    public boolean isIntegralToiletFs() {
        return integralToiletFs;
    }

    public void setIntegralToiletFs(boolean integralToiletFs) {
        this.integralToiletFs = integralToiletFs;
    }

    public boolean isSolarEnergyFs() {
        return solarEnergyFs;
    }

    public void setSolarEnergyFs(boolean solarEnergyFs) {
        this.solarEnergyFs = solarEnergyFs;
    }
}

