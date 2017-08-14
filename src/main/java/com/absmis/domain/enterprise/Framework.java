package com.absmis.domain.enterprise;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *     框架及剪框
 *
 * @generated
 */

@javax.persistence.Entity
public class Framework implements Serializable {
    @javax.persistence.Id
    private Long id;
    private String no;
    private String description;

    @ManyToOne
    @JoinColumn(name = "projectShear_id")
    private Project projectShear;

    @ManyToOne
    @JoinColumn(name = "projectCore_id")
    private Project projectCore;

    @ManyToOne
    @JoinColumn(name = "unitEngineeringCore_id")
    private UnitEngineering unitEngineeringCore;

    public Framework() {
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

    public Project getProjectShear() {
        return projectShear;
    }

    public void setProjectShear(Project projectShear) {
        this.projectShear = projectShear;
    }

    public Project getProjectCore() {
        return projectCore;
    }

    public void setProjectCore(Project projectCore) {
        this.projectCore = projectCore;
    }
}

