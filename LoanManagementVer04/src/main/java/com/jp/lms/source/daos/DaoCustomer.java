package com.jp.lms.source.daos;

import java.util.List;

import com.jp.lms.source.entities.Customer;
import com.jp.lms.source.exceptions.LmsException;

public interface DaoCustomer {
	public List<Customer> getAllCustomers() throws LmsException;
	public Customer getCustomerDetails(Long customerId) throws LmsException;
	public Long addCustomer(Customer customer) throws LmsException;
	public Long updateCustomer(Customer customer) throws LmsException;
}
