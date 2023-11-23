package com.example.recipes.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.recipes.entity.Profile;


@Repository
public interface ProfileRepository extends MongoRepository<Profile, String>{

	public Profile findByEmail(String email);

}
