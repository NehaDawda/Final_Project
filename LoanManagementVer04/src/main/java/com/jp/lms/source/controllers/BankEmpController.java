package com.jp.lms.source.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jp.lms.source.entities.BankEmployee;
import com.jp.lms.source.exceptions.LmsException;
import com.jp.lms.source.services.ServiceBankEmp;

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
public class BankEmpController {
	@Autowired
	@Qualifier("serviceEmp")
	private ServiceBankEmp serviceBankEmp;
	
	
	@GetMapping(value="/validate",produces="application/json")
	public BankEmployee validateUser(@RequestBody String empId, @RequestBody String password){
		BankEmployee emp = null;
		try {
			emp = serviceBankEmp.validateUser(empId, password);
		} catch (LmsException e) {
			e.printStackTrace();
		}
		return emp;
	}
}
