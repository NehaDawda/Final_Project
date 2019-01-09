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
@Table(name="LMS_PROSPECT")
public class Prospect {
	@Id
	@SequenceGenerator(name="PROSPECT_SEQ", sequenceName="LMS_PROSPECT_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="PROSPECT_SEQ")
	@Column(name="PROSPECT_ID")
	private Long prospectId;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="LOAN_TYPE")
	private String loanType;
	
	@Column(name="INCOME")
	private Double income;
	
	@Column(name="REQUIRED_LOAN_AMT")
	private Double requiredLoanAmt;
	
	@Column(name="PAN_NUMBER")
	private String panNumber;
	
	@Column(name="AADHAR_NUMBER")
	private String aadharNumber;
	
	@Column(name="CONTACT_NUMBER")
	private String contactNumber;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="ENQUIRY_DATE")
	private Date enquiryDate;
	
	@Column(name="DOB")
	private Date dateOfBirth;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="CREDIT_LIMIT")
	private Double creditLimit;
	
	@Column(name="LAST_UPDATED_CREDIT_DATE")
	private Date lastUpdatedCreditDate;
	
	@Column(name="PROSPECT_ASSET_ID")
	private Long prospectAssetId;
	
	@Column(name="APPLICATION_STATUS")
	private String applicationStatus;
	
	public Long getProspectId() {
		return prospectId;
	}
	
	public void setProspectId(Long prospectId) {
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

	public Long getProspectAssetId() {
		return prospectAssetId;
	}

	public void setProspectAssetId(Long prospectAssetId) {
		this.prospectAssetId = prospectAssetId;
	}

	public String getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	@Override
	public String toString() {
		return "Prospect [prospectId=" + prospectId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", loanType=" + loanType + ", income=" + income + ", requiredLoanAmt="
				+ requiredLoanAmt + ", panNumber=" + panNumber + ", aadharNumber=" + aadharNumber + ", contactNumber="
				+ contactNumber + ", email=" + email + ", enquiryDate=" + enquiryDate + ", dateOfBirth=" + dateOfBirth
				+ ", city=" + city + ", creditLimit=" + creditLimit + ", lastUpdatedCreditDate=" + lastUpdatedCreditDate
				+ ", prospectAssetId=" + prospectAssetId + ", applicationStatus=" + applicationStatus + "]";
	}
	
	
}
