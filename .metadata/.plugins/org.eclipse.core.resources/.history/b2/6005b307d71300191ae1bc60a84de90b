package com.jp.lms.source.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jp.lms.source.entities.Property;

@Repository("daoProperty")
public class DaoPropertyImpl implements DaoProperty {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public String addProperty(Property property) {
		entityManager.persist(property);
		return property.getPropertyId();
	}

	
}
