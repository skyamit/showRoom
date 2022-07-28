package com.amit.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class CarModel {
	@Id
	public int modelId;

	public int modelNumber;
	public String modelName;
	public int modelBrandId;
	public String modelEngine;
	public double modelPrice;
	@DateTimeFormat(pattern = "yyy-MM-dd-HH.mm.ss")
	public Date date;

	public CarModel() {
	}

	public CarModel(int modelId, int modelNumber, String modelName, int modelBrandId, String modelEngine,
			double modelPrice, Date date) {
		this.modelId = modelId;
		this.modelNumber = modelNumber;
		this.modelName = modelName;
		this.modelBrandId = modelBrandId;
		this.modelEngine = modelEngine;
		this.modelPrice = modelPrice;
		this.date = date;
	}

	public int getModelId() {
		return modelId;
	}

	public void setModelId(int modelId) {
		this.modelId = modelId;
	}

	public int getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getModelBrandId() {
		return modelBrandId;
	}

	public void setModelBrandId(int modelBrandId) {
		this.modelBrandId = modelBrandId;
	}

	public String getModelEngine() {
		return modelEngine;
	}

	public void setModelEngine(String modelEngine) {
		this.modelEngine = modelEngine;
	}

	public double getModelPrice() {
		return modelPrice;
	}

	public void setModelPrice(double modelPrice) {
		this.modelPrice = modelPrice;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
