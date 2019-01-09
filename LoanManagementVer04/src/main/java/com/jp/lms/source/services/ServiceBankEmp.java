package com.jp.lms.source.services;

import com.jp.lms.source.entities.BankEmployee;
import com.jp.lms.source.exceptions.LmsException;

public interface ServiceBankEmp {
	public BankEmployee validateUser(String empId,String password) throws LmsException;
}
