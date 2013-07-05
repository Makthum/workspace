package com.ubc.ca.student;

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
	System.out.println("inside student class");
	StudentService service = new StudentService();
	String au=service.authenticate(this.userId,this.password);
	System.out.println(au);
	return au;
	
}
}
