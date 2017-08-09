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
    private Date startTime;
    //项目结束时间
    @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
    private Date endTime;
    //取得土地使用权开始时间
    @javax.persistence.Column(nullable = false)
    private String landUseRightStart;
    //取得土地使用权结束时间
    @javax.persistence.Column(nullable = false)
    private String landUseRightEnd;
    //建设用地规划许可证开始时间
    @javax.persistence.Column(nullable = false)
    private String constructionLicenseStart;
    //建设用地规划许可证结束时间
    @javax.persistence.Column(nullable = false)
    private String constructionLicenseEnd;
    //建设工程规划许可证开始时间
    @javax.persistence.Column(nullable = false)
    private String engineeringLicenseStart;
    //建设工程规划许可证结束时间
    @javax.persistence.Column(nullable = false)
    private String engineeringLicenseEnd;
    //组织工程招标及工程施工开始时间
    @javax.persistence.Column(nullable = false)
    private String tenderStart;
    //组织工程招标及工程施工结束时间
    @javax.persistence.Column(nullable = false)
    private String tenderEnd;
    //项目综合验收开始时间
    @javax.persistence.Column(nullable = false)
    private String comprehensiveInspectionAndAcceptanceStart;
    //项目综合验收结束时间
    @javax.persistence.Column(nullable = false)
    private String comprehensiveInspectionAndAcceptanceEnd;
    //项目交付使用开始时间
    @javax.persistence.Column(nullable = false)
    private String deliveryStart;
    //项目交付使用结束时间
    @javax.persistence.Column(nullable = false)
    private String deliveryEnd;
    //施工图设计及审查开始时间
    @javax.persistence.Column(nullable = false)
    private String constructionDrawingStart;
    //施工图设计及审查结束时间
    @javax.persistence.Column(nullable = false)
    private String constructionDrawingEnd;

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

    public String getLandUseRightStart() {
        return landUseRightStart;
    }


    public void setLandUseRightStart(String landUseRightStart) {
        this.landUseRightStart = landUseRightStart;
    }

    public String getLandUseRightEnd() {
        return landUseRightEnd;
    }

    public void setLandUseRightEnd(String landUseRightEnd) {
        this.landUseRightEnd = landUseRightEnd;
    }

    public String getConstructionLicenseStart() {
        return constructionLicenseStart;
    }

    public void setConstructionLicenseStart(String constructionLicenseStart) {
        this.constructionLicenseStart = constructionLicenseStart;
    }

    public String getConstructionLicenseEnd() {
        return constructionLicenseEnd;
    }

    public void setConstructionLicenseEnd(String constructionLicenseEnd) {
        this.constructionLicenseEnd = constructionLicenseEnd;
    }

    public String getEngineeringLicenseStart() {
        return engineeringLicenseStart;
    }

    public void setEngineeringLicenseStart(String engineeringLicenseStart) {
        this.engineeringLicenseStart = engineeringLicenseStart;
    }

    public String getEngineeringLicenseEnd() {
        return engineeringLicenseEnd;
    }

    public void setEngineeringLicenseEnd(String engineeringLicenseEnd) {
        this.engineeringLicenseEnd = engineeringLicenseEnd;
    }

    public String getTenderStart() {
        return tenderStart;
    }

    public void setTenderStart(String tenderStart) {
        this.tenderStart = tenderStart;
    }

    public String getTenderEnd() {
        return tenderEnd;
    }

    public void setTenderEnd(String tenderEnd) {
        this.tenderEnd = tenderEnd;
    }

    public String getComprehensiveInspectionAndAcceptanceStart() {
        return comprehensiveInspectionAndAcceptanceStart;
    }

    public void setComprehensiveInspectionAndAcceptanceStart(String comprehensiveInspectionAndAcceptanceStart) {
        this.comprehensiveInspectionAndAcceptanceStart = comprehensiveInspectionAndAcceptanceStart;
    }

    public String getComprehensiveInspectionAndAcceptanceEnd() {
        return comprehensiveInspectionAndAcceptanceEnd;
    }

    public void setComprehensiveInspectionAndAcceptanceEnd(String comprehensiveInspectionAndAcceptanceEnd) {
        this.comprehensiveInspectionAndAcceptanceEnd = comprehensiveInspectionAndAcceptanceEnd;
    }

    public String getDeliveryStart() {
        return deliveryStart;
    }

    public void setDeliveryStart(String deliveryStart) {
        this.deliveryStart = deliveryStart;
    }

    public String getDeliveryEnd() {
        return deliveryEnd;
    }

    public void setDeliveryEnd(String deliveryEnd) {
        this.deliveryEnd = deliveryEnd;
    }

    public String getConstructionDrawingStart() {
        return constructionDrawingStart;
    }

    public void setConstructionDrawingStart(String constructionDrawingStart) {
        this.constructionDrawingStart = constructionDrawingStart;
    }

    public String getConstructionDrawingEnd() {
        return constructionDrawingEnd;
    }

    public void setConstructionDrawingEnd(String constructionDrawingEnd) {
        this.constructionDrawingEnd = constructionDrawingEnd;
    }
}

