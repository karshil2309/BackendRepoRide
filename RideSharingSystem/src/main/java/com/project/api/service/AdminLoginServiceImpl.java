package com.project.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.api.model.AdminLoginModel;
import com.project.api.model.ResponseModel;
import com.project.api.repository.AdminLoginDao;

@Service
public class AdminLoginServiceImpl implements AdminLoginService {

	@Autowired
	private AdminLoginDao adminlogindao;
	
	@Transactional
	@Override
	public ResponseEntity<ResponseModel> login(AdminLoginModel adminloginmodel) {
		AdminLoginModel adminloginaffected=adminlogindao.login(adminloginmodel);
		ResponseModel res = new ResponseModel();
		if(adminloginaffected != null) {
			if(adminloginaffected.getAdminpasswrd().equals(adminloginmodel.getAdminpasswrd())) {
				//success
				res.setMessage("Login Successfully ");
				return ResponseEntity.status(HttpStatus.OK).body(res);
			}
		}
		//wrong email or password
		res.setMessage("Wrong email or password !");
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body(res);
		
	}

	
}
