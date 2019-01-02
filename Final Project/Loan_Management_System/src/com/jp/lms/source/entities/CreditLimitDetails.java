package com.jp.lms.source.entities;

import java.util.Date;

public class CreditLimitDetails {
	private String panNumber;
	private String aadharNumber;
	private Double creditLimit;
	private Date lastUpdatedCreditDate;
	
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
