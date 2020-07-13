package com.project.api.repository;

import java.util.List;

import com.project.api.model.RateRideModel;

public interface RateRideDao {

	List<RateRideModel> get();

	
	RateRideModel get(Integer rateid );
	
	void save(RateRideModel rateridemodel);
	
	void delete(Integer rateid);
}
