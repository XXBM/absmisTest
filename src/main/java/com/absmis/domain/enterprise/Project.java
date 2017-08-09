package com.absmis.domain.enterprise;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Embedded;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Calendar;
import java.util.Set;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *  项目
 * @generated
 */

@javax.persistence.Entity
public class Project {
    @javax.persistence.Id
    @javax.persistence.Column(nullable = false)
    protected Long id;
    @javax.persistence.Column(nullable = false)
    //项目名称
    protected String name;
    //项目填报时间
    @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    protected Calendar fillTime;
    //项目建设地点
    @javax.persistence.Column(nullable = false)
    protected String site;
    //用地规划许可证号
    @javax.persistence.Column(nullable = false)
    protected String licenseNo;
    //单位工程数量
    protected Double unitEngineeringNum;
    //总建筑面积
    protected Double totalConstructionArea;
    //地上建筑面积
    protected Double overgroundConstructionArea;
    //施工单位
    @javax.persistence.Column(nullable = false)
    protected String builder;
    //设计单位
    @javax.persistence.Column(nullable = false)
    protected String designer;
    //建设单位
    @javax.persistence.Column(nullable = false)
    protected String construction;
    //房地产企业
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    protected RealEstateEn realEstateEn;
    //建设单位
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    protected EstateOwner estateOwner;
    //项目类别
    @ManyToOne
    @JoinColumn(name = "projectCategory_id")
    private ProjectCategory projectCategory;
    //项目状态
    @ManyToOne
    @JoinColumn(name = "projectState_id")
    private ProjectState projectState;
    //TODO 结构形式

    //项目产业化信息
    @Embedded
    private ProjectIndustrialization projectIndustrialization;
    //TODO 项目计划信息
    @Embedded
    private Schedule schedule;
    //单位工程
    @javax.persistence.OneToMany(mappedBy = "project")
    protected Set<UnitEngineering> unitEngineering;

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

    public ProjectCategory getProjectCategory() {
        return projectCategory;
    }

    public void setProjectCategory(ProjectCategory projectCategory) {
        this.projectCategory = projectCategory;
    }

    public ProjectState getProjectState() {
        return projectState;
    }

    public Set<UnitEngineering> getUnitEngineering() {
        return unitEngineering;
    }

    public void setUnitEngineering(Set<UnitEngineering> unitEngineering) {
        this.unitEngineering = unitEngineering;
    }

    public void setProjectState(ProjectState projectState) {
        this.projectState = projectState;
    }

    public ProjectIndustrialization getProjectIndustrialization() {
        return projectIndustrialization;
    }

    public void setProjectIndustrialization(ProjectIndustrialization projectIndustrialization) {
        this.projectIndustrialization = projectIndustrialization;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}

