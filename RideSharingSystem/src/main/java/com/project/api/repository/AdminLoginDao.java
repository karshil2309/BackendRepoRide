package com.project.api.repository;


import com.project.api.model.AdminLoginModel;
import com.project.api.model.LoginUserModel;

public interface AdminLoginDao {

	AdminLoginModel login(AdminLoginModel adminloginmodel);
	
}
