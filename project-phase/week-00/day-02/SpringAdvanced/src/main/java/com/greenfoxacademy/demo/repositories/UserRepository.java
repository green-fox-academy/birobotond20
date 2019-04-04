package com.greenfoxacademy.demo.repositories;

import com.greenfoxacademy.demo.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUserName(String userName);

    @Query("SELECT u.id, u.userName FROM User u")
    List<User> getAllUsersUserName();
}
