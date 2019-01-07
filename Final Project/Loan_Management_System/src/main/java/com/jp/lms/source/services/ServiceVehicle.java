package com.jp.lms.source.services;

import java.util.List;

import com.jp.lms.source.entities.Vehicle;
import com.jp.lms.source.exceptions.LmsException;

public interface ServiceVehicle {
	public List<Vehicle>  getVehicleList() throws LmsException;
	public Vehicle getVehicleDetails(String vehicleId) throws LmsException;
	public String addVehicle(Vehicle vehicle) throws LmsException;
}
