package com.absmis.domain.enterprise;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
 
@javax.persistence.Entity 
public class MachineryEn extends Enterprise
{

	private Double integralWall;


	private Double specialTransportEquipment;


	private Double specialConstructionEquipment;

	public MachineryEn(){
		super();
	}

	public Double getIntegralWall() {
		return integralWall;
	}

	public void setIntegralWall(Double integralWall) {
		this.integralWall = integralWall;
	}

	public Double getSpecialTransportEquipment() {
		return specialTransportEquipment;
	}

	public void setSpecialTransportEquipment(Double specialTransportEquipment) {
		this.specialTransportEquipment = specialTransportEquipment;
	}

	public Double getSpecialConstructionEquipment() {
		return specialConstructionEquipment;
	}

	public void setSpecialConstructionEquipment(double specialConstructionEquipment) {
		this.specialConstructionEquipment = specialConstructionEquipment;
	}
}

