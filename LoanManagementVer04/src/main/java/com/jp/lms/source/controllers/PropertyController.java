package com.jp.lms.source.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.jp.lms.source.entities.Property;
import com.jp.lms.source.exceptions.LmsException;
import com.jp.lms.source.services.ServiceProperty;

/*
 * @Controller: A kind of @Component to declare SpringMVC controllers.
 * @GetMapping: To map a controlling method to the URL.
 * @putMapping: To map a controlling method to the URL.
 * @RequestBody: To take single object.
 * @PathVariable: To take path variable.
 * 
 * Multi-action controllers.
 * 
 * http://localhost:8082/propertyDetails/{id}
 * http://localhost:8082//updateProperty
 * 
 */
@CrossOrigin(origins = "*", allowedHeaders = "*",methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
public class PropertyController {
	@Autowired
	@Qualifier("serviceProperty")
	private ServiceProperty serviceProperty;
	
	@GetMapping(value="/propertyDetails/{id}",produces="application/json")
	public Property getProspectDetails(@PathVariable(value="id") Long propertyId){
		Property property = null;
		try {
			property = serviceProperty.getPropertyDetails(propertyId);
		} catch (LmsException e) {
			e.printStackTrace();
		}
		return property;
	}
	
	@PutMapping(value="/updateProperty",consumes="application/json")
	public Long updateProspectDetails(@RequestBody Property property) throws LmsException{
		System.out.println(property);
		return serviceProperty.updateProperty(property);
	}
}
