package com.absmis.domain.enterprise;

import java.util.Set;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
 
@javax.persistence.Entity
public class EstateOwner extends Organization
{
	 
	@javax.persistence.OneToMany(mappedBy = "estateOwner") 
	protected Set<Project> project;
	public EstateOwner(){
		super();
	}

	public Set<Project> getProject() {
		return project;
	}

	public void setProject(Set<Project> project) {
		this.project = project;
	}
}

