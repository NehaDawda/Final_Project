package com.jp.lms.source.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
 * http://localhost:8082/prospects/list
 * http://localhost:8082/Loan_Management_System/prospectDetails
 * http://localhost:8082/Loan_Management_System/register
 * 
 */
//@CrossOrigin(origins = "*", allowedHeaders = "*",methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
@RequestMapping("/prospects")
public class ProspectController {
	/*@Autowired
	@Qualifier("service")
	private ServiceProspect serviceProspect;*/
	
	
	//@RequestMapping(value = "",method = RequestMethod.GET,produces="application/json")
	@GetMapping(value="/list",produces="application/json")
	public List<Prospect> getProspectList(){
		System.out.println("In the method.");
		List<Prospect> prospectList = null;
		/*try {
			prospectList = serviceProspect.getProspectList();
			System.out.println("getAllPropects controller  ...."+prospectList);
			
		} catch (LmsException e) {
			e.printStackTrace();
		}*/
		return prospectList;
	}
	
	/*@RequestMapping(value="/prospectDetails",method = RequestMethod.GET,produces="application/json")
	public Prospect getProspectDetails(@RequestBody String prospectId){
		Prospect prospect = null;
		try {
			prospect = serviceProspect.getProspectDetails(prospectId);
		} catch (LmsException e) {
			e.printStackTrace();
		}
		return prospect;
	}
	
	@RequestMapping(value="/updateprospectDetails",method = RequestMethod.GET,headers="Accept=application/json")
	public String updateProspectDetails(@RequestBody Prospect prospect) throws LmsException{
		return serviceProspect.updateProspect(prospect);
	}
	
	@RequestMapping(value="/updateprospectDetails",method = RequestMethod.GET,headers="Accept=application/json")
	public String removeProspectDetails(@RequestBody String prospectId) throws LmsException{
		return serviceProspect.removeProspect(prospectId);
	}
	
	@RequestMapping(value="/register",method = RequestMethod.POST,consumes="application/json")
	public String submitRegistrationForm(@RequestBody Prospect prospect ) throws LmsException{
		//Prospect prospect = new Prospect();
    	return serviceProspect.registerProspect(prospect);
	}*/
}
