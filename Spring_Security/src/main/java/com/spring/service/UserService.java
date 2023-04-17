package com.spring.service;

import com.spring.entities.User;
import com.spring.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserServiceI{
    @Autowired
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
        User dbUser = this.userRepository.findByEmail(user.getEmail());
        if (dbUser.getPassword().compareTo(user.getPassword()) == 0) {
            return dbUser;
        }

        return null;
    }

    @Override
    public User updateUser(String email, User user) {
      User user1=this.userRepository.findByEmail(email);
        user1.setEmail(user.getEmail());
        user1.setPassword(user.getPassword());
        this.userRepository.save(user1);
        return user1;
    }

    @Override
    public void deleteUser(String email) {
        User user1 = this.userRepository.findByEmail(email);
            this.userRepository.delete(user1);
    }

    @Override
    public List<User> getAllUsers() {
      List<User> list=this.userRepository.findAll();
        return list;
    }

//    @Override
//    public User getSingleUser(User user) {
//      User user
//        return null;
//    }


}
