package com.absmis.domain.enterprise;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *     工程结构形式
 * @generated
 */
 
@javax.persistence.Entity 
public class StructureForm
{

	@javax.persistence.Id
	private Long id;
	private String no;
	private String description;


	public StructureForm(){
		super();
	}
	public StructureForm(Long id){
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

