package com.project.api.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.api.model.RateRideModel;


@Repository
public class RateRideDaoImpl implements RateRideDao {
	
	@Autowired
	 private EntityManager entityManager;

	
	@Override
	public List<RateRideModel> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<RateRideModel> query = currentSession.createQuery("from RateRideModel",RateRideModel.class);
		List<RateRideModel> list = query.getResultList();
		return list;

		
	}

	@Override
	public RateRideModel get(Integer rateid) {
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.get(RateRideModel.class, rateid);

	}

	@Override
	public void save(RateRideModel rateridemodel) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(rateridemodel);

		
	}

	@Override
	public void delete(Integer rateid) {
		Session currentSession = entityManager.unwrap(Session.class);
		RateRideModel rateridemodel= currentSession.get(RateRideModel.class,rateid);
		
		currentSession.delete(rateridemodel);
	}

}
