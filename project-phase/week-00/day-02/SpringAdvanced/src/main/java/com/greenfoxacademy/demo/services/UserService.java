package com.greenfoxacademy.demo.services;

import com.greenfoxacademy.demo.models.User;
import com.greenfoxacademy.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String saveMessage;
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveNewUser(User newUser) {
        this.saveMessage = "";
        if (userDataNotPresent(newUser.getUserName())) {
            this.saveMessage = "No username entered";
        } else if (userDataNotPresent(newUser.getPassword())) {
            this.saveMessage = "No password entered";
        } else if (isInDatabase(newUser.getUserName())) {
            this.saveMessage = "This username is already taken";
        } else {
            this.userRepository.save(newUser);
            this.saveMessage = "Saved new user";
        }
    }

    private boolean userDataNotPresent(String userData) {
        return userData == null || userData.isEmpty();
    }

    private boolean isInDatabase(String userName) {
        return this.userRepository.findByUserName(userName) != null;
    }
}
