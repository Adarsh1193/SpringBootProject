package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.BookingRoom;
import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepository;
import com.example.demo.dto.BookingRoomDto;
import com.example.demo.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService{
	public Object getData(Object obj) {
		return obj;
	}
	
	@Autowired
	UserRepository userRepository;

	@Override
	public String addNewRoom(BookingRoomDto dto) {
		BookingRoom n = new BookingRoom();
		n.setGuest_id(guest_id);
		n.setCheck_out(check_out);
		n.setCheck_in_emp(check_in_emp);
		n.setNumber_of_guests(number_of_guests);
		userRepository.save(n);
		return "success";
		
	}
}
