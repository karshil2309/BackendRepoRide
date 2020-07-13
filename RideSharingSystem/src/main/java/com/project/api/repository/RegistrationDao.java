package com.project.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.api.model.RegistrationModel;



public interface RegistrationDao{

	// for returning list of employee
	
		List<RegistrationModel> get();

		//for returning single employee
		RegistrationModel get(int userid);
		
		// we can save the employee
		void save(RegistrationModel registrationmodel);
		
		//we can delete the specific employee
//		void delete(int id);
//		
		
}
