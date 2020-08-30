package com.skillstorm.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableExample {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		try {
			conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "root");
			CallableStatement cs = conn.prepareCall("{CALL GET_FILM_INFO(?)}");
			cs.setString(1, "ENDING CROWDS");
			ResultSet rs = cs.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " | " + rs.getString(4));
			}
			
			}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
