package com.jp.lms.source.daos;

import java.util.List;

import com.jp.lms.source.entities.Property;
import com.jp.lms.source.exceptions.LmsException;

public interface DaoProperty {
	public List<Property> getAllProperties() throws LmsException;
	public Property getPropertyDetails(String courseId) throws LmsException;
	public String addProperty(Property property) throws LmsException;
}
