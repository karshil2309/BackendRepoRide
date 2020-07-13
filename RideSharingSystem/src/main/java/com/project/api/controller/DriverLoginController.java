/**
 * 		
					@Author : Karshil Sheth	
 * 					Date   : 25 May, 2020
 * 					POC	   : Driver Login Rest Api in Spring Boot 
 *
 * 					Features Left : 1) No Validation Support from Server Side
 * 									2) Only Email and Password are req fields for Logged in Support
 * 
 * 
 * 
 * */
package com.project.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.api.model.DriverLoginModel;
import com.project.api.service.DriverLoginService;



@RestController
@RequestMapping("/driverapi")
public class DriverLoginController {

	@Autowired
	private DriverLoginService driverloginservice;
	
	@GetMapping("/driverdetails")
	public List<DriverLoginModel> get(){
		return driverloginservice.get();
	}
	@PostMapping("/filldriverdetails")
	public DriverLoginModel save(@RequestBody DriverLoginModel driverloginmodel) {
		driverloginservice.save(driverloginmodel);
		return driverloginmodel;
	}
	
	@GetMapping("/singledriver/{driverid}")
	public DriverLoginModel get(@PathVariable Integer driverid) {
		DriverLoginModel driverloginmodel =   driverloginservice.get(driverid);
		if(driverloginmodel == null) {
			throw new RuntimeException("Driver with id "+driverid+" is not found !");
		}
		return driverloginmodel;
	}
	
	@DeleteMapping("/driverdelete/{driverid}")
	public String delete(@PathVariable int driverid) {
		 driverloginservice.delete(driverid);
		 return "Driver Successfully deleted with id "+driverid;
	}
	
	@PutMapping("/driverupdate")
	public DriverLoginModel update(@RequestBody DriverLoginModel driverloginmodel) {
		driverloginservice.save(driverloginmodel);
		return driverloginmodel;
	}
}
