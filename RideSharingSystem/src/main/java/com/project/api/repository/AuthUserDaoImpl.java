package com.project.api.repository;


import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.api.model.LoginUserModel;





@Repository
public class AuthUserDaoImpl implements AuthUserDao {
	@Autowired
	private EntityManager entityManager;
	
	public LoginUserModel login(LoginUserModel user) {
		//create currentSession object
		Session currentSession = entityManager.unwrap(Session.class);
		LoginUserModel affectedUser;
		try {
			affectedUser = currentSession.createQuery("from LoginUserModel where email=:email and passwrd=:passwrd",LoginUserModel.class).setParameter("email", user.getEmail()).setParameter("passwrd", user.getPasswrd()).getSingleResult();
		}catch (NoResultException ex) {
			System.out.println("no result found");
			affectedUser = null;
		}
		return affectedUser;
	}

	
}
