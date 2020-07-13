package com.project.api.repository;

import java.util.List;
import com.project.api.repository.RegistrationDao;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.api.model.RegistrationModel;

@Repository
public class RegistrationDaoImpl implements RegistrationDao {

		@Autowired
		 private EntityManager entityManager;
	
		 @Override
		public List<RegistrationModel> get() {
		
			Session currentSession = entityManager.unwrap(Session.class);
			Query<RegistrationModel> query = currentSession.createQuery("from RegistrationModel",RegistrationModel.class);
			List<RegistrationModel> list = query.getResultList();
			return list;
		}
	
		@Override
		public RegistrationModel get(int userid) {
			Session currentSession = entityManager.unwrap(Session.class);
			return currentSession.get(RegistrationModel.class, userid);
		}
	
		@Override
		public void save(RegistrationModel registrationmodel) {
			Session currentSession = entityManager.unwrap(Session.class);
			currentSession.saveOrUpdate(registrationmodel);
			
		}
	
	
}
