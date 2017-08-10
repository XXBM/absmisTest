package com.absmis.domain.enterprise;


import com.absmis.controller.enterprise.CheckedStatus;

import javax.persistence.*;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * ConstructionEnIndustrialization
 *
 * @generated
 */
@Entity
public class ConstructionEnIndustrialization implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //新增装配式混凝土结构建筑的数量
    private Double addNewConcrete;
    //新增装配式钢结构建筑的数量
    private Double addNewSteel;
    // 新增装配式木建筑的数量
    private Double addNewTimber;

    @ManyToOne
    @JoinColumn(name = "checkedStatus_id")
    private CheckedStatus checkedStatus;


    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(name = "constructionEn_id")
    private ConstructionEn constructionEn;
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

    public CheckedStatus getCheckedStatus() {
        return checkedStatus;
    }

    public void setCheckedStatus(CheckedStatus checkedStatus) {
        this.checkedStatus = checkedStatus;
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


