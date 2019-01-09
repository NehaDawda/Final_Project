package com.jp.lms.source.entities;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue(value="VEHICLE LOAN")
public class VehicleLoan extends Loan {
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CUSTOMER_ASSET_ID")
	private Vehicle vehicle;

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVechicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
}
