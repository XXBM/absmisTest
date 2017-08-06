package com.absmis.domain.enterprise;


import javax.persistence.Embedded;
import javax.persistence.JoinColumn;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
 
@javax.persistence.Entity 
public class UnitEngineering
{
	 
	@javax.persistence.Id 
	@javax.persistence.Column(nullable = false) 
	protected Long id;


	@javax.persistence.Column(nullable = false) 
	protected String name;



	protected Double constructionArea;


	protected Double undergroundNum;

	protected Double overgroundNum;


	 
	@javax.persistence.ManyToOne
	@JoinColumn(name = "engineeringCategory_id")
	protected EngineeringCategory engineeringCategory;

	 
	@javax.persistence.ManyToOne
	@JoinColumn(name = "structureForm_id")
	protected StructureForm structureForm;


	@javax.persistence.ManyToOne 
	@javax.persistence.JoinColumn(nullable = false) 
	protected Project project;


	@Embedded
	protected EngineeringIndustrialization engineeringIndustrialization;


	public UnitEngineering(){
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

