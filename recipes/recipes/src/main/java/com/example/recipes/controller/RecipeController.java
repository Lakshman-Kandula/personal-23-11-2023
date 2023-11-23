package com.example.recipes.controller;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.recipes.dao.RecipeServiceDao;
import com.example.recipes.entity.Recipe;
import com.example.recipes.exceptions.ImageNotFoundException;
import com.example.recipes.service.RecipeServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RecipeController implements RecipeServiceDao{
	
	@Autowired
	private RecipeServiceImpl recipeServiceImpl;

	@PostMapping("/save")
	public String saveData(@RequestBody Recipe recipe[]) {
		return recipeServiceImpl.saveData(recipe);
	}
	
	@PostMapping("/add")
	public String addData(@RequestBody Recipe recipe) {
		return recipeServiceImpl.addData(recipe);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable("id") int id) {
		return recipeServiceImpl.deleteData(id);
	}
	
	@PostMapping("/upload/{email}")
	public String uploadPicture(@RequestParam("file") MultipartFile file, @PathVariable("email") String email) throws IOException {
		byte[] image = file.getBytes();
		return recipeServiceImpl.uploadPicture(email, image);
	}
	
	@GetMapping("/get/{email}")
	public byte[] getPicture(@PathVariable("email") String email) throws ImageNotFoundException {
		return recipeServiceImpl.getPicture(email);
	}

	@GetMapping("/fetch")
	public List<Recipe> fetchData() {
		return recipeServiceImpl.fetchData();
	}

}
