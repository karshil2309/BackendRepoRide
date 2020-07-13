/**
 * 					Author : Karshil Sheth	
 * 					Date   : 12 May, 2020
 * 					POC	   : Admin Login Rest Api in Spring Boot 
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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.api.model.AdminLoginModel;
import com.project.api.model.ResponseModel;
import com.project.api.service.AdminLoginService;


@CrossOrigin
@RestController
@RequestMapping("/adminapiCall")
public class AdminLoginController {


		
			@Autowired
			private AdminLoginService adminloginservice;
			//Service Called from AdminLogin Service class
			
			
			@PostMapping("/adminlogin") //Post mapping for requesting admin's email & pwd.
			public ResponseEntity<ResponseModel> login(@RequestBody AdminLoginModel adminloginmodel) {
				return adminloginservice.login(adminloginmodel);
			}

//			@GetMapping("/logout")
//			public String logout() {
//				return "login";
//			}	

}
