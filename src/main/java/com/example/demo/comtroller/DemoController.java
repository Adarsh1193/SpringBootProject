package com.example.demo.comtroller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepository;
import com.example.demo.dto.BookingRoomDto;
import com.example.demo.service.DemoService;

@RestController
@RequestMapping("/demo")
public class DemoController {

	@Autowired
	UserRepository userRepository;

	@Autowired
	DemoService demoservice;

	@GetMapping("/")
	public String helloworld() {
		return "Hello World 1";
	}

	@GetMapping("/hello")
	public String helloworld2() {
		return "Hello World 2";
	}

	@GetMapping("/hello/{name}")
	public String helloWorldWithPathVariable(@PathVariable("name") String name) {
		return "Hello World" + " " + name;
	}

	@GetMapping("/hello1")
	public String helloWorldWithrequestParam(@RequestParam("name1") String name1) {
		return "Hello World" + " " + name1;
	}

	@PostMapping(path = "/app")
	public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {
		User n = new User();
		n.setName(name);
		n.setEmail(email);
		userRepository.save(n);
		return "success";
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	@PostMapping(path = "/bookingroom")
	public @ResponseBody String addNewRoom(@RequestBody BookingRoomDto dto) {
		return demoservice.addNewRoom(dto);
	}
	
	@PostMapping(path = "/bookingservice")
	public @ResponseBody String addNewService() {
		return "success";
	}

}
