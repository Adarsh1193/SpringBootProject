package com.example.demo.dto;

public class CategoryDto {
	
		private int category_id;
		private String bed;
		private int rooms;
		private boolean bathroom;
		
		public int getCategory_id() {
			return category_id;
		}
		public void setCategory_id(int category_id) {
			this.category_id = category_id;
		}
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
