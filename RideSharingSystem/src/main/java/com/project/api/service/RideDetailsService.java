package com.project.api.service;

import java.util.List;

import com.project.api.model.RideDetailsModel;

public interface RideDetailsService {
	List<RideDetailsModel> get();

	//for returning single employee
//	RideDetailsModel get(Integer rid);
	
	// we can save the employee
	void save(RideDetailsModel ridedetailsmodel);
	void delete(Integer rid);
}
