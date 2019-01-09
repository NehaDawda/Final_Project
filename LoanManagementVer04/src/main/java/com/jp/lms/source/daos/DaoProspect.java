package com.jp.lms.source.daos;

import java.util.List;

import com.jp.lms.source.entities.Prospect;
import com.jp.lms.source.exceptions.LmsException;

public interface DaoProspect {
	public List<Prospect> getAllPropects() throws LmsException;
	public Prospect getProspectDetails(Long prospectId) throws LmsException;
	public List<Prospect> getProspectsByStatus(String status) throws LmsException;
	public Long addProspect(Prospect prospect) throws LmsException;
	//public String removeProspect(String prospectId) throws LmsException;
	public Long updateProspect(Prospect prospect) throws LmsException;
}
