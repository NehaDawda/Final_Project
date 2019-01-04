package com.jp.lms.source.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.jp.lms.source.entities.Prospect;
import com.jp.lms.source.exceptions.LmsException;
import com.jp.lms.source.services.ServiceProspect;



/*
 * @Controller: A kind of @Component to declare SpringMVC controllers.
 * @RequestMapping: To map a controlling method to the URL.
 * @RequestParam: To take single QueryString or FormData field value.
 * 
 * Multi-action controllers.
 * 
 * http://localhost:8080/Loan_Management_System/prospectList
 * http://localhost:8080/Loan_Management_System/prospectDetails
 * http://localhost:8080/Loan_Management_System/register
 * 
 */
@RestController
public class ProspectController {
	@Autowired
	@Qualifier("service")
	private ServiceProspect prospectService;
	
	@CrossOrigin(origins= "http://localhost:4200")
	@RequestMapping(value = "/prospectList",method = RequestMethod.GET,produces="application/json")
	public List<Prospect> getProspectList(){
		List<Prospect> prospectList = null;
		try {
			prospectList = prospectService.getProspectList();
			
		} catch (LmsException e) {
			e.printStackTrace();
		}
		return prospectList;
	}
	
	@CrossOrigin(origins= "http://localhost:4200")
	@RequestMapping(value="/prospectDetails",method = RequestMethod.GET,produces="application/json")
	public Prospect getProspectDetails(@RequestBody String prospectId){
		Prospect prospect = null;
		try {
			prospect = prospectService.getProspectDetails(prospectId);
		} catch (LmsException e) {
			e.printStackTrace();
		}
		return prospect;
	}
	
	@RequestMapping(value="/updateprospectDetails",method = RequestMethod.GET,headers="Accept=application/json")
	public String updateProspectDetails(@RequestBody Prospect prospect) throws LmsException{
		return prospectService.updateProspect(prospect);
	}
	
	@RequestMapping(value="/updateprospectDetails",method = RequestMethod.GET,headers="Accept=application/json")
	public String removeProspectDetails(@RequestBody String prospectId) throws LmsException{
		return prospectService.removeProspect(prospectId);
	}
	
	@CrossOrigin(origins= "http://localhost:4200")
	@RequestMapping(value="/register",method = RequestMethod.POST,consumes="application/json")
	public String submitRegistrationForm(@RequestBody Prospect prospect ) throws LmsException{
		//Prospect prospect = new Prospect();
    	return prospectService.registerProspect(prospect);
	}
}