package com.absmis.domain.enterprise;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *     项目状态
 *
 * @generated
 */

@javax.persistence.Entity
public class ProjectState {


    @javax.persistence.Id
    @javax.persistence.Column(nullable = false)
    protected Long id;

    @javax.persistence.Column(nullable = false)
    protected String no;

    @javax.persistence.Column(nullable = false)
    protected String description;

    public ProjectState() {
        super();
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

