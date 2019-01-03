package com.jp.lms.source.daos;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.jp.lms.source.entities.Prospect;

public class DaoProspectImpl implements DaoProspect {
	
	@Autowired
	private DataSource dataSource;
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public String insertNewRecord(Prospect prospect) {
		entityManager.persist(prospect);
		return prospect.getProspectId();
	}

}