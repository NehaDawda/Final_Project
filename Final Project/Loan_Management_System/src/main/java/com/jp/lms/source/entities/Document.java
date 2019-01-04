package com.jp.lms.source.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LMS_DOCUMENT")
public class Document {
	
	@Id
	@Column(name="DOCUMENT_ID")
	private String documentId;
	
	@Column(name="DOCUMENT_TYPE")
	private String documentType;
	
	@Column(name="DOCUMENT_IDENTIFIER")
	private String documentIdentifier;
	
	@Column(name="SCAN_IMAGE_PATH")
	private String scanImagePath;
	
	public String getDocumentId() {
		return documentId;
	}
	
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}
	
	public String getDocumentType() {
		return documentType;
	}
	
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	
	public String getDocumentIdentifier() {
		return documentIdentifier;
	}
	
	public void setDocumentIdentifier(String documentIdentifier) {
		this.documentIdentifier = documentIdentifier;
	}
	
	public String getScanImagePath() {
		return scanImagePath;
	}
	
	public void setScanImagePath(String scanImagePath) {
		this.scanImagePath = scanImagePath;
	}
}
