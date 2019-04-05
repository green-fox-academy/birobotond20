package com.greenfoxacademy.demo.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    // Here we are going to authenticate and need to provide an object of type UserDetails
    // Also, since we need to return an object of UserDetails, we need to create a model of type
    // UserDetails. UserDetails is an interface and we need to implement that in the model
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
