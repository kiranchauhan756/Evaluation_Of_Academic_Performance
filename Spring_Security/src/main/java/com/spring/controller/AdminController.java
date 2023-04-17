package com.spring.controller;

import com.spring.entities.User;
import com.spring.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AdminController {
    @Autowired
    private UserServiceI userService;

    @PostMapping("/addStudent")
    public ResponseEntity<User> addUser(@RequestBody User user){
        User user1=this.userService.addUser(user);

        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }
    @PutMapping("/update/{email}")
    public ResponseEntity<User> updateUser(@PathVariable String email,@RequestBody User user){
        User user1=this.userService.updateUser(email,user);
        if(user1==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    @DeleteMapping("/delete/{email}")
    public void deleteUser(@PathVariable String email){
        this.userService.deleteUser(email);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<User>>getAll(){
        List<User> list=new ArrayList<>();
        list=this.userService.getAllUsers();
        if(list.isEmpty())return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.status(HttpStatus.CREATED).body(list);
    }

//    @GetMapping("/getUser/{email}")
//    public ResponseEntity<User> getSingleUSer(@PathVariable User user){
//
//        User user1=this.userService.getSingleUser(user);
//        if(user1==null)return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
//    }




}
