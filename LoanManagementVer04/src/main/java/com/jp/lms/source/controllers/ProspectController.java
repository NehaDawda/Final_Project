package com.jp.lms.source.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.jp.lms.source.entities.Property;
import com.jp.lms.source.entities.Prospect;
import com.jp.lms.source.exceptions.LmsException;
import com.jp.lms.source.services.ServiceApproveLoan;
import com.jp.lms.source.services.ServiceNewLoanAppl;
import com.jp.lms.source.services.ServiceProperty;
import com.jp.lms.source.services.ServiceProspect;

//import com.jp.lms.source.services.ServiceProspect;



/*
 * @Controller: A kind of @Component to declare SpringMVC controllers.
 * @RequestMapping: To map a controlling method to the URL.
 * @RequestParam: To take single QueryString or FormData field value.
 * 
 * Multi-action controllers.
 * 
 * http://localhost:8082/prospects/list
 * http://localhost:8082/Loan_Management_System/prospectDetails
 * http://localhost:8082/Loan_Management_System/register
 * 
 */
@CrossOrigin(origins = "*", allowedHeaders = "*",methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
//@RequestMapping("/prospects")
public class ProspectController {
	@Autowired
	@Qualifier("service")
	private ServiceProspect serviceProspect;
	
	@Autowired
	@Qualifier("serviceNewLoanAppl")
	private ServiceNewLoanAppl serviceNewLoanAppl;
	
	@Autowired
	@Qualifier("serviceApproveLoan")
	private ServiceApproveLoan serviceApproveLoan;
	
	@GetMapping(value="/prospects/list",produces="application/json")
	public List<Prospect> getProspectList(){
		System.out.println("In the method.");
		List<Prospect> prospectList = new ArrayList<>();
		try {
			prospectList = serviceProspect.getProspectList();
		} catch (LmsException e) {
			e.printStackTrace();
		}
		return prospectList;
	}
	
	@GetMapping(value="/prospectDetails/{id}",produces="application/json")
	public Prospect getProspectDetails(@PathVariable(value="id") String prospectId){
		Prospect prospect = null;
		try {
			prospect = serviceProspect.getProspectDetails(Long.valueOf(prospectId));
		} catch (LmsException e) {
			e.printStackTrace();
		}
		return prospect;
	}
	
	@GetMapping(value="/prospects/status",produces="application/json")
	public List<Prospect> getProspectsByStatus(@RequestBody String status){
		List<Prospect> prospectList = null;
		try {
			prospectList = serviceProspect.getProspectsByStatus(status);
		} catch (LmsException e) {
			e.printStackTrace();
		}
		return prospectList;
	}
	
	@PutMapping(value="/updateProspect",consumes="application/json")
	public Long updateProspectDetails(@RequestBody Prospect prospect) throws LmsException{
		return serviceProspect.updateProspect(prospect);
	}
	
	@PostMapping(value="/loan/register",consumes="application/json")
	public Long submitLoanApplicationForm(@RequestBody Map<String, Map<String,Object>> json) throws LmsException, ParseException{
		System.out.println(json);
		Map<String,Object> prospectJson = json.get("newprospect");
		Map<String,Object> propertyJson = json.get("newproperty");
		
		Property property = new Property();
		
		property.setApartmentNo(propertyJson.get("apartmentNo").toString());
		property.setApartmentName(propertyJson.get("apartmentName").toString());
		property.setStreetName(propertyJson.get("streetName").toString());
		property.setLocality(propertyJson.get("locality").toString());
		property.setLandmark(propertyJson.get("landmark").toString());
		property.setCity(propertyJson.get("city").toString());
		property.setState(propertyJson.get("state").toString());
		property.setCountry(propertyJson.get("country").toString());
		property.setZipCode(propertyJson.get("zipCode").toString());
		property.setPurchasedPrice(Double.valueOf(propertyJson.get("purchasedPrice").toString()));
		
		Prospect prospect = new Prospect();

		prospect.setFirstName(prospectJson.get("firstName").toString());
		prospect.setLastName(prospectJson.get("lastName").toString());
		prospect.setAddress(prospectJson.get("address").toString());
		prospect.setLoanType(prospectJson.get("loanType").toString());
		prospect.setIncome(Double.valueOf(prospectJson.get("income").toString()));
		prospect.setRequiredLoanAmt(Double.valueOf(prospectJson.get("requiredLoanAmt").toString()));
		prospect.setPanNumber(prospectJson.get("panNumber").toString());
		prospect.setAadharNumber(prospectJson.get("aadharNumber").toString());
		prospect.setContactNumber(prospectJson.get("contactNumber").toString());
		prospect.setEmail(prospectJson.get("email").toString());
		prospect.setEnquiryDate(new Date());
		prospect.setDateOfBirth(new SimpleDateFormat("yyyy-MM-dd").parse(prospectJson.get("dateOfBirth").toString()));
		prospect.setCity(prospectJson.get("city").toString());
		prospect.setApplicationStatus(prospectJson.get("applicationStatus").toString());
		
		return serviceNewLoanAppl.registerNewHomeLoanAppl(prospect,property);
	}
	
	@PostMapping(value="/loan/approve",consumes="application/json")
	public String approveLoanApplication(@RequestBody Prospect prospect) throws LmsException{
		return serviceApproveLoan.approveProspectLoan(prospect);
	}
}