package com.jp.lms.source.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jp.lms.source.entities.Customer;
import com.jp.lms.source.exceptions.LmsException;

@Repository("daoCust")
public class DaoCustomerImpl implements DaoCustomer {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Long addCustomer(Customer customer) {
		entityManager.persist(customer);
		return customer.getCustomerId();
	}

	@Override
	public List<Customer> getAllCustomers() throws LmsException {
		String sql = "SELECT c FROM Customer c";
		Query qry = entityManager.createQuery(sql);
		List<Customer> customerList = qry.getResultList() ;
		return customerList;
	}

	@Override
	public Customer getCustomerDetails(Long customerId) throws LmsException {
		Customer customer = entityManager.find(Customer.class, customerId);
		return customer;
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Long updateCustomer(Customer customer) throws LmsException {
		entityManager.merge(customer);
		return customer.getCustomerId();
	}

}
