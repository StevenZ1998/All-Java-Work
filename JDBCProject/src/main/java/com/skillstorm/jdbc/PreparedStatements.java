package com.skillstorm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatements {
	
	public static void main(String[] args) {
		
		try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "root");
				PreparedStatement ps = conn.prepareStatement("SELECT * FROM country WHERE country = ? AND country_id = ?"))
		{
			ps.setString(1, "Brazil");
			ps.setInt(2, 15);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("Country"));
			}
		} catch (SQLException e ) { 
			e.printStackTrace();
			}
		
	}
	
}
