package com.example.demo.dto;

import java.util.Date;

public class EmployeesDto {
	private String name;
	private String address;
	private String role;
	private String phone;
	private int age;
	private Date emp_dob;
	private float rate;
	private String proof;
	private Date join_date;
	private Date date_of_exiting;
	private boolean enable;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getEmp_dob() {
		return emp_dob;
	}
	public void setEmp_dob(Date emp_dob) {
		this.emp_dob = emp_dob;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public String getProof() {
		return proof;
	}
	public void setProof(String proof) {
		this.proof = proof;
	}
	public Date getJoin_date() {
		return join_date;
	}
	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}
	public Date getDate_of_exiting() {
		return date_of_exiting;
	}
	public void setDate_of_exiting(Date date_of_exiting) {
		this.date_of_exiting = date_of_exiting;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	public String toSTring() {
		return "EmployeesDto [naeme=" +name+ ", address=" +address+ ", role=" +role+
				", phone=" +phone+ ", age=" +age+ ", emp_dob=" +emp_dob+
				", rate=" +rate+ ", proof=" +proof+ ", join_date=" +join_date+
				", date_of_exiting=" +date_of_exiting+ ", enable=" +enable+"]"; 
	}

}
