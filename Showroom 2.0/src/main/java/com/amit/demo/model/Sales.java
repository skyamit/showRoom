package com.amit.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Sales {
	@Id
	public int salesId;

	public int salesModelId;
	@DateTimeFormat(pattern="yyy-MM-dd-HH.mm.ss")
	public Date salesDate;

	public Sales() {

	}

	public Sales(int salesId, int salesModelId, Date salesDate) {
		this.salesId = salesId;
		this.salesModelId = salesModelId;
		this.salesDate = salesDate;
	}

	public int getSalesId() {
		return salesId;
	}

	public void setSalesId(int salesId) {
		this.salesId = salesId;
	}

	public int getSalesModelId() {
		return salesModelId;
	}

	public void setSalesModelId(int salesModelId) {
		this.salesModelId = salesModelId;
	}

	public Date getSalesDate() {
		return salesDate;
	}

	public void setSalesDate(Date salesDate) {
		this.salesDate = salesDate;
	}

}
