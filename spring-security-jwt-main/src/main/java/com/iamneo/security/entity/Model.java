	package com.iamneo.security.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Model{
	@Id
	private String ins_Id;
	private String name;
	private String Vehicle_Number;
	private String Email;
	private String Dob;
	private String Age;
	private long Mobile;
	private String policy_type;
	private String payment_type;
	private String renew_type;
	
	
	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Model(String name, String vehicle_Number, String email, String dob, String age, long mobile,
			String policy_type, String payment_type, String renew_type, String ins_Id) {
		super();
		this.name = name;
		Vehicle_Number = vehicle_Number;
		Email = email;
		Dob = dob;
		Age = age;
		Mobile = mobile;
		this.policy_type = policy_type;
		this.payment_type = payment_type;
		this.renew_type = renew_type;
		this.ins_Id=ins_Id;
	}

	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getVehicle_Number() {
		return Vehicle_Number;
	}
	
	public void setVehicle_Number(String vehicle_Number) {
		Vehicle_Number = vehicle_Number;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String email) {
		Email = email;
	}
	
	public String getDob() {
		return Dob;
	}
	
	public void setDob(String dob) {
		Dob = dob;
	}
	
	public String getAge() {
		return Age;
	}
	
	public void setAge(String age) {
		Age = age;
	}
	
	public long getMobile() {
		return Mobile;
	}
	
	public void setMobile(long mobile) {
		Mobile = mobile;
	}
	
	public String getPolicy_type() {
		return policy_type;
	}
	
	public void setPolicy_type(String policy_type) {
		this.policy_type = policy_type;
	}
	
	public String getPayment_type() {
		return payment_type;
	}
	
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}
	
	public String getRenew_type() {
		return renew_type;
	}
	
	public void setRenew_type(String renew_type) {
		this.renew_type = renew_type;
	}
	
	public String getIns_Id() {
		return ins_Id;
	}
	public void setIns_Id(String ins_Id) {
		this.ins_Id=ins_Id;
	}

	
}