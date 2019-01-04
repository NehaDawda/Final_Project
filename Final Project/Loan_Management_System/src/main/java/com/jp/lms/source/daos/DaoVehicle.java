package com.jp.lms.source.daos;

import java.util.List;

import com.jp.lms.source.entities.Vehicle;
import com.jp.lms.source.exceptions.LmsException;

public interface DaoVehicle {
	public List<Vehicle> getAllVehicles() throws LmsException;
	public Vehicle getVehicleDetails(String vehicleId) throws LmsException;
	public String addVehicle(Vehicle vehicle) throws LmsException;
}
