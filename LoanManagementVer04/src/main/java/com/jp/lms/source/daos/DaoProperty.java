package com.jp.lms.source.daos;

import com.jp.lms.source.entities.Property;
import com.jp.lms.source.exceptions.LmsException;

public interface DaoProperty {
	public Long addProperty(Property property) throws LmsException;
	public Property getPropertyDetails(Long propertyId) throws LmsException;
	public Long updateProperty(Property property) throws LmsException;
}
