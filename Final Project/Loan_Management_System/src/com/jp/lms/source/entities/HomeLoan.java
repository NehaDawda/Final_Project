package com.jp.lms.source.entities;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue(value="HOME LOAN")
public class HomeLoan extends Loan {
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CUSTOMER_ASSET_ID")
	private Property property;

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}
}
