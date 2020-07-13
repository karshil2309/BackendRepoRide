package com.project.api.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.api.model.LoginUserModel;
import com.project.api.model.ResponseModel;
import com.project.api.repository.AuthUserDao;


@Service
public class AuthUserServiceImpl implements AuthUserService{

	@Autowired
	private AuthUserDao authuserdao;

	@Transactional
	@Override
	public ResponseEntity<ResponseModel> login(LoginUserModel loginusermodel) {
		LoginUserModel affectedUser = authuserdao.login(loginusermodel);
		ResponseModel res = new ResponseModel();
		if(affectedUser != null) {
			if(affectedUser.getPasswrd().equals(loginusermodel.getPasswrd())) {
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
