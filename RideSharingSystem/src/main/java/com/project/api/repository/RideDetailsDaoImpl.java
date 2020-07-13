package com.project.api.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.project.api.model.RideDetailsModel;

@Repository
public class RideDetailsDaoImpl implements RideDetailsDao {

	@Autowired
	 private EntityManager entityManager;
	
	@Override
	public List<RideDetailsModel> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<RideDetailsModel> query = currentSession.createQuery("from RideDetailsModel",RideDetailsModel.class);
		List<RideDetailsModel> list = query.getResultList();
		return list;
	}

	@Override
	public void save(RideDetailsModel ridedetailsmodel) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(ridedetailsmodel);
		
	}

	@Override
	public void delete(Integer rid) {
		Session currentSession = entityManager.unwrap(Session.class);
		RideDetailsModel ridedetailsmodel = currentSession.get(RideDetailsModel.class, rid);
		
		currentSession.delete(ridedetailsmodel);

		
	}

}
