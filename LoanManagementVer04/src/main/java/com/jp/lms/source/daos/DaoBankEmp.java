package com.jp.lms.source.daos;

import com.jp.lms.source.entities.BankEmployee;
import com.jp.lms.source.exceptions.LmsException;

public interface DaoBankEmp {
	public BankEmployee validateUser(String empId,String password) throws LmsException;
}
