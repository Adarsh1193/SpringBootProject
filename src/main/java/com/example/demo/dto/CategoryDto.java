package com.example.demo.dto;

public class CategoryDto {
	
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
		@Override
		public String toString() {
		return "CategoryDto [bed=" + bed + ", rooms=" + rooms + ", bathroom=" + bathroom + "]";
		}
		
	

}
