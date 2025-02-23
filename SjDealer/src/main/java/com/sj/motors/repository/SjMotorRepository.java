package com.sj.motors.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sj.motors.repository.model.UserData;

@Repository
public interface  SjMotorRepository  extends JpaRepository<UserData, Long>{
	
	UserData findAllUserDataByEmail(String email);
	
	

}
