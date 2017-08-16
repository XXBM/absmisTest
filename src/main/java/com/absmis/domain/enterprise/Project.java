package com.absmis.domain.enterprise;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Set;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *  项目
 * @generated
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("Project")
public abstract class Project implements Serializable {
    @GeneratedValue(strategy=GenerationType.TABLE)
    @javax.persistence.Id
    private Long id;
    //项目名称
    private String name;
    //项目开工时间
    @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Calendar startingTime;
    //项目填报时间
    @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Calendar fillTime;
    //项目建设地点
    private String site;
    //用地规划许可证号
    private String licenseNo;
    //单位工程数量
    private Double unitEngineeringNum;
    //总建筑面积
    private Double totalConstructionArea;
    //地上建筑面积
    private Double overgroundConstructionArea;
    //施工单位
    private String builder;
    //设计单位
    private String designer;
    //建设单位
    private String construction;
    //项目类别
    @ManyToOne
    @JoinColumn(name = "projectCategory_id")
    private ProjectCategory projectCategory;
    //项目状态
    @ManyToOne
    @JoinColumn(name = "projectState_id")
    private ProjectState projectState;


    @ManyToOne
    @JoinColumn(name = "checkedStatus_id")
    private CheckedStatus checkedStatus;

    //TODO 结构形式
    //项目产业化信息
    @Embedded
    private ProjectIndustrialization projectIndustrialization;
    //项目计划信息
    @Embedded
    private Schedule schedule;
    //单位工程
    @JsonIgnore
    @javax.persistence.OneToMany(mappedBy = "project")
    private Set<UnitEngineering> unitEngineering;

    public Project() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CheckedStatus getCheckedStatus() {
        return checkedStatus;
    }

    public Calendar getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(Calendar startingTime) {
        this.startingTime = startingTime;
    }

    public void setCheckedStatus(CheckedStatus checkedStatus) {
        this.checkedStatus = checkedStatus;
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

    public abstract String getOwner();

}

