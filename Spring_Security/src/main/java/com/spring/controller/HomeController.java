package com.spring.controller;


import com.spring.entities.User;
import com.spring.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/user")
public class HomeController {



    private UserServiceI userService;

    public HomeController(UserServiceI userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User user){
    User user1=userService.login(user);

   return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }





}
