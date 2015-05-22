package com.clinic.app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clinic.app.dao.IClinicDao;
import com.clinic.app.entity.UserCredential;

@Service
public class ClinicServiceImpl implements IClinicService {
	
	private static final Logger LOG = LoggerFactory.getLogger(ClinicServiceImpl.class);
	
	@Autowired
	IClinicDao clinicDao;

	@Transactional
	public String authenticateUser(UserCredential user) {
		try {
			UserCredential userCredential = clinicDao.getUserCredentialByUsername(user.getUsername());
		} 
		catch (Exception e){
			
		}
		
		return null;
	}

}
