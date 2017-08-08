package com.absmis.domain.enterprise;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated Industrialization
 */

@javax.persistence.Entity
public class MachineryEnIndustrialization {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Double integralWall;


    private Double specialTransportEquipment;


    private Double specialConstructionEquipment;

    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    protected MachineryEn machineryEn;

    public MachineryEnIndustrialization() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setSpecialConstructionEquipment(Double specialConstructionEquipment) {
        this.specialConstructionEquipment = specialConstructionEquipment;
    }

    public MachineryEn getMachineryEn() {
        return machineryEn;
    }

    public void setMachineryEn(MachineryEn machineryEn) {
        this.machineryEn = machineryEn;
    }
}

