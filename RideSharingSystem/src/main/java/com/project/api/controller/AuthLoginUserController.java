/**
 * 					Author : Karshil Sheth	
 * 					Date   : 25 May, 2020
 * 					POC	   : Rider Login in Spring Boot 
 *
 * 					Features Left : 1) No Validation Support from Server Side
 * 									2) Only Email and Password are req fields for Logged in Support
 * 
 * 
 * 
 * */


package com.project.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.api.model.LoginUserModel;
import com.project.api.model.ResponseModel;
import com.project.api.service.AuthUserService;


@CrossOrigin
@RestController
@RequestMapping("/apiCall")
public class AuthLoginUserController{

	
		@Autowired
		private AuthUserService authservice;
		
		@GetMapping("/index")
		public String getVehicle() {
			return "redirect:/index";
		}
		
		@PostMapping("/login")
		public ResponseEntity<ResponseModel> login(@RequestBody LoginUserModel loginusermodel) {
			return authservice.login(loginusermodel);
		}
	

	

}
