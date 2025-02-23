package com.sj.motors.model;

public class User {
	
	private String name;
	
	private String mobileNumber;
	
	private String email;
	
	private CarModel model;
	
	private DealerShowRoom showroom;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public CarModel getModel() {
		return model;
	}
	public void setModel(CarModel model) {
		this.model = model;
	}
	public DealerShowRoom getShowroom() {
		return showroom;
	}
	public void setShowroom(DealerShowRoom showroom) {
		this.showroom = showroom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	


}
