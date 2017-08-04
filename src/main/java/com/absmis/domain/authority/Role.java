package com.absmis.domain.authority;

import java.util.Set;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
 
@javax.persistence.Entity 
public class Role
{
	 
	@javax.persistence.Id 
	@javax.persistence.Column(nullable = false) 
	protected Long id;
	 
	@javax.persistence.Column(nullable = false) 
	protected String no;

	@javax.persistence.Column(nullable = false) 
	protected String description;

	 
	@javax.persistence.OneToMany(mappedBy = "role") 
	protected Set<User> user;

	 
	@javax.persistence.OneToMany(mappedBy = "role") 
	protected Set<RoleAssResource> roleAssResource;


	public Role(){
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

	public Set<User> getUser() {
		return user;
	}

	public void setUser(Set<User> user) {
		this.user = user;
	}

	public Set<RoleAssResource> getRoleAssResource() {
		return roleAssResource;
	}

	public void setRoleAssResource(Set<RoleAssResource> roleAssResource) {
		this.roleAssResource = roleAssResource;
	}
}

