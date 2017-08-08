package com.absmis.domain.enterprise;


import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Set;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 * Industrialization
 */
 
@javax.persistence.Entity 
public class ComponentEn extends Organization
{

	@JsonIgnore
	@javax.persistence.OneToMany(mappedBy = "componentEn")
	private Set<ComponentEnIndustrialization> componentEnIndustrializations;

	public ComponentEn(){
		super();
	}

	public Set<ComponentEnIndustrialization> getComponentEnIndustrializations() {
		return componentEnIndustrializations;
	}

	public void setComponentEnIndustrializations(Set<ComponentEnIndustrialization> componentEnIndustrializations) {
		this.componentEnIndustrializations = componentEnIndustrializations;
	}
}

