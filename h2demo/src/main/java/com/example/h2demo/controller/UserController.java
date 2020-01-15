package com.example.h2demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.h2demo.model.User;
import com.example.h2demo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;

	@GetMapping("/getUserById/{id}")
	public User getUserById(@PathVariable Long id) {
		return userService.getUserById(id);
	}
	
}
