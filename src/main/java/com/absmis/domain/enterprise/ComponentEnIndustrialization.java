package com.absmis.domain.enterprise;


import javax.persistence.*;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * ConstructionEnIndustrialization
 *
 * @generated
 */
@Entity
public class ComponentEnIndustrialization {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double cumulant;
    private Double currentConcrete;
    private Double currentSteel;
    private Double currentTimber;

    @javax.persistence.ManyToOne
    @JoinColumn(name = "componentEn_id")
    private ComponentEn componentEn;
    public ComponentEnIndustrialization() {
        super();
    }

    public Double getCumulant() {
        return cumulant;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setCurrentTimber(Double currentTimber) {
        this.currentTimber = currentTimber;
    }

    public ComponentEn getComponentEn() {
        return componentEn;
    }

    public void setComponentEn(ComponentEn componentEn) {
        this.componentEn = componentEn;
    }
}

