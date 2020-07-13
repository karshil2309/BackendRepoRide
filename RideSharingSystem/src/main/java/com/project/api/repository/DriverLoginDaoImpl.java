package com.project.api.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.api.model.DriverLoginModel;


@Repository
public class DriverLoginDaoImpl implements DriverLoginDao{

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<DriverLoginModel> get() {
		// TODO Auto-generated method stub
	Session currentSession = entityManager.unwrap(Session.class);
	Query<DriverLoginModel> query = currentSession.createQuery("from DriverLoginModel",DriverLoginModel.class);
	List<DriverLoginModel> list = query.getResultList();
	return list;
		
	}

	@Override
	public void save(DriverLoginModel driverloginmodel) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(driverloginmodel);
	}

	@Override
	public void delete(Integer driverid) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		DriverLoginModel driverloginmodel = currentSession.get(DriverLoginModel.class, driverid);

		currentSession.delete(driverloginmodel);
		
	}

	@Override
	public DriverLoginModel get(Integer driverid) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.get(DriverLoginModel.class, driverid);
	}
	
	
}
