package com.absmis.domain.authority;

import java.io.Serializable;
import java.util.Set;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */

@javax.persistence.Entity
public class Resource implements Serializable {
    @javax.persistence.Id
    @javax.persistence.Column(nullable = false)
    private Long id;
    private String text;
    private String no;
    /**
     * 菜单路径
     */
    private String url;
    @javax.persistence.OneToMany(mappedBy = "resource")
    private Set<RoleAssResource> roleAssResource;

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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Set<RoleAssResource> getRoleAssResource() {
        return roleAssResource;
    }

    public void setRoleAssResource(Set<RoleAssResource> roleAssResource) {
        this.roleAssResource = roleAssResource;
    }
}

