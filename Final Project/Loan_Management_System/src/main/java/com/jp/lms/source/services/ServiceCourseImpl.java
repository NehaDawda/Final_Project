package com.jp.lms.source.services;

import java.util.List;

import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jp.lms.source.daos.DaoCourse;
import com.jp.lms.source.entities.Course;
import com.jp.lms.source.exceptions.LmsException;

@Service("service")
public class ServiceCourseImpl implements ServiceCourse {
	
	@PersistenceContext
	private DaoCourse daoCourse;
	
	public ServiceCourseImpl(@Qualifier("daoDS") DaoCourse daoCourse) throws LmsException{
		this.daoCourse = daoCourse;
	}
	
	@Override
	public List<Course> getCourseList() throws LmsException {
		return daoCourse.getAllCourses();
	}

	@Override
	public Course getCourseDetails(String courseId) throws LmsException {
		return daoCourse.getCourseDetails(courseId);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW, rollbackFor=LmsException.class)
	public String addCourse(Course course) throws LmsException {
		return daoCourse.addCourse(course);
	}
}
