package com.ubc.ca.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginService {

	public String authenticate(String userName, String password)
	{
		try {
			Connection con=ConnectionService.getConnection();
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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			return "failure";
	}
}
