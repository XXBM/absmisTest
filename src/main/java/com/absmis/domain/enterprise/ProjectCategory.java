package com.absmis.domain.enterprise;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *     项目类别
 * @generated
 */
 
@javax.persistence.Entity 
public class ProjectCategory
{
	 
	@javax.persistence.Id 
	@javax.persistence.Column(nullable = false) 
	protected Long id;

	@javax.persistence.Column(nullable = false) 
	protected String no;

	 
	@javax.persistence.Column(nullable = false) 
	protected String description;

	public ProjectCategory(){
		super();
	}
	public ProjectCategory(Long id){
		this.id = id;
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

}

