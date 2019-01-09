package com.jp.lms.source.services;

import com.jp.lms.source.entities.Prospect;
import com.jp.lms.source.exceptions.LmsException;

public interface ServiceApproveLoan {
	public String approveProspectLoan(Prospect prospect) throws LmsException;
}