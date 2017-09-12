package com.absmis.domain.message;

/**
 * @Author: LihuaHuang
 * @Description:
 * @Date: Created in 15:11 2017/8/28.
 * @Modified by:
 */
public class ConstructionEnStatistics {
    private String name;//企业名称
    private String type;//企业类型
    private Double annualScale;//年度规模累计
    //TODO 从事装配式建筑规模累计

    public ConstructionEnStatistics(String name, String type, Double annualScale) {
        this.name = name;
        this.type = type;
        this.annualScale = annualScale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getAnnualScale() {
        return annualScale;
    }

    public void setAnnualScale(Double annualScale) {
        this.annualScale = annualScale;
    }
}
