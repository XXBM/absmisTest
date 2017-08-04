package com.absmis.domain.enterprise;


import javax.persistence.DiscriminatorValue;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
 
@javax.persistence.Entity
@DiscriminatorValue("Builder")
public class Builder extends ConstructionEn
{
	 
	@javax.persistence.Column(nullable = false) 
	protected String qualificationNo;


	 
	@javax.persistence.Column(nullable = false) 
	protected String qualificationDes;

	public Builder(){
		super();
	}

	public String getQualificationNo() {
		return qualificationNo;
	}

	public void setQualificationNo(String qualificationNo) {
		this.qualificationNo = qualificationNo;
	}

	public String getQualificationDes() {
		return qualificationDes;
	}

	public void setQualificationDes(String qualificationDes) {
		this.qualificationDes = qualificationDes;
	}
}

