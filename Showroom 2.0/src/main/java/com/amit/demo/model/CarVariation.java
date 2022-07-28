package com.amit.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CarVariation {
	@Id
	public int carVariationId;

	public int carVariationModelId;
	public String carVariationColor;
	public int carVariationCount;

	public CarVariation() {

	}

	public CarVariation(int carVariationId, int carVariationModelId, String carVariationColor, int carVariationCount) {
		this.carVariationId = carVariationId;
		this.carVariationModelId = carVariationModelId;
		this.carVariationColor = carVariationColor;
		this.carVariationCount = carVariationCount;
	}

	public int getCarVariationId() {
		return carVariationId;
	}

	public void setCarVariationId(int carVariationId) {
		this.carVariationId = carVariationId;
	}

	public int getCarVariationModelId() {
		return carVariationModelId;
	}

	public void setCarVariationModelId(int carVariationModelId) {
		this.carVariationModelId = carVariationModelId;
	}

	public String getCarVariationColor() {
		return carVariationColor;
	}

	public void setCarVariationColor(String carVariationColor) {
		this.carVariationColor = carVariationColor;
	}

	public int getCarVariationCount() {
		return carVariationCount;
	}

	public void setCarVariationCount(int carVariationCount) {
		this.carVariationCount = carVariationCount;
	}
}
