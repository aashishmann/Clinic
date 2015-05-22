package com.clinic.app.service;

import com.clinic.app.entity.UserCredential;

public interface IClinicService {
	
	public String authenticateUser(UserCredential user);

}
