package com.jp.lms.source.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jp.lms.source.entities.Property;
import com.jp.lms.source.exceptions.LmsException;

@Repository("daoDS")
public class DaoPropertyImpl implements DaoProperty {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public String addProperty(Property property) {
		entityManager.persist(property);
		return property.getPropertyId();
	}

	@Override
	public List<Property> getAllProperties() throws LmsException {
		String sql = "SELECT e FROM empRec e";
		Query qry = entityManager.createQuery(sql);
		List<Property> propertyList = qry.getResultList() ;
		
		return propertyList;
	}

	@Override
	public Property getPropertyDetails(String propertyId) throws LmsException {
		Property property = entityManager.find(Property.class, propertyId);
		return property;
	}
}
