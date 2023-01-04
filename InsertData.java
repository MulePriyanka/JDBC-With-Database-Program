package com.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) {
		try {
			String sql = "insert into user(userid,firstname,lastname,email) values (1,'Ram','Patil','ram@gmail.com')";
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			//Establish connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","Priyanka@11");
			//create a statement
			Statement stmt = con.createStatement();
			//submit SQL statement to database
			stmt.execute(sql);
			System.out.println("Insertion Successful");
			//close the connection
			con.close();
			stmt.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

