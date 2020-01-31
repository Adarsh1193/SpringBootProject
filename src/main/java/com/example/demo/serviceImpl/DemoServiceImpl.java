package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.BookingRoom;
import com.example.demo.Entity.BookingService;
import com.example.demo.Entity.Category;
import com.example.demo.Entity.Employees;
import com.example.demo.Entity.Guests;
import com.example.demo.Entity.Rooms;
import com.example.demo.Entity.Services;
import com.example.demo.Entity.Tracking;
import com.example.demo.Repository.BookingRoomRepository;
import com.example.demo.Repository.BookingServiceRepository;
import com.example.demo.Repository.CategoryRepository;
import com.example.demo.Repository.EmployeesRepository;
import com.example.demo.Repository.GuestsRepository;
import com.example.demo.Repository.RoomsRepository;
import com.example.demo.Repository.ServicesRepository;
import com.example.demo.Repository.TrackingRepository;
import com.example.demo.dto.BookingRoomDto;
import com.example.demo.dto.BookingServiceDto;
import com.example.demo.dto.CategoryDto;
import com.example.demo.dto.EmployeesDto;
import com.example.demo.dto.GuestsDto;
import com.example.demo.dto.RoomsDto;
import com.example.demo.dto.ServiceDto;
import com.example.demo.dto.TrackingDto;
import com.example.demo.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService{
	public Object getData(Object obj) {
		return obj;
	}
	
	@Autowired
	BookingRoomRepository bookingRoom;
	
	@Autowired
	BookingServiceRepository bookingService;
	
	@Autowired
	CategoryRepository categorySave;
	
	@Autowired
	EmployeesRepository employee;
	
	@Autowired
	GuestsRepository gue;
	
	@Autowired
	RoomsRepository r;
	
	@Autowired
	ServicesRepository serv;
	
	@Autowired
	TrackingRepository trackings;

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

	@Override
	public String addNewBookService(BookingServiceDto bookservice) {
		BookingService bservice = new BookingService();
		bservice.setService_id(bookservice.getService_id());
		bservice.setReq_receiver_emp_id(bookservice.getReq_receiver_emp_id());
		bservice.setReq_delivery_emp_id(bookservice.getReq_delivery_emp_id());
		bservice.setRoom_booking_id(bookservice.getRoom_booking_id());
		bservice.setBooking_time(bookservice.getBooking_time());
		bookingService.save(bservice);
		return "success";
	}

	@Override
	public String addNewCategory(CategoryDto category) {
		Category cat = new Category();
		cat.setCategory_id(category.getCategory_id());
		cat.setBed(category.getBed());
		cat.setRooms(category.getRooms());
		cat.setBathroom(category.isBathroom());
		categorySave.save(cat);
		return "success";
	}

	@Override
	public String addNewEmployees(EmployeesDto employees) {
		Employees emp = new Employees();
		emp.setEmployee_id(employees.getEmployee_id());
		emp.setName(employees.getName());
		emp.setAddress(employees.getAddress());
		emp.setRole(employees.getRole());
		emp.setPhone(employees.getPhone());
		emp.setAge(employees.getAge());
		emp.setEmp_dob(employees.getEmp_dob());
		emp.setRate(employees.getRate());
		emp.setProof(employees.getProof());
		emp.setJoin_date(employees.getJoin_date());
		emp.setDate_of_exiting(employees.getDate_of_exiting());
		emp.setEnable(employees.isEnable());
		employee.save(emp);
		return "success";
	}

	@Override
	public String addNewGuests(GuestsDto guests) {
		Guests guest = new Guests();
		guest.setGuest_id(guest.getGuest_id());
		guest.setGuest_name(guest.getGuest_name());
		guest.setGuest_address(guest.getGuest_address());
		guest.setGuest_phone(guest.getGuest_phone());
		guest.setTotal_amount(guest.getTotal_amount());
		guest.setNumber_of_guests(guest.getNumber_of_guests());
		guest.setProof(guest.getProof());
		guest.setEnable(guest.isEnable());
		gue.save(guest);
		return "success";
	}

	@Override
	public String addNewRooms(RoomsDto rooms) {
		Rooms room = new Rooms();
		room.setRoom_id(room.getRoom_id());
		room.setRoom_number(room.getRoom_number());
		room.setCategory_id(room.getCategory_id());
		room.setEnable(room.isEnable());
		r.save(room);
		return "success";
	}

	@Override
	public String addNewService(ServiceDto services) {
		Services service = new Services();
		service.setService_id(service.getService_id());
		service.setService_type(service.getService_type());
		service.setPrice(service.getPrice());
		serv.save(service);
		return "success";
	}

	@Override
	public String addNewTracking(TrackingDto tracking) {
		Tracking track = new Tracking();
		track.setTracking_id(track.getTracking_id());
		track.setEmployee_id(track.getEmployee_id());
		track.setSign_in(track.getSign_in());
		track.setSign_out(track.getSign_out());
		trackings.save(track);
		return "success";
	}
}
