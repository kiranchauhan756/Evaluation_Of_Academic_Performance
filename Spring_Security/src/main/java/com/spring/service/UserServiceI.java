package com.spring.service;

import com.spring.entities.User;

import java.util.List;


public interface UserServiceI {
    User addUser(User user);
    User login(User user);

    User updateUser(String email, User user);

    void deleteUser(String email);

    List<User> getAllUsers();
}
