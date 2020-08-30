package com.skillstorm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCPractice {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/sakila";
		String user = "root";
		String password = "root";
		
		Connection conn = DriverManager.getConnection(url, user, password);
		
		/* Statement stmt1 = conn.createStatement();
		String  sql1 = "INSERT INTO ACTOR(FIRST_NAME, LAST_NAME) VALUES ('TOM', 'HARDY');";
		stmt1.executeUpdate(sql1);
		
		Statement stmt2 = conn.createStatement();
		String sql2 = "SELECT ACTOR.FIRST_NAME, ACTOR.LAST_NAME FROM ACTOR WHERE ACTOR.FIRST_NAME = 'TOM' AND ACTOR.LAST_NAME = 'HARDY';";
		ResultSet rs = stmt2.executeQuery(sql2); */
		
		/* Statement stmt3 = conn.createStatement();
		String sql3 = "Update actor set last_name = 'HARDY UPDATE' WHERE first_name = 'TOM' and last_name = 'HARDY';";
		stmt3.executeUpdate(sql3);
		
		String sql4 = "SELECT ACTOR.FIRST_NAME, ACTOR.LAST_NAME FROM ACTOR WHERE ACTOR.FIRST_NAME = 'TOM' AND ACTOR.LAST_NAME = 'HARDY UPDATE';";
		ResultSet rs = stmt3.executeQuery(sql4); */
		
		Statement stmt4 = conn.createStatement();
		/* String sql4 = "DELETE FROM actor WHERE first_name = 'TOM' and last_name = 'HARDY UPDATE';";
		stmt4.executeUpdate(sql4); */
		
		String sql5 = "SELECT * FROM ACTOR";
		ResultSet rs = stmt4.executeQuery(sql5);
		
		while(rs.next()) {
			System.out.println(rs.getString("First_name") + " " + rs.getString("Last_name"));
		}
		
	}

}
