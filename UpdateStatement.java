package com.jdbcoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Load the driver
		Class.forName("com.mysql.jdbc.Driver");
		//Establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","Priyanka@11");
		//for single update value
		PreparedStatement ps =con.prepareStatement("update employee set username=? where userid= ? ");
		
		ps.setString(1, "abram");
		ps.setInt(2, 1);
		int i = ps.executeUpdate();
		System.out.println("Record updated " +i);
		con.close();
		ps.close();
		
	}

}
