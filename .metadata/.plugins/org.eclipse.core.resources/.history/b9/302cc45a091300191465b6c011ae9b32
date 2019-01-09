package com.jp.lms.source.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jp.lms.source.entities.Vehicle;
import com.jp.lms.source.exceptions.LmsException;

@Repository("daoDS")
public class DaoVehicleImpl implements DaoVehicle {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public String addVehicle(Vehicle vehicle) {
		entityManager.persist(vehicle);
		return vehicle.getVehicleId();
	}

	@Override
	public List<Vehicle> getAllVehicles() throws LmsException {
		String sql = "SELECT e FROM empRec e";
		Query qry = entityManager.createQuery(sql);
		List<Vehicle> vehicleList = qry.getResultList() ;
		
		return vehicleList;
	}

	@Override
	public Vehicle getVehicleDetails(String vehicleId) throws LmsException {
		Vehicle vehicle = entityManager.find(Vehicle.class, vehicleId);
		return vehicle;
	}
}
