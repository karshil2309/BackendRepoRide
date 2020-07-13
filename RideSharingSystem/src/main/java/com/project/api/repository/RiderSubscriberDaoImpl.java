package com.project.api.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.api.model.RiderSubscriberModel;



@Repository
public class RiderSubscriberDaoImpl implements RiderSubscriberDao{

	@Autowired
	private EntityManager entitymanager;
	@Override
	public List<RiderSubscriberModel> get() {
		Session currentSession = entitymanager.unwrap(Session.class);
		Query<RiderSubscriberModel> query = currentSession.createQuery("from RiderSubscriberModel",RiderSubscriberModel.class);
		List<RiderSubscriberModel> list = query.getResultList();
		return list;
	}

	@Override
	public void save(RiderSubscriberModel ridersubscribermodel) {
		// TODO Auto-generated method stub
		Session currentSession = entitymanager.unwrap(Session.class);
		currentSession.saveOrUpdate(ridersubscribermodel);
		
	}

	@Override
	public void delete(Integer subscribeid) {
		// TODO Auto-generated method stub
		Session currentSession = entitymanager.unwrap(Session.class);
		RiderSubscriberModel ridersubscribermodel = currentSession.get(RiderSubscriberModel.class, subscribeid);
		
		currentSession.delete(ridersubscribermodel);
	}

	@Override
	public RiderSubscriberModel get(Integer subscribeid) {
		// TODO Auto-generated method stub
		Session currentSession = entitymanager.unwrap(Session.class);
		return currentSession.get(RiderSubscriberModel.class, subscribeid);
		
	}

	


}
