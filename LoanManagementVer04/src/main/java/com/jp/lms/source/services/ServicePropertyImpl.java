package com.jp.lms.source.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jp.lms.source.daos.DaoProperty;
import com.jp.lms.source.entities.Property;
import com.jp.lms.source.exceptions.LmsException;

@Service("serviceProperty")
public class ServicePropertyImpl implements ServiceProperty {
	
	@Autowired
	@Qualifier("daoProperty") 
	private DaoProperty daoProperty;	
	
	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW, rollbackFor=LmsException.class)
	public Long registerProperty(Property property) throws LmsException {
		return daoProperty.addProperty(property);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW, rollbackFor=LmsException.class)
	public Long updateProperty(Property property) throws LmsException {
		return daoProperty.updateProperty(property);
	}

	@Override
	public Property getPropertyDetails(Long propertyId) throws LmsException {
		return daoProperty.getPropertyDetails(propertyId);
	}

	
}
