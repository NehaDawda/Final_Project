package com.jp.lms.source.entities;

public class VechicleCategory {
	private String brandName;
	private String modelName;
	private String vechicalType;
	private String category;
	private Double price;
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
	
	public String getVechicalType() {
		return vechicalType;
	}
	
	public void setVechicalType(String vechicalType) {
		this.vechicalType = vechicalType;
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
