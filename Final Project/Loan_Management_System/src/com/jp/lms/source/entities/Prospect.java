package com.jp.lms.source.entities;

import java.util.Date;

public class Prospect {
	private String prospectId;
	private String firstName;
	private String lastName;
	private String address;
	private String loanType;
	private Double income;
	private Double requiredLoanAmt;
	private String panNumber;
	private String aadharNumber;
	private Integer contactNumber;
	private String email;
	private Date enquiryDate;
	private Date dateOfBirth;
	private String city;
	private Double creditLimit;
	private Date lastUpdatedCreditDate;
	
	public String getProspectId() {
		return prospectId;
	}
	
	public void setProspectId(String prospectId) {
		this.prospectId = prospectId;
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
	
	public String getLoanType() {
		return loanType;
	}
	
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	
	public Double getIncome() {
		return income;
	}
	
	public void setIncome(Double income) {
		this.income = income;
	}
	
	public Double getRequiredLoanAmt() {
		return requiredLoanAmt;
	}
	
	public void setRequiredLoanAmt(Double requiredLoanAmt) {
		this.requiredLoanAmt = requiredLoanAmt;
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
	
	public Integer getContactNumber() {
		return contactNumber;
	}
	
	public void setContactNumber(Integer contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getEnquiryDate() {
		return enquiryDate;
	}
	
	public void setEnquiryDate(Date enquiryDate) {
		this.enquiryDate = enquiryDate;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
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
