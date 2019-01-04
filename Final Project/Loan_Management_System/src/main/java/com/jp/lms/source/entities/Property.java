package com.jp.lms.source.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LMS_PROPERTY")
public class Property {
	
	@Id
	@Column(name="PROPERTY_ID")
	private String propertyId;
	
	@Column(name="APARTMENT_NUMBER")
	private String apartmentNo;
	
	@Column(name="APARTMENT_NAME")
	private String apartmentName;
	
	@Column(name="STREET_NAME")
	private String streetName;
	
	@Column(name="LOCALITY")
	private String locality;
	
	@Column(name="LANDMARK")
	private String landmark;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="COUNTRY")
	private String country;
	
	@Column(name="ZIPCODE")	
	private String zipCode;
	
	@Column(name="PURCHASE_PRICE")
	private Double purchasedPrice;
	
	public String getPropertyId() {
		return propertyId;
	}
	
	public void setPropertyId(String propertyId) {
		this.propertyId = propertyId;
	}
	
	public String getApartmentNo() {
		return apartmentNo;
	}
	
	public void setApartmentNo(String apartmentNo) {
		this.apartmentNo = apartmentNo;
	}
	
	public String getApartmentName() {
		return apartmentName;
	}
	
	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}
	
	public String getStreetName() {
		return streetName;
	}
	
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	public String getLocality() {
		return locality;
	}
	
	public void setLocality(String locality) {
		this.locality = locality;
	}
	
	public String getLandmark() {
		return landmark;
	}
	
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public Double getPurchasedPrice() {
		return purchasedPrice;
	}
	
	public void setPurchasedPrice(Double purchasedPrice) {
		this.purchasedPrice = purchasedPrice;
	}
}
