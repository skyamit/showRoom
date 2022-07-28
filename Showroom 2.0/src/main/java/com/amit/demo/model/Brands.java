package com.amit.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Brands {
	@Id
	public int brandId;

	public String brandName;

	@DateTimeFormat(pattern="yyy-MM-dd-HH.mm.ss")
	public Date date;

	public Brands() {
	}

	public Brands(int brandId, String brandName, Date date) {
		this.brandId = brandId;
		this.brandName = brandName;
		this.date = date;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
