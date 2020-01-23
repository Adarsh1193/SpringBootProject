package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.BookingRoom;
import com.example.demo.Entity.User;
import com.example.demo.Repository.BookingRoomRepository;
import com.example.demo.Repository.UserRepository;
import com.example.demo.dto.BookingRoomDto;
import com.example.demo.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService{
	public Object getData(Object obj) {
		return obj;
	}
	
	@Autowired
	BookingRoomRepository bookingRoom;

	@Override
	public String addNewRoom(BookingRoomDto dto) {
		BookingRoom book = new BookingRoom();
		book.setGuest_id(dto.getGuest_id());
		book.setCheck_out(dto.getCheck_out());
		book.setCheck_in_emp(dto.getCheck_in_emp());
		book.setNumber_of_guests(dto.getNumber_of_guests());
		bookingRoom.save(book);
		return "success";
		
	}
}
