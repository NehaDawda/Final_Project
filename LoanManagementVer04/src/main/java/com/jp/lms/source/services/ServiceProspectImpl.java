package com.jp.lms.source.services;

import java.util.List;

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
		return daoProspect.getAllPropects();
	}

	@Override
	public Prospect getProspectDetails(Long prospectId) throws LmsException {
		return daoProspect.getProspectDetails(prospectId);
	}

	@Override
	public List<Prospect> getProspectsByStatus(String status) throws LmsException {
		return daoProspect.getProspectsByStatus(status);
	}

	
	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW, rollbackFor=LmsException.class)
	public Long registerProspect(Prospect prospect) throws LmsException {
		return daoProspect.addProspect(prospect);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW, rollbackFor=LmsException.class)
	public Long updateProspect(Prospect prospect) throws LmsException {
		return daoProspect.updateProspect(prospect);
	}
}