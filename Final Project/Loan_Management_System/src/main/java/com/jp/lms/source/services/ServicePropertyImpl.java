package com.jp.lms.source.services;

import java.util.List;

import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jp.lms.source.daos.DaoProperty;
import com.jp.lms.source.entities.Property;
import com.jp.lms.source.exceptions.LmsException;

@Service("service")
public class ServicePropertyImpl implements ServiceProperty {
	
	@PersistenceContext
	private DaoProperty daoProperty;
	
	public ServicePropertyImpl(@Qualifier("daoDS") DaoProperty daoProperty) throws LmsException{
		this.daoProperty = daoProperty;
	}
	
	@Override
	public List<Property> getPropertyList() throws LmsException {
		return daoProperty.getAllProperties();
	}

	@Override
	public Property getPropertyDetails(String propertyId) throws LmsException {
		return daoProperty.getPropertyDetails(propertyId);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW, rollbackFor=LmsException.class)
	public String addProperty(Property property) throws LmsException {
		return daoProperty.addProperty(property);
	}
}
