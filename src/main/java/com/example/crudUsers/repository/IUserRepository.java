package com.example.crudUsers.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.crudUsers.model.User;

public interface IUserRepository extends MongoRepository<User, String>{

    List<User> findByUsername(String username);

}
