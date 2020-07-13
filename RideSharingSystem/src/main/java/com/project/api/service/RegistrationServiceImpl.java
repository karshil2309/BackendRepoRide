package com.project.api.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.api.model.RegistrationModel;
import com.project.api.repository.RegistrationDao;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private RegistrationDao registrationdao;
	
	@Transactional
	@Override
	public List<RegistrationModel> get() {
		// TODO Auto-generated method stub
		return registrationdao.get();
	}

	@Transactional
	@Override
	public RegistrationModel get(int userid) {
		
		return registrationdao.get(userid);
	}

	@Transactional
	@Override
	public void save(RegistrationModel registrationmodel) {
		// TODO Auto-generated method stub
		 registrationdao.save(registrationmodel);
		
	}

	
}
