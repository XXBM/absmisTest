package com.absmis.domain.enterprise;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Calendar;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */

@javax.persistence.Entity
public class Project {

    @javax.persistence.Id
    @javax.persistence.Column(nullable = false)
    protected Long id;


    @javax.persistence.Column(nullable = false)
    protected String name;

    @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    protected Calendar fillTime;



    @javax.persistence.Column(nullable = false)
    protected String site;


    @javax.persistence.Column(nullable = false)
    protected String licenseNo;


    protected Double unitEngineeringNum;

    protected Double totalConstructionArea;

    protected Double overgroundConstructionArea;



    @javax.persistence.Column(nullable = false)
    protected String builder;



    @javax.persistence.Column(nullable = false)
    protected String designer;



    @javax.persistence.Column(nullable = false)
    protected String construction;



    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    protected RealEstateEn realEstateEn;


    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    protected EstateOwner estateOwner;

    public Project() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getFillTime() {
        return fillTime;
    }

    public void setFillTime(Calendar fillTime) {
        this.fillTime = fillTime;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public Double getUnitEngineeringNum() {
        return unitEngineeringNum;
    }

    public void setUnitEngineeringNum(Double unitEngineeringNum) {
        this.unitEngineeringNum = unitEngineeringNum;
    }

    public Double getTotalConstructionArea() {
        return totalConstructionArea;
    }

    public void setTotalConstructionArea(Double totalConstructionArea) {
        this.totalConstructionArea = totalConstructionArea;
    }

    public Double getOvergroundConstructionArea() {
        return overgroundConstructionArea;
    }

    public void setOvergroundConstructionArea(Double overgroundConstructionArea) {
        this.overgroundConstructionArea = overgroundConstructionArea;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public String getConstruction() {
        return construction;
    }

    public void setConstruction(String construction) {
        this.construction = construction;
    }

    public RealEstateEn getRealEstateEn() {
        return realEstateEn;
    }

    public void setRealEstateEn(RealEstateEn realEstateEn) {
        this.realEstateEn = realEstateEn;
    }

    public EstateOwner getEstateOwner() {
        return estateOwner;
    }

    public void setEstateOwner(EstateOwner estateOwner) {
        this.estateOwner = estateOwner;
    }
}

