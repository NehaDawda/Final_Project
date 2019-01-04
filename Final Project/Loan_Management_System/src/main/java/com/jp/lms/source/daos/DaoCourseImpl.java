package com.jp.lms.source.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jp.lms.source.entities.Course;
import com.jp.lms.source.exceptions.LmsException;

@Repository("daoDS")
public class DaoCourseImpl implements DaoCourse {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public String addCourse(Course course) {
		entityManager.persist(course);
		return course.getCourseId();
	}

	@Override
	public List<Course> getAllCourses() throws LmsException {
		String sql = "SELECT e FROM empRec e";
		Query qry = entityManager.createQuery(sql);
		List<Course> courseList = qry.getResultList() ;
		
		return courseList;
	}

	@Override
	public Course getCourseDetails(String courseId) throws LmsException {
		Course course = entityManager.find(Course.class, courseId);
		return course;
	}
}
