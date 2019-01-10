package com.jp.lms.source.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jp.lms.source.entities.Property;
import com.jp.lms.source.entities.Prospect;
import com.jp.lms.source.exceptions.LmsException;

@Repository("daoProperty")
public class DaoPropertyImpl implements DaoProperty {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Long addProperty(Property property) {
		entityManager.persist(property);
		return property.getPropertyId();
	}

	@Override
	public Property getPropertyDetails(Long propertyId) throws LmsException {
		Property property = entityManager.find(Property.class, propertyId);
		return property;
	}

	
}
