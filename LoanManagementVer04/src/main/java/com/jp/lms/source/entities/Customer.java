package com.jp.lms.source.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="LMS_CUSTOMER")
public class Customer {
	
	@Id
	@SequenceGenerator(name="CUSTOMER_SEQ", sequenceName="LMS_CUSTOMER_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="CUSTOMER_SEQ")
	@Column(name="CUSTOMER_ID")
	private Long customerId;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="PAN_NUMBER")
	private String panNumber;
	
	@Column(name="AADHAR_NUMBER")
	private String aadharNumber;
	
	@Column(name="CONTACT_NUMBER")
	private String contactNumber;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="DOB")
	private Date dateOfBirth;
	
	@Column(name="CREDIT_LIMIT")
	private Double creditLimit;
	
	@Column(name="LAST_UPDATED_CREDIT_DATE")
	private Date lastUpdatedCreditDate;
	
	public Long getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPanNumber() {
		return panNumber;
	}
	
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	
	public String getAadharNumber() {
		return aadharNumber;
	}
	
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	
	public String getContactNumber() {
		return contactNumber;
	}
	
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public Double getCreditLimit() {
		return creditLimit;
	}
	
	public void setCreditLimit(Double creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	public Date getLastUpdatedCreditDate() {
		return lastUpdatedCreditDate;
	}
	
	public void setLastUpdatedCreditDate(Date lastUpdatedCreditDate) {
		this.lastUpdatedCreditDate = lastUpdatedCreditDate;
	}
}
