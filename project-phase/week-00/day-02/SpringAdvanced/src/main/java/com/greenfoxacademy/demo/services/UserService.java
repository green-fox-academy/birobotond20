package com.greenfoxacademy.demo.services;

import com.greenfoxacademy.demo.dtos.UserDTO;
import com.greenfoxacademy.demo.encryptions.PasswordEncrypter;
import com.greenfoxacademy.demo.models.User;
import com.greenfoxacademy.demo.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;

@Service
public class UserService {

    public String saveMessage;
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(User newUser) {
        this.saveMessage = "";
        if (userDataNotPresent(newUser.getUserName())) {
            this.saveMessage = "No username entered";
        } else if (userDataNotPresent(newUser.getPassword())) {
            this.saveMessage = "No password entered";
        } else if (isInDatabase(newUser.getUserName())) {
            this.saveMessage = "This username is already taken";
        } else {
            newUser.setPassword(PasswordEncrypter.encryptPassword(newUser.getPassword()));
            this.userRepository.save(newUser);
            this.saveMessage = "Saved new user";
        }
    }

    public List<UserDTO> getUserList() {
        List<User> userList = (List<User>) this.userRepository.findAll();
        if (!userList.isEmpty()) {
            return mapUserListToDtoList(userList);
        }
        return null;
    }

    private boolean userDataNotPresent(String userData) {
        return userData == null || userData.isEmpty();
    }

    private boolean isInDatabase(String userName) {
        return this.userRepository.findByUserName(userName) != null;
    }

    private List<UserDTO> mapUserListToDtoList(List<User> userList) {

        // Create anonymous subclass of TypeToken class, pass List<UserDTO> as type parameter
        // and get the captured type information that otherwise would be erased an runtime
        Type listType = new TypeToken<List<UserDTO>>() {
        }.getType();
        return new ModelMapper().map(userList, listType);
    }
}
