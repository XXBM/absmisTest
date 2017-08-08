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
public class ConstructionEnIndustrialization {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    protected Double addNewConcrete;
    protected Double addNewSteel;
    protected Double addNewTimber;


    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    protected ConstructionEn constructionEn;
    public ConstructionEnIndustrialization() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAddNewConcrete() {
        return addNewConcrete;
    }

    public void setAddNewConcrete(Double addNewConcrete) {
        this.addNewConcrete = addNewConcrete;
    }

    public Double getAddNewSteel() {
        return addNewSteel;
    }

    public void setAddNewSteel(Double addNewSteel) {
        this.addNewSteel = addNewSteel;
    }

    public Double getAddNewTimber() {
        return addNewTimber;
    }

    public void setAddNewTimber(Double addNewTimber) {
        this.addNewTimber = addNewTimber;
    }

    public ConstructionEn getConstructionEn() {
        return constructionEn;
    }

    public void setConstructionEn(ConstructionEn constructionEn) {
        this.constructionEn = constructionEn;
    }
}

