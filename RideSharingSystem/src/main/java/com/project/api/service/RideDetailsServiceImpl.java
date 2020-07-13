package com.project.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.api.model.RideDetailsModel;
import com.project.api.repository.RideDetailsDao;

@Service
public class RideDetailsServiceImpl implements RideDetailsService {

	@Autowired
	private RideDetailsDao ridedetailsdao;
	@Override
	public List<RideDetailsModel> get() {
		
		return ridedetailsdao.get();
	}

	@Override
	public void save(RideDetailsModel ridedetailsmodel) {
		// TODO Auto-generated method stub
		ridedetailsdao.save(ridedetailsmodel);
		
	}

	@Override
	public void delete(Integer rid) {
		// TODO Auto-generated 
		
		ridedetailsdao.delete(rid);
		
	}

	
}

//@Autowired
//private RideDetailsDao ridedetailsdao;
//
////Return list of states
//public List<RideDetailsModel> getRides(){
//	return ridedetailsdao.findAll();
//}
//
////SAve new state
//public void save(RideDetailsModel ridedetailsmodel) {
//	ridedetailsdao.save(ridedetailsmodel);
//}
//
////get by id
//public Optional<RideDetailsModel> findById(Integer rid) {
//	return ridedetailsdao.findById(rid);
//}
//
//public void delete(Integer rid) {
//	ridedetailsdao.deleteById(rid);
//}
