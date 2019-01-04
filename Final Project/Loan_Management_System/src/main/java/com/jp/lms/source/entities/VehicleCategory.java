package com.jp.lms.source.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="LMS_VEHICLE_CATEGORY")
public class VehicleCategory {
	
	@Column(name="BRAND_NAME")
	private String brandName;
	
	@Column(name="MODEL_NAME")
	private String modelName;
	
	@Column(name="TYPE")
	private String vehicleType;
	
	@Column(name="CATEGORY")
	private String category;
	
	@Column(name="PRICE")
	private Double price;
	
	@Column(name="CITY")
	private String city;
	
	public String getBrandName() {
		return brandName;
	}
	
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public String getModelName() {
		return modelName;
	}
	
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public String getVehicalType() {
		return vehicleType;
	}
	
	public void setVechicleType(String vechicleType) {
		this.vehicleType = vechicleType;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
}
