package com.absmis.domain.authority;

import java.io.Serializable;
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */

@javax.persistence.Entity
public class Role implements Serializable {

    @javax.persistence.Id
    @javax.persistence.Column(nullable = false)
    protected Long id;
    @javax.persistence.Column(nullable = false)
    protected String no;
    @javax.persistence.Column(nullable = false)
    protected String description;
    @javax.persistence.OneToMany(mappedBy = "role")
    protected List<RoleAssResource> roleAssResource;


    public Role() {
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

    public List<RoleAssResource> getRoleAssResource() {
        return roleAssResource;
    }

    public void setRoleAssResource(List<RoleAssResource> roleAssResource) {
        this.roleAssResource = roleAssResource;
    }
}

