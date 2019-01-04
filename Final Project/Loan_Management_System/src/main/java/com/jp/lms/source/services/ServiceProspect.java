package com.jp.lms.source.services;

import java.util.List;

import com.jp.lms.source.entities.Prospect;
import com.jp.lms.source.exceptions.LmsException;

public interface ServiceProspect {
	public List<Prospect>  getProspectList() throws LmsException;
	public Prospect getProspectDetails(String prospectId) throws LmsException;
	public String registerProspect(Prospect prospect) throws LmsException;
	public String updateProspect(Prospect prospect) throws LmsException;
	public String removeProspect(String prospectId) throws LmsException;
}
