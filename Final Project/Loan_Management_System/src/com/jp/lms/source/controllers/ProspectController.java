package com.jp.lms.source.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
 * 
 * http://localhost:8080/Loan_Management_System/hr/register
 */
@RestController
public class ProspectController {
	@Autowired
	@Qualifier("service")
	private ServiceProspect prospectService;
	
	
	@RequestMapping(value = "/prospectList",method = RequestMethod.GET,headers="Accept=application/json")
	public List<Prospect> getEmpList(){
		List<Prospect> prospectList = null;
		try {
			prospectList = prospectService.getProspectList();
			
		} catch (LmsException e) {
			e.printStackTrace();
		}
		return prospectList;
	}
	
	@RequestMapping(value="/prospectDetails",method = RequestMethod.GET,headers="Accept=application/json")
	public Prospect getEmpDetails(@RequestParam("id") String prospectId){
		Prospect prospect = null;
		try {
			prospect = prospectService.getProspectDetails(prospectId);
		} catch (LmsException e) {
			e.printStackTrace();
		}
		return prospect;
	}
	
	
	@RequestMapping(value="/register",method = RequestMethod.POST,headers="Accept=application/json")
	public String submitRegistrationForm(@RequestBody Prospect prospect ) throws LmsException{
		//Prospect prospect = new Prospect();
    	return prospectService.registerProspect(prospect);
	}
}