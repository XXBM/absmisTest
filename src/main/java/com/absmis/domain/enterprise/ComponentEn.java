package com.absmis.domain.enterprise;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
 
@javax.persistence.Entity 
public class ComponentEn extends Organization
{

	private Double prebuiltConcrete;

	private Double prebuiltSteel;


	private Double prebuiltTimber;

	private Double prebuiltOther;


	public ComponentEn(){
		super();
	}

	public Double getPrebuiltConcrete() {
		return prebuiltConcrete;
	}

	public void setPrebuiltConcrete(Double prebuiltConcrete) {
		this.prebuiltConcrete = prebuiltConcrete;
	}

	public Double getPrebuiltSteel() {
		return prebuiltSteel;
	}

	public void setPrebuiltSteel(Double prebuiltSteel) {
		this.prebuiltSteel = prebuiltSteel;
	}

	public Double getPrebuiltTimber() {
		return prebuiltTimber;
	}

	public void setPrebuiltTimber(Double prebuiltTimber) {
		this.prebuiltTimber = prebuiltTimber;
	}

	public Double getPrebuiltOther() {
		return prebuiltOther;
	}

	public void setPrebuiltOther(double prebuiltOther) {
		this.prebuiltOther = prebuiltOther;
	}
}

