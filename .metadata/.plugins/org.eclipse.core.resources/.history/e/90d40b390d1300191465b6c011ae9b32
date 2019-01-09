package com.jp.lms.source.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jp.lms.source.entities.Prospect;
import com.jp.lms.source.exceptions.LmsException;

@Repository("daoDS")
public class DaoProspectImpl implements DaoProspect {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public String addProspect(Prospect prospect) {
		entityManager.persist(prospect);
		return prospect.getProspectId();
	}

	@Override
	public List<Prospect> getAllPropects() throws LmsException {
		String sql = "SELECT e FROM Prospect e";
		Query qry = entityManager.createQuery(sql);
		List<Prospect> prospectList = qry.getResultList() ;
		System.out.println("getAllPropects dao ...."+prospectList);
		return prospectList;
	}

	@Override
	public Prospect getProspectDetails(String prospectId) throws LmsException {
		Prospect prospect = entityManager.find(Prospect.class, prospectId);
		return prospect;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public String removeProspect(String prospectId) throws LmsException {
		entityManager.remove(prospectId);
		return prospectId;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public String updateProspect(Prospect prospect) throws LmsException {
		entityManager.merge(prospect);
		return prospect.getProspectId();
	}

}
