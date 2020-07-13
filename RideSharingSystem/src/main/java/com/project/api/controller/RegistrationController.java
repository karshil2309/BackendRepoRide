package com.project.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.api.service.RegistrationService;
import com.project.api.model.RegistrationModel;


@RestController
@RequestMapping("/RegisterApi")
public class RegistrationController {

	@Autowired
	private RegistrationService registrationservice;
	
	@GetMapping("/ProfileDetails")
	public List<RegistrationModel> get(){
		
		return registrationservice.get();
	}
	@PostMapping("/FillRegistrationForm")
	public RegistrationModel save(@RequestBody RegistrationModel registrationmodel) {
		registrationservice.save(registrationmodel);
		return registrationmodel;
	}
	
	@GetMapping("/registrationuser/{userid}")
	public RegistrationModel get(@PathVariable int userid) {
		RegistrationModel registrationmodel =   registrationservice.get(userid);
		if(registrationmodel == null) {
			throw new RuntimeException("Rider with id "+userid+" is not found !");
		}
		return registrationmodel;
	}
	
	
	@PutMapping("/updateriderinfo")
	public RegistrationModel update(@RequestBody RegistrationModel registrationmodel) {
		registrationservice.save(registrationmodel);
		return registrationmodel;
	}
}
