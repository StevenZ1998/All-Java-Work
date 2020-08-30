package com.skillstorm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Transactions {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root" ,"root");
			
			conn.setAutoCommit(false);
			
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO actor (first_name, last_name) VALUES ('TRANSACTION NAME', 'TRANSACTION LAST NAME')");
			stmt.executeUpdate("INSERT INTO animal (name, color) VALUES ('TRANSACTION NAME', 'TRANSACTION COLOR)')");
			conn.commit();
			
			/* ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println();
			} */
			
		} 
		
		catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) { e1.printStackTrace(); }
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
