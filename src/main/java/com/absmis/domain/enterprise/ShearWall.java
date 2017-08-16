package com.absmis.domain.enterprise;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Embeddable;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *     剪力墙结构
 *
 *
 * @generated
 */
@Embeddable
@DynamicInsert(true)
@DynamicUpdate(true)
public class ShearWall{
    //楼板
    private boolean floorSw;
    //楼梯
    private boolean stairsSw;
    //外墙
    private boolean exteriorWallSw;
    //内墙
    private boolean interiorWallSw;
    //整体厨房
    private boolean integralKitchenSw;
    //整体卫生间
    private boolean integralToiletSw;
    //太阳能
    private boolean solarEnergySw;

    public ShearWall() {
        super();
    }

    public boolean isFloorSw() {
        return floorSw;
    }

    public void setFloorSw(boolean floorSw) {
        this.floorSw = floorSw;
    }

    public boolean isStairsSw() {
        return stairsSw;
    }

    public void setStairsSw(boolean stairsSw) {
        this.stairsSw = stairsSw;
    }

    public boolean isExteriorWallSw() {
        return exteriorWallSw;
    }

    public void setExteriorWallSw(boolean exteriorWallSw) {
        this.exteriorWallSw = exteriorWallSw;
    }

    public boolean isInteriorWallSw() {
        return interiorWallSw;
    }

    public void setInteriorWallSw(boolean interiorWallSw) {
        this.interiorWallSw = interiorWallSw;
    }

    public boolean isIntegralKitchenSw() {
        return integralKitchenSw;
    }

    public void setIntegralKitchenSw(boolean integralKitchenSw) {
        this.integralKitchenSw = integralKitchenSw;
    }

    public boolean isIntegralToiletSw() {
        return integralToiletSw;
    }

    public void setIntegralToiletSw(boolean integralToiletSw) {
        this.integralToiletSw = integralToiletSw;
    }

    public boolean isSolarEnergySw() {
        return solarEnergySw;
    }

    public void setSolarEnergySw(boolean solarEnergySw) {
        this.solarEnergySw = solarEnergySw;
    }
}

