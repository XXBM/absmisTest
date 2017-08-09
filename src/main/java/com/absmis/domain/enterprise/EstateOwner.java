package com.absmis.domain.enterprise;

import java.util.Set;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * 建设单位
 *
 * @generated
 */

@javax.persistence.Entity
public class EstateOwner extends Organization {

    //项目
    @javax.persistence.OneToMany(mappedBy = "estateOwner")
    private Set<Project> project;

    public EstateOwner() {
        super();
    }

    public Set<Project> getProject() {
        return project;
    }

    public void setProject(Set<Project> project) {
        this.project = project;
    }
}

