package com.jp.lms.source.daos;

import java.util.List;

import com.jp.lms.source.entities.Customer;
import com.jp.lms.source.exceptions.LmsException;

public interface DaoCustomer {
	public List<Customer> getAllCustomers() throws LmsException;
	public Customer getCustomerDetails(String customerId) throws LmsException;
	public String addCustomer(Customer customer) throws LmsException;
}
