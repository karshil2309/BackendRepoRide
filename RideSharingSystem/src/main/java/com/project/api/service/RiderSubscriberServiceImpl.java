package com.project.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.api.model.RiderSubscriberModel;
import com.project.api.repository.RiderSubscriberDao;


@Service
public class RiderSubscriberServiceImpl implements RiderSubscriberService{

	@Autowired
	private RiderSubscriberDao ridersubscriberdao;

	@Transactional
	@Override
	public List<RiderSubscriberModel> get() {
		// TODO Auto-generated method stub
		return ridersubscriberdao.get();
	}

	@Transactional
	@Override
	public void save(RiderSubscriberModel ridersubscribermodel) {
		// TODO Auto-generated method stub
		ridersubscriberdao.save(ridersubscribermodel);
	}

	@Transactional
	@Override
	public void delete(Integer subscribeid) {
		// TODO Auto-generated method stub
		
		ridersubscriberdao.delete(subscribeid);
	}

	@Transactional
	@Override
	public RiderSubscriberModel get(Integer subscribeid) {
		
		return ridersubscriberdao.get(subscribeid);
	}

	
}
