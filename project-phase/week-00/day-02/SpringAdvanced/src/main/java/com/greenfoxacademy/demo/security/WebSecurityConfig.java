package com.greenfoxacademy.demo.security;

import com.greenfoxacademy.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
@EnableWebSecurity  // enables spring security on our application
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
//Inject all the classes that we need for the Jpa repositories
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {   // override some default spring security configurations and append our implementation to it

    @Autowired
    private UserDetailsService userDetailsService;  // Since this is an interface we need to implement it

    // We need to tell spring to load the data from the database:
    //      1. Connect to the database
    //      2. And load the data
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService()
    }
}
