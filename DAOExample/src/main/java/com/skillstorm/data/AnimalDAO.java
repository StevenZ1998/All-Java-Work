package com.skillstorm.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.skillstorm.beans.Animal;

public class AnimalDAO implements AnimalDAOInterface {
	
	Connection conn = null;
	public Connection getConnection() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "root");
			return conn;
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	@Override
	public Animal saveAnimal(Animal animal) {
		
		getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("INSERT INTO animal (NAME, COLOR) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, animal.getName());
			ps.setString(2, animal.getColor());
			
			ps.executeUpdate();
			ResultSet keys = ps.getGeneratedKeys();
			
			while(keys.next()) {
				int a_id = keys.getInt(1);
				System.out.println("Generated Key: " + a_id);
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (conn != null) {
					conn.close();
				}
			}
			catch (SQLException e ) {
				e.printStackTrace();
			}
		}
		
		return animal;
	}
	
	@Override
	public Animal pullTable() {
		
		Animal animal = new Animal();
		getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM animal");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString(1) + " | " + rs.getString(2) + " | " + rs.getString(3));
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (conn != null) {
					conn.close();
				}
			}
			catch (SQLException e ) {
				e.printStackTrace();
			}
		}
		
		return animal;
		
	}
	
	@Override
	public List<Animal> pullAnimal(String name) {
		
		List<Animal> animalList = new ArrayList<>();
		getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT animal_id, name, color FROM animal WHERE name = ?");
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				animalList.add(new Animal(rs.getInt(1), rs.getString(2), rs.getString(3)));	
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (conn != null) {
					conn.close();
				}
			}
			catch (SQLException e ) {
				e.printStackTrace();
			}
		}
		
		return animalList;
		
	}
	
	public void deleteAnimal(int animalId) {
		
		getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("DELETE FROM animal WHERE animal_id = ?");
			ps.setInt(1, animalId);
			ps.executeUpdate();
			
			System.out.println("Animal deleted.");
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (conn != null) {
					conn.close();
				}
			}
			catch (SQLException e ) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void infoUpdateAnimal(Animal animal) {
		
		getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement("UPDATE animal SET name = ?, color = ? WHERE animal_id = ?");
			ps.setString(1, animal.getName());
			ps.setString(2, animal.getColor());
			ps.setInt(3, animal.getAnimal_id());
			ps.executeUpdate();
			
			System.out.println("Animal has been Updated.");
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (conn != null) {
					conn.close();
				}
			}
			catch (SQLException e ) {
				e.printStackTrace();
			}
		}
		
	}
	
}
