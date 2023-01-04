package com.jdbcoperation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class RetriveStatement {
	  static Scanner scan = new Scanner(System.in);
	  
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int score=0;
		//Load the driver
		Class.forName("com.mysql.jdbc.Driver");
		//Establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project", "root", "Priyanka@11");
		//int questionNum=generateRandomQuestion();
		PreparedStatement ps = con.prepareStatement("select * from questions");
		//PreparedStatement ps1 = con.prepareStatement("select * from answer");
		ResultSet rs = ps.executeQuery();
		//ResultSet rs1 = ps1.executeQuery();
		while(rs.next()) {
		System.out.println("Question no :"+rs.getInt(1));
			System.out.println("Question : "+rs.getString(2));
			System.out.println("Option 1 : "+rs.getString(3));
			System.out.println("Option 2 : "+rs.getString(4));
			System.out.println("Option 3 : "+rs.getString(5));
			System.out.println("Option 4 : "+rs.getString(6));
			System.out.println("Enter answer");
			int userAnswer = scan.nextInt()	;
			if(userAnswer==rs.getInt(7)) {
			System.out.println("Correct answer");
			System.out.println(".......................................................................................");
			score++;
			}
			else {
				System.out.println("Incorrect answer,correct answer is :"+rs.getInt(7));
		}
		// con.close();
	   // ps.close();
       // rs.close();
	   }
		System.out.println("Score of student is>>"+score);
			
		}
	 	
    }
	
	
	
