package com.example.recipes.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.recipes.entity.Recipe;

@Repository
public interface RecipeRepository extends MongoRepository<Recipe, String>{

}
