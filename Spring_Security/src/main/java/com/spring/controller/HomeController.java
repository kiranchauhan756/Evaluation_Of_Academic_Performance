package com.spring.controller;


import com.spring.entities.User;
import com.spring.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class HomeController {
    @Autowired
    private UserServiceI userService;

    public HomeController(UserServiceI userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User user){
        User user1 = this.userService.login(user);
        if (user1 != null) {
            return ResponseEntity.ok().body(user1);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(user1);
        }
    }





}
