package com.example.demo.service;

import com.example.demo.dto.BookingRoomDto;
import com.example.demo.dto.BookingServiceDto;
import com.example.demo.dto.CategoryDto;
import com.example.demo.dto.EmployeesDto;
import com.example.demo.dto.GuestsDto;
import com.example.demo.dto.RoomsDto;
import com.example.demo.dto.ServiceDto;
import com.example.demo.dto.TrackingDto;

public interface DemoService {
	
	public Object getData(Object obj);

	public String addNewRoom(BookingRoomDto dto);

	public String addNewBookService(BookingServiceDto bookservice);

	public String addNewCategory(CategoryDto category);

	public String addNewEmployees(EmployeesDto employees);

	public String addNewGuests(GuestsDto guests);

	public String addNewRooms(RoomsDto rooms);

	public String addNewService(ServiceDto services);

	public String addNewTracking(TrackingDto tracking);

}
