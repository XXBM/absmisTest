package com.absmis.domain.message;

/**
 * @Author: LihuaHuang
 * @Description:
 * @Date: Created in 14:37 2017/8/28.
 * @Modified by:no
 */
public class MachineryEnIndustrializationInfo {
    //预制混凝土生产设备
    private Double integralWall;
    //专用运输设备
    private Double specialTransportEquipment;
    // 专用施工设备
    private Double specialConstructionEquipment;

    public Double getIntegralWall() {
        return integralWall;
    }

    public void setIntegralWall(Double integralWall) {
        this.integralWall = integralWall;
    }

    public Double getSpecialTransportEquipment() {
        return specialTransportEquipment;
    }

    public void setSpecialTransportEquipment(Double specialTransportEquipment) {
        this.specialTransportEquipment = specialTransportEquipment;
    }

    public Double getSpecialConstructionEquipment() {
        return specialConstructionEquipment;
    }

    public void setSpecialConstructionEquipment(Double specialConstructionEquipment) {
        this.specialConstructionEquipment = specialConstructionEquipment;
    }
}
