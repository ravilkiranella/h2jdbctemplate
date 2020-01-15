package com.example.h2demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.h2demo.model.User;
import com.example.h2demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User getUserById(Long id) {
		return userRepository.findByUserId(id);
	}
}
