package com.spring.service;

import com.spring.entities.User;
import com.spring.repo.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements UserServiceI{

  private UserRepository userRepository;

  public UserService(UserRepository userRepository){
      this.userRepository=userRepository;
  }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User login(User user) {
        Optional<User> dbUser = userRepository.findByEmail(user.getEmail());
        if (dbUser.isPresent()) {
            if (dbUser.get().getPassword().compareTo(user.getPassword()) == 0) {
                return dbUser.get();
            }
        }
        return null;
    }
}
