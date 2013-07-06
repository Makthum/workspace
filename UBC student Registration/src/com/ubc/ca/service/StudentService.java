package com.ubc.ca.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentService {

	public String authenticate(String UserName, String Password)
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ams","scott","temp");
			String query="select * from \"Login\" where \"userId\"=?";
			PreparedStatement preparestatement=con.prepareStatement(query);
			preparestatement.setString(1, UserName);
			ResultSet rs=preparestatement.executeQuery();
			rs.next();
			while(rs!=null)
			{
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				rs.next();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Inside service class");
		if(UserName.equalsIgnoreCase("Mohamed"))
			if((Password.equals("M@kthum2")))
					return "success";
			else
				return "failure";
			return "failure";
	}
}
