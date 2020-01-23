package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	
	private String bed;
	private int rooms;
	private boolean bathroom;
	public String getBed() {
		return bed;
	}
	public void setBed(String bed) {
		this.bed = bed;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	public boolean isBathroom() {
		return bathroom;
	}
	public void setBathroom(boolean bathroom) {
		this.bathroom = bathroom;
	}
	
	

}
