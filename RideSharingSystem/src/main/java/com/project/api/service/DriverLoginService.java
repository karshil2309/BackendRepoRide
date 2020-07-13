package com.project.api.service;

import java.util.List;

import com.project.api.model.DriverLoginModel;



public interface DriverLoginService {

	List<DriverLoginModel> get();

	
	DriverLoginModel get(Integer driverid);
	
	
	void save(DriverLoginModel driverloginmodel);
	
	
	void delete(Integer driverid);
}
