package com.absmis.domain.enterprise;


import javax.persistence.*;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("ConstructionEn")
public abstract class ConstructionEn extends Enterprise
{


	protected Double cumulant;

	protected Double currentConcrete;


	protected Double currentSteel;

	protected Double currentTimber;

	public ConstructionEn(){
		super();
	}

	public Double getCumulant() {
		return cumulant;
	}

	public void setCumulant(Double cumulant) {
		this.cumulant = cumulant;
	}

	public Double getCurrentConcrete() {
		return currentConcrete;
	}

	public void setCurrentConcrete(Double currentConcrete) {
		this.currentConcrete = currentConcrete;
	}

	public Double getCurrentSteel() {
		return currentSteel;
	}

	public void setCurrentSteel(Double currentSteel) {
		this.currentSteel = currentSteel;
	}

	public Double getCurrentTimber() {
		return currentTimber;
	}

	public void setCurrentTimber(double currentTimber) {
		this.currentTimber = currentTimber;
	}

	abstract String getQualificationDes();

}

