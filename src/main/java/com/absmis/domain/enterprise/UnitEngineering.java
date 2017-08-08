package com.absmis.domain.enterprise;


import javax.persistence.Embedded;
import javax.persistence.JoinColumn;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * 单位工程
 *
 * @generated
 */

@javax.persistence.Entity
public class UnitEngineering {
    @javax.persistence.Id
    @javax.persistence.Column(nullable = false)
    protected Long id;
    //工程名称
    @javax.persistence.Column(nullable = false)
    protected String name;
    //建筑面积
    protected Double constructionArea;
    //地上层数
    protected Double undergroundNum;
    //地下层数
    protected Double overgroundNum;
    //工程类别
    @javax.persistence.ManyToOne
    @JoinColumn(name = "engineeringCategory_id")
    protected EngineeringCategory engineeringCategory;
    @javax.persistence.ManyToOne
    //工程结构形式
    @JoinColumn(name = "structureForm_id")
    protected StructureForm structureForm;
    //项目
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    protected Project project;
    //单位工程产业化信息
    @Embedded
    protected EngineeringIndustrialization engineeringIndustrialization;


    public UnitEngineering() {
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

    public Double getConstructionArea() {
        return constructionArea;
    }

    public void setConstructionArea(Double constructionArea) {
        this.constructionArea = constructionArea;
    }

    public Double getUndergroundNum() {
        return undergroundNum;
    }

    public void setUndergroundNum(Double undergroundNum) {
        this.undergroundNum = undergroundNum;
    }

    public Double getOvergroundNum() {
        return overgroundNum;
    }

    public void setOvergroundNum(Double overgroundNum) {
        this.overgroundNum = overgroundNum;
    }

    public EngineeringCategory getEngineeringCategory() {
        return engineeringCategory;
    }

    public void setEngineeringCategory(EngineeringCategory engineeringCategory) {
        this.engineeringCategory = engineeringCategory;
    }

    public StructureForm getStructureForm() {
        return structureForm;
    }

    public void setStructureForm(StructureForm structureForm) {
        this.structureForm = structureForm;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public EngineeringIndustrialization getEngineeringIndustrialization() {
        return engineeringIndustrialization;
    }

    public void setEngineeringIndustrialization(EngineeringIndustrialization engineeringIndustrialization) {
        this.engineeringIndustrialization = engineeringIndustrialization;
    }


}

