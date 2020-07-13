package com.project.api.service;

import org.springframework.http.ResponseEntity;

import com.project.api.model.AdminLoginModel;
import com.project.api.model.ResponseModel;


public interface AdminLoginService {
	ResponseEntity<ResponseModel> login(AdminLoginModel adminloginmodel);
}
