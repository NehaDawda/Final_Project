package com.jp.lms.source.services;

import com.jp.lms.source.entities.Property;
import com.jp.lms.source.exceptions.LmsException;

public interface ServiceProperty {
	public Long registerProperty(Property property) throws LmsException;
}
