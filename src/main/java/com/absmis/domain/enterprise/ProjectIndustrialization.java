package com.absmis.domain.enterprise;


import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Embeddable;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */


@Embeddable
@DynamicInsert(true)
@DynamicUpdate(true)
public class ProjectIndustrialization
{
	 

	protected Double industrializedTechnologyArea;

	 

	protected Double industrializedTechnologyAreaRatio;



	protected Double unitAssemblyRate;

	protected Double wall;


	protected Double wallShadowArea;


	protected Double constructionArea;

	//应用建筑产业化技术内容


	public ProjectIndustrialization(){
		super();
	}

	public Double getIndustrializedTechnologyArea() {
		return industrializedTechnologyArea;
	}

	public void setIndustrializedTechnologyArea(Double industrializedTechnologyArea) {
		this.industrializedTechnologyArea = industrializedTechnologyArea;
	}

	public Double getIndustrializedTechnologyAreaRatio() {
		return industrializedTechnologyAreaRatio;
	}

	public void setIndustrializedTechnologyAreaRatio(Double industrializedTechnologyAreaRatio) {
		this.industrializedTechnologyAreaRatio = industrializedTechnologyAreaRatio;
	}

	public Double getUnitAssemblyRate() {
		return unitAssemblyRate;
	}

	public void setUnitAssemblyRate(Double unitAssemblyRate) {
		this.unitAssemblyRate = unitAssemblyRate;
	}

	public Double getWall() {
		return wall;
	}

	public void setWall(Double wall) {
		this.wall = wall;
	}

	public Double getWallShadowArea() {
		return wallShadowArea;
	}

	public void setWallShadowArea(Double wallShadowArea) {
		this.wallShadowArea = wallShadowArea;
	}

	public Double getConstructionArea() {
		return constructionArea;
	}

	public void setConstructionArea(Double constructionArea) {
		this.constructionArea = constructionArea;
	}

}

