package com.project.api.service;

import java.util.List;

import com.project.api.model.RegistrationModel;



public interface RegistrationService {

	List<RegistrationModel> get();

	//for returning single employee
	RegistrationModel get(int userid);
	
	// we can save the employee
	void save(RegistrationModel registrationmodel);
	
	//we can delete the specific employee
//	void delete(int id);
}
