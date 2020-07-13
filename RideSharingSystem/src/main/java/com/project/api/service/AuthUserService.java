package com.project.api.service;



import org.springframework.http.ResponseEntity;

import com.project.api.model.LoginUserModel;
import com.project.api.model.ResponseModel;




public interface AuthUserService {
	ResponseEntity<ResponseModel> login(LoginUserModel loginusermodel);

}
