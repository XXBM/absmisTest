package com.absmis.domain.enterprise;


import javax.persistence.*;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * 构件企业
 *
 * @generated
 */
@Entity
public class ComponentEnIndustrialization {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //预制装配混凝土结构
    private Double prebuiltConcrete;
    //钢结构
    private Double prebuiltSteel;
    //木结构
    private Double prebuiltTimber;
    //其他结构的构件
    private Double prebuiltOther;

    @javax.persistence.ManyToOne
    @JoinColumn(name = "componentEn_id")
    private ComponentEn componentEn;
    public ComponentEnIndustrialization() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setPrebuiltOther(Double prebuiltOther) {
        this.prebuiltOther = prebuiltOther;
    }

    public ComponentEn getComponentEn() {
        return componentEn;
    }

    public void setComponentEn(ComponentEn componentEn) {
        this.componentEn = componentEn;
    }
}

