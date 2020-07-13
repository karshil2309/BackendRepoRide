package com.project.api.repository;

import java.util.List;

import com.project.api.model.DriverLoginModel;

public interface DriverLoginDao {

	public List<DriverLoginModel> get();
	
	DriverLoginModel get(Integer driverid);

	void save(DriverLoginModel driverloginmodel);
	
	void delete(Integer driverid);
}

