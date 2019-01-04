package com.jp.lms.source.services;

import java.util.List;

import com.jp.lms.source.entities.Course;
import com.jp.lms.source.exceptions.LmsException;

public interface ServiceCourse {
	public List<Course>  getCourseList() throws LmsException;
	public Course getCourseDetails(String courseId) throws LmsException;
	public String addCourse(Course course) throws LmsException;
}
