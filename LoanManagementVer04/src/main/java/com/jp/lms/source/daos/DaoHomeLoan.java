package com.jp.lms.source.daos;

import java.util.List;

import com.jp.lms.source.entities.HomeLoan;
import com.jp.lms.source.exceptions.LmsException;

public interface DaoHomeLoan {
	public List<HomeLoan> getAllHomeLoans() throws LmsException;
	public HomeLoan getHomeLoanDetails(Integer loanAccNumber) throws LmsException;
	public Long createHomeLoan(HomeLoan homeLoan) throws LmsException;
}
