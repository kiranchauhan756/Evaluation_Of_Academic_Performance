package com.spring.service;

import com.spring.entities.User;
import com.spring.repo.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceI{

  private UserRepository userRepository;

  public UserService(UserRepository userRepository){
      this.userRepository=userRepository;
  }
    @Override
    public User login(User user) {
        return userRepository.save(user);
    }
}
