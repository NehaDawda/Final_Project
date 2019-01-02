package com.jp.lms.source.entities;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue(value="EDUCATION LOAN")
public class EducationLoan extends Loan {
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CUSTOMER_ASSET_ID")
	private Course course;

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
}