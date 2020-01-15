package com.example.h2demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.h2demo.model.User;

@Repository
public class UserRepository {

	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	public User findByUserId(Long id) {

		 String sql = "SELECT username, designation FROM user WHERE ID = ?";

	        return (User) jdbcTemplate.queryForObject(
				sql, 
				new Object[]{id}, 
				new BeanPropertyRowMapper(User.class));

	    }

}
