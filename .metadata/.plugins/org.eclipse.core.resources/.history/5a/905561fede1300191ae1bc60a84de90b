package com.jp.lms.source.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jp.lms.source.daos.DaoBankEmp;
import com.jp.lms.source.entities.BankEmployee;
import com.jp.lms.source.exceptions.LmsException;

@Service("serviceEmp")
public class ServiceBankEmpImpl implements ServiceBankEmp {
	
	@Autowired
	@Qualifier("daoEmp") 
	private DaoBankEmp daoBankEmp;	

	@Override
	public BankEmployee validateUser(String empId, String password) throws LmsException {
		return daoBankEmp.validateUser(empId, password);
	}

	
	
	

}
