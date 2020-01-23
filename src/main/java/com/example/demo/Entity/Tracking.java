package com.example.demo.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tracking {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	
	private int tracking_id;
	private int employee_id;
	private Date sign_in;
	private Date sign_out;
	public int getTracking_id() {
		return tracking_id;
	}
	public void setTracking_id(int tracking_id) {
		this.tracking_id = tracking_id;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public Date getSign_in() {
		return sign_in;
	}
	public void setSign_in(Date sign_in) {
		this.sign_in = sign_in;
	}
	public Date getSign_out() {
		return sign_out;
	}
	public void setSign_out(Date sign_out) {
		this.sign_out = sign_out;
	}
	
	

}
