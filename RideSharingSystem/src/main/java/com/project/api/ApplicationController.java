package com.project.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ApplicationController {
	
	@GetMapping("/index")
	public String goHome() {
		return "index";
	}
	
	@GetMapping("/logindriver")
	public String login() {
		return "driver/login";
	}
	 
	@GetMapping("/logout")
	public String logout() {
		return "";
	}	
	
	@GetMapping("/States")
	public String state() {
		return "State";	
	}
	

}
