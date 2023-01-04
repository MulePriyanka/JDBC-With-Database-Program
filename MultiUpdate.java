package com.jdbcoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MultiUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Load the drivers
	Class.forName("com.mysql.jdbc.Driver");
	//Establish connection
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "Priyanka@11");
	
     PreparedStatement ps = con.prepareStatement("update employee set username=?,password=? where userid =?");
     ps.setString(1,"Rani");
     ps.setString(2, "par");
     ps.setInt(3, 2);
     PreparedStatement ps1 = con.prepareStatement("update employee set username=?,password=?,username=?,password=? where userid =?");
     ps1.setString(1,"Rohini");
     ps1.setString(2, "pujari");
     ps1.setInt(5, 2);
    
     int i = ps1.executeUpdate();
     
     System.out.println("Record updated "+i);
     //ps.close();
     con.close();
     ps1.close();
	}

}
