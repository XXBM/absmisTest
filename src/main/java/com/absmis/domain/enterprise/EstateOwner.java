package com.absmis.domain.enterprise;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
    @JsonIgnore
    @javax.persistence.OneToMany(mappedBy = "estateOwner")
    private Set<Project> project;

    public EstateOwner() {
        super();
    }

    @Override
    public String getEnterpriseType() {
        return "建设单位";
    }

    public Set<Project> getProject() {
        return project;
    }

    public void setProject(Set<Project> project) {
        this.project = project;
    }
}

