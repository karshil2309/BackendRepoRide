package com.project.api.service;

import java.util.List;

import com.project.api.model.RiderSubscriberModel;


public interface RiderSubscriberService {

	public List<RiderSubscriberModel> get();
	
	RiderSubscriberModel get(Integer subscribeid);
	
	void save(RiderSubscriberModel ridersubscribermodel);
	
	//we can delete the specific employee
	void delete(Integer subscribeid);
	
	
}
