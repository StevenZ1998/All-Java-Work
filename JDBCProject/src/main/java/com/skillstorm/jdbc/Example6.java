package com.skillstorm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Example6 {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root" ,"root");
			
			/* PreparedStatement ps = conn.prepareStatement("DELETE FROM actor WHERE first_name = ? AND last_name = ?");
			ps.setString(1, "ACTOR NAME");
			ps.setString(2, "ACTOR LAST");
			ps.executeUpdate(); */
			
			PreparedStatement ps2 = conn.prepareStatement("INSERT INTO staff (first_name, last_name, address_id, email, store_id, username, password) VALUES (?, ?, ?, ?, ?, ?, ?)");
			ps2.setString(1, "Leonardo");
			ps2.setString(2, "Di Capci");
			ps2.setInt(3, 5);
			ps2.setString(4, "No Email");
			ps2.setInt(5, 2);
			ps2.setString(6, "LDiCapci");
			ps2.setString(7, "pass");
			ps2.executeUpdate();
			
			PreparedStatement ps3 = conn.prepareStatement("UPDATE staff SET email = ? WHERE first_name = ? AND last_name = ?");
			ps3.setString(1, "LDaCapci@SteveStore.com");
			ps3.setString(2, "Leonardo");
			ps3.setString(3, "Di Capci");
			ps3.executeUpdate();
			
			PreparedStatement ps4 = conn.prepareStatement("SELECT first_name, last_name, email FROM staff where first_name = ?");
			ps4.setString(1, "Leonardo");
			
			ResultSet rs = ps4.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("first_name") + " | " + rs.getString("Last_name") + " | " + rs.getString("Email"));
			}
			
		} 
		
		catch (SQLException e) {
			e.printStackTrace();
			/* try {
				conn.rollback();
			} catch (SQLException e1) { e1.printStackTrace(); } */
		} 
		
		finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} 
			catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
}
