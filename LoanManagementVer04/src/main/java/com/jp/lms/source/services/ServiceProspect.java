package com.jp.lms.source.services;

import java.util.List;

import com.jp.lms.source.entities.Prospect;
import com.jp.lms.source.exceptions.LmsException;

public interface ServiceProspect {
	public List<Prospect>  getProspectList() throws LmsException;
	public Prospect getProspectDetails(Long prospectId) throws LmsException;
	public List<Prospect>  getProspectsByStatus(String status) throws LmsException;
	public Long registerProspect(Prospect prospect) throws LmsException;
	public Long updateProspect(Prospect prospect) throws LmsException;
}