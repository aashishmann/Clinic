package com.clinic.app.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.clinic.app.entity.UserCredential;

public class ClinicDaoImpl implements IClinicDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public UserCredential getUserCredentialByUsername(String username) {
		return (UserCredential) sessionFactory.getCurrentSession().get(UserCredential.class, username);
	}

}
