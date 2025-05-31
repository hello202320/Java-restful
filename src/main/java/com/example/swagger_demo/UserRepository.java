package com.example.swagger_demo.repository;

import com.example.swagger_demo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
   
}
