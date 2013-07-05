package com.ubc.ca.service;

public class StudentService {

	public String authenticate(String UserName, String Password)
	{
		System.out.println("Inside service class");
		if(UserName.equalsIgnoreCase("Mohamed"))
			if((Password.equals("M@kthum2")))
					return "success";
			else
				return "failure";
			return "failure";
	}
}
