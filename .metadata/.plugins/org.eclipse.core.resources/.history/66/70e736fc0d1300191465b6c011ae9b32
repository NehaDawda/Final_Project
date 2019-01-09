package com.jp.lms.source.services;

import java.util.List;

import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jp.lms.source.daos.DaoProspect;
import com.jp.lms.source.entities.Prospect;
import com.jp.lms.source.exceptions.LmsException;

@Service("service")
public class ServiceProspectImpl implements ServiceProspect {
	
	@Autowired
	@Qualifier("daoDS") 
	private DaoProspect daoProspect;	
	
	@Override
	public List<Prospect> getProspectList() throws LmsException {

		System.out.println("getAllPropects service ....");
		return daoProspect.getAllPropects();
	}

	@Override
	public Prospect getProspectDetails(String prospectId) throws LmsException {
		return daoProspect.getProspectDetails(prospectId);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW, rollbackFor=LmsException.class)
	public String registerProspect(Prospect prospect) throws LmsException {
		return daoProspect.addProspect(prospect);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW, rollbackFor=LmsException.class)
	public String updateProspect(Prospect prospect) throws LmsException {
		return daoProspect.updateProspect(prospect);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW, rollbackFor=LmsException.class)
	public String removeProspect(String prospectId) throws LmsException {
		return daoProspect.removeProspect(prospectId);
	}

}
