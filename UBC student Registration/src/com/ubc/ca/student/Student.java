package com.ubc.ca.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ubc.ca.service.StudentService;

public class Student {
private String userId;
private String password;
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public String login()
{
	String au=null;
	
		
		System.out.println("inside student class");
		StudentService service = new StudentService();
		 au=service.authenticate(this.userId,this.password);
		System.out.println(au);
	
	
	return au;
	
}
}
