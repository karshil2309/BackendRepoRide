package com.project.api.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.api.model.RateRideModel;
import com.project.api.repository.RateRideDao;

@Service
public class RateRideServiceImpl implements RateRideService {

	@Autowired
	private RateRideDao rateridedao;
	
	@Transactional
	@Override
	public List<RateRideModel> get() {
		// TODO Auto-generated method stub
		return rateridedao.get();
	}

	@Transactional
	@Override
	public RateRideModel get(Integer rateid) {
		// TODO Auto-generated method stub
		return rateridedao.get(rateid);
	}

	@Transactional
	@Override
	public void save(RateRideModel rateridemodel) {
		// TODO Auto-generated method stub
		rateridedao.save(rateridemodel);
	}

	@Transactional
	@Override
	public void delete(Integer rateid) {
		// TODO Auto-generated method stub
		rateridedao.delete(rateid);
	}
	
	
	
}
