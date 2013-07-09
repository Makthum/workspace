package com.ubc.ca.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentService {

	public String authenticate(String userName, String password)
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ams","scott","temp");
			String query="select * from \"Login\" where \"userId\"=?";
			PreparedStatement preparestatement=con.prepareStatement(query);
			preparestatement.setString(1, userName);
			ResultSet rs=preparestatement.executeQuery();
			if(null!=rs)
			{
				rs.next();
				if(rs.getString(2).equals(password))
				return "success";
				else 
					return "failure";
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			return "failure";
	}
}
