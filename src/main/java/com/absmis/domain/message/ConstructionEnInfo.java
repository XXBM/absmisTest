package com.absmis.domain.message;

/**
 * @Author: LihuaHuang
 * @Description:
 * @Date: Created in 15:11 2017/8/28.
 * @Modified by:
 */
public class ConstructionEnInfo {
    private String enType;
    private Double enNum;
    private Double annualScale;
    //TODO 从事装配式建筑规模累计

    public ConstructionEnInfo(String enType, Double enNum, Double annualScale) {
        this.enType = enType;
        this.enNum = enNum;
        this.annualScale = annualScale;
    }

    public String getEnType() {
        return enType;
    }

    public void setEnType(String enType) {
        this.enType = enType;
    }

    public Double getEnNum() {
        return enNum;
    }

    public void setEnNum(Double enNum) {
        this.enNum = enNum;
    }

    public Double getAnnualScale() {
        return annualScale;
    }

    public void setAnnualScale(Double annualScale) {
        this.annualScale = annualScale;
    }
}
