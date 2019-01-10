package com.jp.lms.source.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jp.lms.source.entities.BankEmployee;
import com.jp.lms.source.exceptions.LmsException;
import com.jp.lms.source.services.ServiceBankEmp;


/*
 * @Controller: A kind of @Component to declare SpringMVC controllers.
 * @PostMapping: To map a controlling method to the URL.
 * @RequestParam: To take single QueryString or FormData field value.
 * 
 * Multi-action controllers.
 * 
 * http://localhost:8082/validate
 * 
 */
@CrossOrigin(origins = "*", allowedHeaders = "*",methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
public class BankEmpController {
	@Autowired
	@Qualifier("serviceEmp")
	private ServiceBankEmp serviceBankEmp;
	
	
	@PostMapping(value="/validate",produces="application/json")
	public BankEmployee validateUser(@RequestBody Map<String,String> json){
		String empId = json.get("empId");
		String pwd = json.get("pwd");
		BankEmployee emp = null;
		try {
			emp = serviceBankEmp.validateUser(empId, pwd);
		} catch (LmsException e) {
			e.printStackTrace();
		}
		return emp;
	}
}
