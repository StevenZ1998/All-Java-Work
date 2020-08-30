package com.skillstorm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloJdbc {
	
	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/sakila";
		String user = "root";
		String password = "root";
		
		Connection conn = DriverManager.getConnection(url, user, password);
		
		Statement stmt = conn.createStatement();
		String sql = "Select * FROM film";;
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getInt("film_id") + " | " + rs.getString("Title"));
		}
		
		/* Statement stmt2 = conn.createStatement();
		String  sql2 = "INSERT INTO Country(country) VALUES ('JDBCCOUNTRY')";
		int affected = stmt2.executeUpdate(sql2);
		System.out.println(affected); */
		
		Statement stmt3 = conn.createStatement();
		int affected2 = stmt3.executeUpdate("UPDATE country SET country = 'JDBCCOUNTRY UPDATED' where country_id = 101;");
		System.out.println(affected2);
		
	}
	
}
