package com.absmis.domain.enterprise;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * 设计单位资质等级
 *
 * @generated
 */

@javax.persistence.Entity
public class DesignerCertification {
    @javax.persistence.Id
    private Long id;
    private String no;
    private String description;
    public DesignerCertification() {
        super();
    }

    public DesignerCertification(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

