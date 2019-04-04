package com.greenfoxacademy.demo.dtos;

public class UserDTO {

    private String userName;

    public UserDTO() {
    }

    public UserDTO(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
