package com.jp.lms.source.services;

import java.util.List;

import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jp.lms.source.daos.DaoCustomer;
import com.jp.lms.source.entities.Customer;
import com.jp.lms.source.exceptions.LmsException;

@Service("service")
public class ServiceCustomerImpl implements ServiceCustomer {
	
	@PersistenceContext
	private DaoCustomer daoCustomer;
	
	public ServiceCustomerImpl(@Qualifier("daoDS") DaoCustomer daoCustomer) throws LmsException{
		this.daoCustomer = daoCustomer;
	}
	
	@Override
	public List<Customer> getCustomerList() throws LmsException {
		return daoCustomer.getAllCustomers();
	}

	@Override
	public Customer getCustomerDetails(String prospectId) throws LmsException {
		return daoCustomer.getCustomerDetails(prospectId);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW, rollbackFor=LmsException.class)
	public String addCustomer(Customer customer) throws LmsException {
		return daoCustomer.addCustomer(customer);
	}
}
