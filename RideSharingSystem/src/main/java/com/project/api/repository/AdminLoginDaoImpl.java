package com.project.api.repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.api.model.AdminLoginModel;


@Repository
public class AdminLoginDaoImpl implements AdminLoginDao{
	@Autowired
	private EntityManager entitymanager;
	@Override
	public AdminLoginModel login(AdminLoginModel adminloginmodel) {

			//create currentSession object
			Session currentSession = entitymanager.unwrap(Session.class);
			AdminLoginModel adminloginaffected;
			try {
				adminloginaffected = currentSession.createQuery("from AdminLoginModel where adminemail=:adminemail and adminpasswrd=:adminpasswrd",AdminLoginModel.class)
						.setParameter("adminemail", adminloginmodel.getAdminemail()).setParameter("adminpasswrd", adminloginmodel.getAdminpasswrd()).getSingleResult();
			}catch (NoResultException ex) {
				System.out.println("no result found");
				adminloginaffected = null;
			}
			return adminloginaffected;
	}
	
}

	

