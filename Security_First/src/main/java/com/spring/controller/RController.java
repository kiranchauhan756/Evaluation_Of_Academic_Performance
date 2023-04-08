package com.spring.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
@PreAuthorize("hasRole('NORMAL')")
public class RController {
	
	@RequestMapping("/home")
	public String home() {
		return "this is home page";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "this is login page";
	}

}
