package com.project.api.repository;

import java.util.List;

import com.project.api.model.RiderSubscriberModel;

public interface RiderSubscriberDao {

//	for returning list of rides
	public List<RiderSubscriberModel> get();
	
	RiderSubscriberModel get(Integer subscribeid);
	
	void save(RiderSubscriberModel ridersubscribermodel);
	
	void delete(Integer subscribeid);
	
}
