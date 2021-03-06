package com.jp.lms.source.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jp.lms.source.daos.DaoCustomer;
import com.jp.lms.source.daos.DaoHomeLoan;
import com.jp.lms.source.daos.DaoProperty;
import com.jp.lms.source.daos.DaoProspect;
import com.jp.lms.source.entities.Customer;
import com.jp.lms.source.entities.HomeLoan;
import com.jp.lms.source.entities.Property;
import com.jp.lms.source.entities.Prospect;
import com.jp.lms.source.exceptions.LmsException;

@Service("serviceApproveLoan")
public class ServiceApproveLoanImpl implements ServiceApproveLoan {
	
	@Autowired
	@Qualifier("daoDS") 
	private DaoProspect daoProspect;	
	
	@Autowired
	@Qualifier("daoCust") 
	private DaoCustomer daoCustomer;
	
	@Autowired
	@Qualifier("daoProperty") 
	private DaoProperty daoProperty;
	
	@Autowired
	@Qualifier("daoHomeLoan") 
	private DaoHomeLoan daoHomeLoan;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW, rollbackFor=LmsException.class)
	public String approveProspectLoan(Prospect prospect) throws LmsException {
		System.out.println("At Enter Prospect:" + prospect);
		Long prospectId = daoProspect.updateProspect(prospect);
		System.out.println("After Update Prospect:" + prospect);
		Customer customer = new Customer();
		customer.setFirstName(prospect.getFirstName());
		customer.setLastName(prospect.getLastName());
		customer.setAddress(prospect.getAddress());
		customer.setPanNumber(prospect.getPanNumber());
		customer.setAadharNumber(prospect.getAadharNumber());
		customer.setContactNumber(prospect.getContactNumber());
		customer.setEmail(prospect.getEmail());
		customer.setDateOfBirth(prospect.getDateOfBirth());
		customer.setCreditLimit(prospect.getCreditLimit());
		customer.setLastUpdatedCreditDate(prospect.getLastUpdatedCreditDate());
		
		System.out.println("Customer"+customer);
		
		Long customerId = daoCustomer.addCustomer(customer);
		System.out.println("CustomerId:" + customerId);
		Long loanAccNumber=0L;
		if(prospect.getLoanType().equals("HOME_LOAN")){
			HomeLoan homeLoan = new HomeLoan();
			homeLoan.setLoanAmount(prospect.getRequiredLoanAmt());
			homeLoan.setCustomerId(customerId);
			homeLoan.setLoanApproveDate(new Date());
			homeLoan.setInterestRate(8.9);
			homeLoan.setTenure(240);
			homeLoan.setCreditLimit(prospect.getCreditLimit());
			homeLoan.setLastUpdatedCreditLimit(prospect.getLastUpdatedCreditDate());
			System.out.println("Loan:"+ homeLoan);
			
			Property property = daoProperty.getPropertyDetails(prospect.getProspectAssetId());
			homeLoan.setProperty(property);
			
			loanAccNumber = daoHomeLoan.createHomeLoan(homeLoan);
			System.out.println("Loan Acc No:" +loanAccNumber);
		}
		
		String return_str = "Loan Approved for Prospect: " + prospectId + ". Loan Account Number: " + loanAccNumber + ". CustomerId: " + customerId;
		
		return return_str;
	}
}
