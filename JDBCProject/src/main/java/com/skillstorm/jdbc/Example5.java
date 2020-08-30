package com.skillstorm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Example5 {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root" ,"root");
			PreparedStatement ps = conn.prepareStatement("INSERT INTO actor (first_name, last_name) VALUES (?, ?)");
			
			ps.setString(1, "ACTOR NAME");
			ps.setString(2, "ACTOR LAST");
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			/* try {
				conn.rollback();
			} catch (SQLException e1) { e1.printStackTrace(); } */
		} finally {
			try {
				if (conn != null) {
					conn.close();
					}
			} catch (SQLException e2) { e2.printStackTrace(); }
		}
		
	}
	
}
