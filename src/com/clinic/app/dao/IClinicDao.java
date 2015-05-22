package com.clinic.app.dao;

import com.clinic.app.entity.UserCredential;

public interface IClinicDao {
	
	public UserCredential getUserCredentialByUsername(String username);

}
