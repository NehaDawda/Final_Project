package com.jp.lms.source.daos;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

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
		prospect.setEnquiryDate(new Date());
		entityManager.persist(prospect);
		return prospect.getProspectId();
	}

	@Override
	public List<Prospect> getAllPropects() throws LmsException {
		String sql = "SELECT p FROM Prospect p";
		Query qry = entityManager.createQuery(sql);
		List<Prospect> prospectList = qry.getResultList() ;
		return prospectList;
	}

	@Override
	public Prospect getProspectDetails(String prospectId) throws LmsException {
		Prospect prospect = entityManager.find(Prospect.class, prospectId);
		return prospect;
	}

	@Override
	public List<Prospect> getProspectsByStatus(String status) throws LmsException {
		TypedQuery<Prospect> query = entityManager.createQuery("SELECT p from PROSPECT p where p.applicationStatus = :app_status", Prospect.class);
		query.setParameter("app_status", status);
		List<Prospect> prospectList = query.getResultList() ;
		return prospectList;
	}
	
	/*@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public String removeProspect(String prospectId) throws LmsException {
		entityManager.remove(prospectId);
		return prospectId;
	}*/

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public String updateProspect(Prospect prospect) throws LmsException {
		entityManager.merge(prospect);
		return prospect.getProspectId();
	}

}
