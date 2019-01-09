package com.jp.lms.source.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jp.lms.source.entities.BankEmployee;
import com.jp.lms.source.entities.Property;
import com.jp.lms.source.entities.Prospect;
import com.jp.lms.source.exceptions.LmsException;

@Repository("daoEmp")
public class DaoBankEmpImpl implements DaoBankEmp {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public BankEmployee validateUser(String empId, String password) throws LmsException {
		TypedQuery<BankEmployee> query = entityManager.createQuery("SELECT emp from BankEmployee emp where emp.empId = :empId and emp.password = :password", BankEmployee.class);
		query.setParameter("empId", empId);
		query.setParameter("password", password);
		List<BankEmployee> emp = query.getResultList() ;
		if(emp.size()>0){
			return emp.get(0);
		}else{
			return null;
		}
	}

	
	
}
