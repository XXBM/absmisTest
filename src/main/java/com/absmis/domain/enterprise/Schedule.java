package com.absmis.domain.enterprise;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Embeddable;
import java.util.Date;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * 项目计划信息
 *
 * @generated
 */


@Embeddable
@DynamicInsert(true)
@DynamicUpdate(true)
public class Schedule {
    //项目起止时间
    @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
    protected Date startTime;
    //项目结束时间
    @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
    protected Date endTime;
    //取得土地使用权
    @javax.persistence.Column(nullable = false)
    protected String landUseRight;
    //建设用地规划许可证
    @javax.persistence.Column(nullable = false)
    protected String constructionLicense;
    //建设工程规划许可证
    @javax.persistence.Column(nullable = false)
    protected String engineeringLicense;
    //组织工程招标及工程施工
    @javax.persistence.Column(nullable = false)
    protected String tender;
    //项目综合验收
    @javax.persistence.Column(nullable = false)
    protected String comprehensiveInspectionAndAcceptance;
    // 项目交付使用
    @javax.persistence.Column(nullable = false)
    protected String delivery;
    //施工图设计及审查
    @javax.persistence.Column(nullable = false)
    protected String constructionDrawing;

    public Schedule() {
        super();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getLandUseRight() {
        return landUseRight;
    }

    public void setLandUseRight(String landUseRight) {
        this.landUseRight = landUseRight;
    }

    public String getConstructionLicense() {
        return constructionLicense;
    }

    public void setConstructionLicense(String constructionLicense) {
        this.constructionLicense = constructionLicense;
    }

    public String getEngineeringLicense() {
        return engineeringLicense;
    }

    public void setEngineeringLicense(String engineeringLicense) {
        this.engineeringLicense = engineeringLicense;
    }

    public String getTender() {
        return tender;
    }

    public void setTender(String tender) {
        this.tender = tender;
    }

    public String getComprehensiveInspectionAndAcceptance() {
        return comprehensiveInspectionAndAcceptance;
    }

    public void setComprehensiveInspectionAndAcceptance(String comprehensiveInspectionAndAcceptance) {
        this.comprehensiveInspectionAndAcceptance = comprehensiveInspectionAndAcceptance;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getConstructionDrawing() {
        return constructionDrawing;
    }

    public void setConstructionDrawing(String constructionDrawing) {
        this.constructionDrawing = constructionDrawing;
    }


}

