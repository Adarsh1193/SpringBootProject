package com.example.demo.dto;

public class GuestsDto {
	private int guest_id;
	private String guest_name;
	private String guest_address;
	private String guest_phone;
	private float total_amount;
	private int number_of_guests;
	private String proof;
	private boolean enable;
	
	public int getGuest_id() {
		return guest_id;
	}
	public void setGuest_id(int guest_id) {
		this.guest_id = guest_id;
	}
	public String getGuest_name() {
		return guest_name;
	}
	public void setGuest_name(String guest_name) {
		this.guest_name = guest_name;
	}
	public String getGuest_address() {
		return guest_address;
	}
	public void setGuest_address(String guest_address) {
		this.guest_address = guest_address;
	}
	public String getGuest_phone() {
		return guest_phone;
	}
	public void setGuest_phone(String guest_phone) {
		this.guest_phone = guest_phone;
	}
	public float getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(float total_amount) {
		this.total_amount = total_amount;
	}
	public int getNumber_of_guests() {
		return number_of_guests;
	}
	public void setNumber_of_guests(int number_of_guests) {
		this.number_of_guests = number_of_guests;
	}
	public String getProof() {
		return proof;
	}
	public void setProof(String proof) {
		this.proof = proof;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
}
