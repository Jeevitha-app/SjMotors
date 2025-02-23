package com.sj.motors.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sj.motors.model.serviceImpl.SjMotorServiceImpl;
import com.sj.motors.repository.model.UserData;

@RestController
@RequestMapping("dealer")
public class SJController {
	
	@Autowired
	SjMotorServiceImpl sjMotorServiceImpl;
	
	@GetMapping("/healthCheck")
	public String healthCheck() {
		return "healthy";
	}
	
	@PostMapping("/getUser")
	public UserData getUser(@RequestParam String email) {
		return sjMotorServiceImpl.getUserByEmail(email);
	}
	
	
	@PostMapping("/addUser")
	public String addUser() {
		
		return "healthy";
		
	}
	
	@PostMapping("/contactUs")
	public String contactUs() {
		
		return "healthy";
		
	}
	
	@PostMapping("/bookTestDrive")
	public String bookTestDrive() {
		
		return "healthy";
		
	}
	
	@PostMapping("/bookService")
	public String bookService() {
		
		return "healthy";
		
	}
	
	@PostMapping("/addNewCar")
	public String addNewcar() {
		
		return "healthy";
		
	}


}
