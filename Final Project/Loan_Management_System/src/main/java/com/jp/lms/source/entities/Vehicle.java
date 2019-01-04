package com.jp.lms.source.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LMS_VEHICLE")
public class Vehicle {
	
	@Id
	@Column(name="VEHICLE_ID")
	private String vehicleId;
	
	@Column(name="REGISTRATION_NUMBER")
	private String registrationNumber;
	
	@Column(name="BRAND_NAME")
	private String brandName;
	
	@Column(name="MODEL_NAME")
	private String modelName;
	
	@Column(name="TYPE")
	private String vechicleType;
	
	@Column(name="PURCHASE_DATE")
	private Date purchasedDate;
	
	@Column(name="PRICE")
	private Double purchasedPrice;
	
	public String getVehicleId() {
		return vehicleId;
	}
	
	public void setVechicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
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
	
	public String getVechicleType() {
		return vechicleType;
	}
	
	public void setVechicleType(String vechicleType) {
		this.vechicleType = vechicleType;
	}
	
	public Date getPurchasedDate() {
		return purchasedDate;
	}
	
	public void setPurchasedDate(Date purchasedDate) {
		this.purchasedDate = purchasedDate;
	}
	
	public Double getPurchasedPrice() {
		return purchasedPrice;
	}
	
	public void setPurchasedPrice(Double purchasedPrice) {
		this.purchasedPrice = purchasedPrice;
	}
}
