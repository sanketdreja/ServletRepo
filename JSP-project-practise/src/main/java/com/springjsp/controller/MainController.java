package com.springjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springjsp.Entity.User;

@Controller
public class MainController {

	@RequestMapping("/home")
	public String  home() {
		return "home";
	}
	
	
	@RequestMapping("/registrationform")
	public String registrationform() {
		return "registrationform";
	}
	@RequestMapping("userRegister")
	public String userRegister() {
		return "userRegister";
	}
	
	@PostMapping(value = "registrationform")
	public User postMethodName(@RequestBody User user) {
		
		return user;
	}

}
