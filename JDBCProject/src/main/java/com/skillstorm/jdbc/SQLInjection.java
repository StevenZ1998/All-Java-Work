package com.skillstorm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLInjection {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "root");
		
		String input = "OP";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT actor_id, last_name FROM actor WHERE first_name like '%" + input + "%'");
		
		while(rs.next()) {
			
			System.out.println(rs.getInt(1) + " | " + rs.getString(2));
			
		}
		
	}

}
