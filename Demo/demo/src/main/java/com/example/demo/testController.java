package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
	
	@Autowired
	private testService service;
	
	@PostMapping("/addDetails")
	public String addDetails(@RequestBody testTable table)
	{
		return service.addDetails(table);
	}
	
	@PutMapping("/updateDetails/{id}")
	public String updateDetails(@PathVariable("id") int id, @RequestBody testTable table)
	{
		return service.updateDetails(id, table);
	}
	
	@GetMapping("/fetchDetails/{id}")
	public testTable fetchDetails(@PathVariable("id") int id)
	{
		return service.fetchDetails(id);
	}
	
	@DeleteMapping("/deleteDetails/{id}")
	public String deleteDetails(@PathVariable("id") int id)
	{
		return service.deleteDetails(id);
	}

}
