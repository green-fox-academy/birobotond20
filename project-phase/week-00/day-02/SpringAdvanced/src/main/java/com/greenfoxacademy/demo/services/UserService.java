package com.greenfoxacademy.demo.services;

import com.greenfoxacademy.demo.models.User;
import com.greenfoxacademy.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;
    public String saveMessage;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveNewUser(User newUser){
        this.saveMessage = "";
        if (newUser == null){
            this.saveMessage = "No User object received";
            return;
        } else if (!newUser.getUserName().isEmpty() && !newUser.getPassword().isEmpty()){
            this.saveMessage = "No usern";
        }
        this.userRepository.save(newUser);
    }
}
