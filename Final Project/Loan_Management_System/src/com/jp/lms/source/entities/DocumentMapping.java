package com.jp.lms.source.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LMS_DOCUMENT_MAPPING")
public class DocumentMapping {
	@Id
	@Column(name="DOCUMENT_ID")
	private String documentId;
	
	@Id
	@Column(name="IDENTIFIER_ID")
	private String identifierId;
	
	@Column(name="IDENTIFIER_TYPE")
	private String identifierType;
	
	public String getDocumentId() {
		return documentId;
	}
	
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}
	
	public String getIdentifierId() {
		return identifierId;
	}
	
	public void setIdentifierId(String identifierId) {
		this.identifierId = identifierId;
	}
	
	public String getIdentifierType() {
		return identifierType;
	}
	
	public void setIdentifierType(String identifierType) {
		this.identifierType = identifierType;
	}
}
