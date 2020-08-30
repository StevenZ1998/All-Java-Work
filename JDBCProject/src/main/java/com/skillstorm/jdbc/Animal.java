package com.skillstorm.jdbc;

public class Animal {
	
	private int animal_id;
	private String name;
	private String color;
	
	
	public Animal() {
		super();
	}
	
	public Animal(int animal_id, String name, String color) {
		super();
		this.animal_id = animal_id;
		this.name = name;
		this.color = color;
	}

	public int getAnimal_id() {
		return animal_id;
	}
	public void setAnimal_id(int animal_id) {
		this.animal_id = animal_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Animal [animal_id=" + animal_id + ", name=" + name + ", color=" + color + "]";
	}
	
}
