package com.sj.motors.model.serviceImpl;

import com.sj.motors.repository.SjMotorRepository;
import com.sj.motors.repository.model.UserData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sj.motors.model.service.SjMotorService;

@Service 
public class SjMotorServiceImpl implements SjMotorService {
	
	@Autowired
	SjMotorRepository sjMotorRepository;

	@Override
	public UserData getUserByEmail(String email) {
		
		return sjMotorRepository.findAllUserDataByEmail(email);
	}

}
