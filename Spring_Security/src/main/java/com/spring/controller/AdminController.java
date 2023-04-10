package com.spring.controller;

import com.spring.entities.User;
import com.spring.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @Autowired
    private UserServiceI userService;

    @PostMapping("/addStudent")
    public ResponseEntity<User> addUser(@RequestBody User user){
        User user1=this.userService.addUser(user);

        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }
}
