package com.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertEmployee {

	public static void main(String[] args) {
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			//Establish connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","Priyanka@11");
			PreparedStatement pstmt = con.prepareStatement("insert into employee(username,password)values(?,?)");
			pstmt.setString(1, "admin");
			pstmt.setString(2,"guest");
			int i = pstmt.executeUpdate();
			System.out.println("Record is inserted");
			con.close();
			pstmt.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

