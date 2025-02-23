package com.sj.motors.model.service;

import com.sj.motors.repository.model.UserData;

public interface SjMotorService {
	
	public UserData getUserByEmail(String email);

}
