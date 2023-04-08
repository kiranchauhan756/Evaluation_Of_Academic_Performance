package com.spring.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entities.User;
import com.spring.service.UserService;

@RestController
public class HomeController {
	
	@Autowired
	private UserService userService;
	

	
	@GetMapping("/user")
	public List<User>getAllUsers(){
		return this.userService.getAllUsers();
	}
	
	@GetMapping("/{name}")

	public User getUsername(@PathVariable String name) {
		return this.userService.getUser(name);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/add")
	public User addUser(@RequestBody User user) {
		return this.userService.addUser(user);
	}
}
