package com.showroom.dto;

public class ModelDto {

	Integer id;
	String modelNo;
	String modelName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	@Override
	public String toString() {
		return "Model [id=" + id + ", modelNo=" + modelNo + ", modelName=" + modelName + "]";
	}
	
	
}
