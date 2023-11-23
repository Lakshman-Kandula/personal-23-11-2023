package com.example.recipes.entity;

public class Ingredient {
	
	private String name;
	private int amount;
	private int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public Ingredient(String name, int amount) {
		super();
		this.name = name;
		this.amount = amount;
		this.id = id++;
	}
	
	public Ingredient() {

	}

}
