package com.jp.lms.source.services;

import java.util.List;

import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jp.lms.source.daos.DaoVehicle;
import com.jp.lms.source.entities.Vehicle;
import com.jp.lms.source.exceptions.LmsException;

@Service("service")
public class ServiceVehicleImpl implements ServiceVehicle {
	
	@PersistenceContext
	private DaoVehicle daoVehicle;
	
	public ServiceVehicleImpl(@Qualifier("daoDS") DaoVehicle daoVehicle) throws LmsException{
		this.daoVehicle = daoVehicle;
	}
	
	@Override
	public List<Vehicle> getVehicleList() throws LmsException {
		return daoVehicle.getAllVehicles();
	}

	@Override
	public Vehicle getVehicleDetails(String vehicleId) throws LmsException {
		return daoVehicle.getVehicleDetails(vehicleId);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW, rollbackFor=LmsException.class)
	public String addVehicle(Vehicle vehicle) throws LmsException {
		return daoVehicle.addVehicle(vehicle);
	}
}
