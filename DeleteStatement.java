package com.jdbcoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Load the drivers
		Class.forName("com.mysql.jdbc.Driver");
		//Create a connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","Priyanka@11");
		PreparedStatement ps = con.prepareStatement("delete from employee where userid=?");
		ps.setInt(1,1);
        int i = ps.executeUpdate();
        System.out.println("Record deleted "+i);
        con.close();
        con.close();
	}

}
