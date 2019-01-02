package com.jp.lms.source.entities;

public class EducationLoan extends Loan {
	private Course course;

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
}
