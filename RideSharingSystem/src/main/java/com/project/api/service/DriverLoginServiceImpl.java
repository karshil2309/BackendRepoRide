package com.project.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.api.model.DriverLoginModel;
import com.project.api.repository.DriverLoginDao;

@Service
public class DriverLoginServiceImpl implements DriverLoginService{

	@Autowired
	private DriverLoginDao driverlogindao;
	
	@Transactional
	@Override
	public List<DriverLoginModel> get() {
		// TODO Auto-generated method stub
		return driverlogindao.get();
	}

	@Transactional
	@Override
	public DriverLoginModel get(Integer driverid) {
		// TODO Auto-generated method stub
		return driverlogindao.get(driverid);
	}

	@Transactional
	@Override
	
	public void save(DriverLoginModel driverloginmodel) {
		// TODO Auto-generated method stub
		driverlogindao.save(driverloginmodel);
		
	}

	@Transactional
	@Override
	public void delete(Integer driverid) {
		// TODO Auto-generated method stub
		driverlogindao.delete(driverid);
		
	}

}
