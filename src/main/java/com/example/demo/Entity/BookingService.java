package com.example.demo.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookingService {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	
	private int service_id;
	private int req_receiver_emp_id;
	private int req_delivery_emp_id;
	private int room_booking_id;
	private Date booking_time;
	public int getService_id() {
		return service_id;
	}
	public void setService_id(int service_id) {
		this.service_id = service_id;
	}
	public int getReq_receiver_emp_id() {
		return req_receiver_emp_id;
	}
	public void setReq_receiver_emp_id(int req_receiver_emp_id) {
		this.req_receiver_emp_id = req_receiver_emp_id;
	}
	public int getReq_delivery_emp_id() {
		return req_delivery_emp_id;
	}
	public void setReq_delivery_emp_id(int req_delivery_emp_id) {
		this.req_delivery_emp_id = req_delivery_emp_id;
	}
	public int getRoom_booking_id() {
		return room_booking_id;
	}
	public void setRoom_booking_id(int room_booking_id) {
		this.room_booking_id = room_booking_id;
	}
	public Date getBooking_time() {
		return booking_time;
	}
	public void setBooking_time(Date booking_time) {
		this.booking_time = booking_time;
	}
	
	

}
