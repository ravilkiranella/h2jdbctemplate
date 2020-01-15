package com.example.h2demo.model;

public class User {

	private int id;
	private String username;
	public User(int id, String username, String designation) {
		super();
		this.id = id;
		this.username = username;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", designation=" + designation + "]";
	}
	public int getId() {
		return id;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	private String designation;
	
}
