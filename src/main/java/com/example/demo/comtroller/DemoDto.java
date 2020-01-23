package com.example.demo.comtroller;

import java.util.List;

import javax.validation.Valid;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BookingRoomDto;
import com.example.demo.dto.BookingServiceDto;
import com.example.demo.dto.CategoryDto;
import com.example.demo.dto.EmployeesDto;

//import com.example.demo.service.DemoService;
@RestController
@EnableAutoConfiguration
@RequestMapping("/demourl")

//import com.example.demo.service.DemoService;
public class DemoDto {
//@Autowired
//DemoService demoService;
//  @GetMapping("/Drl")

	@PostMapping(path = "/categorydto", consumes = "application/json", produces = "application/json")
	public List<CategoryDto> category(@RequestBody List<CategoryDto> obj) {
		return obj;
	}

	@PostMapping(path = "/bookingroomdto", consumes = "application/json", produces = "application/json")
	@Validated
	public List<BookingRoomDto> bookingroom(@Valid @RequestBody List<BookingRoomDto> obj1) {
		System.out.println("Obj2 :: " + obj1);
		return obj1;
	}

	@PostMapping(path = "/bookingservicedto", consumes = "application/json", produces = "application/json")
	public List<BookingServiceDto> bookingservice(@RequestBody List<BookingServiceDto> obj2) {
		return obj2;
	}

	@PostMapping(path = "/employeesdto", consumes = "application/json", produces = "application/json")
	public List<EmployeesDto> employees(@RequestBody List<EmployeesDto> obj3) {
		return obj3;
	}

}
