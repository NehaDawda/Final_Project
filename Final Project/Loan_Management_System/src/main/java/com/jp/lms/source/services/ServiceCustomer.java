package com.jp.lms.source.services;

import java.util.List;

import com.jp.lms.source.entities.Customer;
import com.jp.lms.source.exceptions.LmsException;

public interface ServiceCustomer {
	public List<Customer>  getCustomerList() throws LmsException;
	public Customer getCustomerDetails(String customerId) throws LmsException;
	public String addCustomer(Customer customer) throws LmsException;
}
