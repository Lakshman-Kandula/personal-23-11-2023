package com.example.recipes.dao;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import com.example.recipes.entity.Recipe;

public interface RecipeServiceDao {
	
	public String saveData(@RequestBody Recipe recipe[]);
	public List<Recipe> fetchData();

}
