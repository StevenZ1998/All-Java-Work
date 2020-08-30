package com.skillstorm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class Example4 {
	
	public static void main(String[] args) {
		
		Example4 e4 = new Example4();
		List<Animal> animals = new LinkedList<>();
		animals.add(new Animal(1, "Dog", "Red"));
		animals.add(new Animal(2, "Cat", "White"));
		animals.add(new Animal(3, "Bear", "Brown"));
		
		e4.addAnimalToDB(animals);
		
	}
	
	public void addAnimalToDB(List<Animal> animals) {
		
		try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "root")) {
			
			PreparedStatement ps = conn.prepareStatement("INSERT INTO ANIMAL (name, color) values (?, ?)");
			for(Animal a : animals) {
				ps.setString(1, a.getName());
				ps.setString(2, a.getColor());
				ps.addBatch();
			}
			
			ps.executeBatch();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
