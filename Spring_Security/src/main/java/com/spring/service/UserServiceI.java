package com.spring.service;

import com.spring.entities.User;



public interface UserServiceI {
    User addUser(User user);
    User login(User user);
}
