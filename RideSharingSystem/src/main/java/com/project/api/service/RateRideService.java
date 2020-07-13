package com.project.api.service;

import java.util.List;

import com.project.api.model.RateRideModel;

public interface RateRideService {

	List<RateRideModel> get();

	//for returning single employee
	RateRideModel get(Integer rateid);
	
	// we can save the employee
	void save(RateRideModel rateridemodel);
	
	//we can delete the specific employee
	void delete(Integer rateid);
}
