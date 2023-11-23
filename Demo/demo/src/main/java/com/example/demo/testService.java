package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class testService {
	
	@Autowired
	private testInterface repoInterface;

	public String addDetails(testTable table) {
		// TODO Auto-generated method stub
		repoInterface.save(table);
		return "added";
	}

	public String updateDetails(int id, testTable table) {
		// TODO Auto-generated method stub
		testTable obj = repoInterface.findById(id);
		if(obj!=null)
		{
			repoInterface.delete(obj);
			repoInterface.save(table);
			return "updated";
		}
		return "not there";
		
	}

	public testTable fetchDetails(int id) {
		// TODO Auto-generated method stub
		testTable objTable = repoInterface.findById(id);
		if(objTable!=null)
		{
			return objTable;
		}
		return null;
	}

	public String deleteDetails(int id) {
		// TODO Auto-generated method stub
		testTable objTable = repoInterface.findById(id);
		if(objTable!=null)
		{
			repoInterface.delete(objTable);
			return "deleted";
		}
		return null;
	}

}
