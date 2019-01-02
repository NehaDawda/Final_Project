package com.jp.lms.source.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LMS_BANEK_EMPLOYEE")
public class BankEmployee {
	@Id
	@Column(name="EMP_ID")
	private String empId;
	
	@Column(name="EMP_NAME")
	private String empName;
	
	@Column(name="CONTACT_NUMBER")
	private Integer contactNumber;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="EMP_TYPE")
	private String empType;
	
	public String getEmpId() {
		return empId;
	}
	
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
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
	
	public String getEmpType() {
		return empType;
	}
	
	public void setEmpType(String empType) {
		this.empType = empType;
	}
}