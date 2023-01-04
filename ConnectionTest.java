package com.connectionpool;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
	Connection con = null;
	
public Connection getConnectionDetails() {
	
		try {
			
			// Load the Driver Class
			Class.forName("com.mysql.jdbc.Driver");
			
			// Establish the connection
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Priyanka@11");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return con;
		
	}
}