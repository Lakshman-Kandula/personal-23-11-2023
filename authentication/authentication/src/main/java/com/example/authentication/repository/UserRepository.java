package com.example.authentication.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.authentication.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
