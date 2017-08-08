package com.absmis.domain.authority;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;
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
    /**
     * 自关联
     * 子类
     */

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private List<Resource> children;
    /**
     * JPA的自关联
     * 父类
     */
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Resource parent;

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

    public List<Resource> getChildren() {
        return children;
    }

    public void setChildren(List<Resource> children) {
        this.children = children;
    }

    public Resource getParent() {
        return parent;
    }

    public void setParent(Resource parent) {
        this.parent = parent;
    }

    public Set<RoleAssResource> getRoleAssResource() {
        return roleAssResource;
    }

    public void setRoleAssResource(Set<RoleAssResource> roleAssResource) {
        this.roleAssResource = roleAssResource;
    }
}

