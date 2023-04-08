package com.spring.service;

import com.spring.entities.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	private List<User> list = new ArrayList<>();
	
	//get all users
	public List getAllUsers() {
		return this.list;
	}
	
	//get single user
	public User getUser(String name) {
		return this.list.stream().filter((user)->user.getName().equals(name)).findAny().orElse(null);
	}
	
	//add new User
	public User addUser(User user) {
		this.list.add(user);
		return user;
	}
}
