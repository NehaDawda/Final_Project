package com.jp.lms.source.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="LMS_LOAN_DETAILS")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="LOAN_TYPE",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="LOAN")
public abstract class Loan {
	@Id
	@SequenceGenerator(name="LOAN_SEQ", sequenceName="LMS_LOAN_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="LOAN_SEQ")
	@Column(name="LOAN_ACC_NUMBER")
	private Long loanAccNumber;
	
	@Column(name="LOAN_AMOUNT")
	private Double loanAmount;
	
	@Column(name="CUSTOMER_ID")
	private Long customerId;
	
	@Column(name="LOAN_APPROVE_DATE")
	private Date loanApproveDate;
	
	@Column(name="DISPERSAL_DATE")
	private Date dispersalDate;
	
	@Column(name="INTEREST_RATE")
	private Double interestRate;
	
	@Column(name="TENURE")
	private Integer tenure;
	
	@Column(name="EMI_START_DATE")
	private Date EMIStartDate;
	
	@Column(name="EMI_END_DATE")
	private Date EMIEndDate;
	
	@Column(name="CREDIT_LIMIT")
	private Double creditLimit;
	
	@Column(name="LAST_UPDATED_CREDIT_DATE")
	private Date lastUpdatedCreditLimit;
	
	public Long getLoanAccNumber() {
		return loanAccNumber;
	}
	
	public void setLoanAccNumber(Long loanAccNumber) {
		this.loanAccNumber = loanAccNumber;
	}
	
	public Double getLoanAmount() {
		return loanAmount;
	}
	
	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	public Long getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	
	public Date getLoanApproveDate() {
		return loanApproveDate;
	}
	
	public void setLoanApproveDate(Date loanApproveDate) {
		this.loanApproveDate = loanApproveDate;
	}
	
	public Date getDispersalDate() {
		return dispersalDate;
	}
	
	public void setDispersalDate(Date dispersalDate) {
		this.dispersalDate = dispersalDate;
	}
	
	public Double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public Integer getTenure() {
		return tenure;
	}
	
	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}
	
	public Date getEMIStartDate() {
		return EMIStartDate;
	}
	
	public void setEMIStartDate(Date eMIStartDate) {
		EMIStartDate = eMIStartDate;
	}
	
	public Date getEMIEndDate() {
		return EMIEndDate;
	}
	
	public void setEMIEndDate(Date eMIEndDate) {
		EMIEndDate = eMIEndDate;
	}
	
	public Double getCreditLimit() {
		return creditLimit;
	}
	
	public void setCreditLimit(Double creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	public Date getLastUpdatedCreditLimit() {
		return lastUpdatedCreditLimit;
	}
	
	public void setLastUpdatedCreditLimit(Date lastUpdatedCreditLimit) {
		this.lastUpdatedCreditLimit = lastUpdatedCreditLimit;
	}
}