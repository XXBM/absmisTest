package com.absmis.domain.authority;

import java.util.Set;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */

@javax.persistence.Entity
public class Resource {


    @javax.persistence.Id
    @javax.persistence.Column(nullable = false)
    protected Long id;



    @javax.persistence.Column(nullable = false)
    protected String no;



    @javax.persistence.Column(nullable = false)
    protected String description;



    @javax.persistence.OneToMany(mappedBy = "resource")
    protected Set<RoleAssResource> roleAssResource;


    public Resource() {
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

    public Set<RoleAssResource> getRoleAssResource() {
        return roleAssResource;
    }

    public void setRoleAssResource(Set<RoleAssResource> roleAssResource) {
        this.roleAssResource = roleAssResource;
    }
}

