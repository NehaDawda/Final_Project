package com.jp.lms.source.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jp.lms.source.daos.DaoProperty;
import com.jp.lms.source.daos.DaoProspect;
import com.jp.lms.source.entities.Property;
import com.jp.lms.source.entities.Prospect;
import com.jp.lms.source.exceptions.LmsException;

@Service("serviceNewLoanAppl")
public class ServiceNewLoanApplImpl implements ServiceNewLoanAppl {
	
	@Autowired
	@Qualifier("daoDS") 
	private DaoProspect daoProspect;
	
	@Autowired
	@Qualifier("daoProperty") 
	private DaoProperty daoProperty;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW, rollbackFor=LmsException.class)
	public Long registerNewHomeLoanAppl(Prospect prospect,Property property) throws LmsException {
		Long propertyId = daoProperty.addProperty(property);
		prospect.setProspectAssetId(propertyId);
    	return daoProspect.addProspect(prospect);
	}

}
