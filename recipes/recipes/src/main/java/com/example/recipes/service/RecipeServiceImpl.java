package com.example.recipes.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.recipes.entity.Ingredient;
import com.example.recipes.entity.Profile;
import com.example.recipes.entity.Recipe;
import com.example.recipes.exceptions.ImageNotFoundException;
import com.example.recipes.repository.ProfileRepository;
import com.example.recipes.repository.RecipeRepository;

@Service
public class RecipeServiceImpl {
	
	@Autowired
	private RecipeRepository recipeRepository;
	
	@Autowired
	private ProfileRepository profileRepository;

	public String saveData(Recipe recipe[]) {
		
		List<Ingredient> list = new ArrayList<Ingredient>();
		
		for(int i=0;i<recipe.length;i++) {
			
			Recipe recipe2 = new Recipe(recipe[i].getName(), recipe[i].getDescription(),
					recipe[i].getImagePath(), recipe[i].getIngredients());
			
			System.out.println(recipe2.getName());
			System.out.println(recipe2.getImagePath());
			System.out.println(recipe2.getDescription());
			
			for(Ingredient ingredient:recipe2.getIngredients())
			{
				Ingredient ingredient2 = new Ingredient(ingredient.getName(), ingredient.getAmount());
				list.add(ingredient2);
				System.out.println(ingredient2.getName());
				System.out.println(ingredient2.getAmount());
			}
			
			recipe2.setIngredients(list);
			
			recipeRepository.save(recipe2);
		}
		return "Added";
	}

	public List<Recipe> fetchData() {
		List<Recipe> list = recipeRepository.findAll();
		if(list.isEmpty()) {
			return null;
		}
		else {
			return list;
		}
		
	}

	public String addData(Recipe recipe) {
		recipeRepository.save(recipe);
		return "Added";
	}

	public String uploadPicture(String email, byte[] image) {
		Profile profile = new Profile(email, image);
		profileRepository.save(profile);
		return "uploaded";
	}

	public byte[] getPicture(String email)throws ImageNotFoundException {
		Profile profile= profileRepository.findByEmail(email);
		if(profile!=null) {
			return profile.getProfilePic();
		}
		throw new ImageNotFoundException("Image Not uploaded");
	}

	public String deleteData(int id) {
		List<Recipe> list = recipeRepository.findAll();
		if(list.size()>0) {
			System.out.println(list.get(id).getName());
			list.remove(id);
			recipeRepository.deleteAll();
			for(Recipe recipe:list) {
				recipeRepository.save(recipe);
			}
			return "deleted";
		}
		return null;
	}

}
