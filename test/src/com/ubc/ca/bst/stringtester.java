package com.ubc.ca.bst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stringtester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
         stringtester test= new stringtester();
         
       //  reverseString(readData());
         checkpalindrome();
	}

	public static String reverseString(String temp)
	{
		
			
			StringBuffer reversedString= new StringBuffer();
			for(int i=temp.length()-1;i>=0;i--)
			{
			 reversedString=reversedString.append(temp.charAt(i));
						} 
			System.out.println(reversedString);
			return reversedString.toString();
		
			
		
	}
	
	public static void checkpalindrome()
	{
		BufferedReader dataIn = new BufferedReader( new InputStreamReader(System.in) );
		try {
			String temp = dataIn.readLine();
			String reverse=reverseString(temp);
			if(temp.equalsIgnoreCase(reverse))
				System.out.println("It is a palindrome");
			else
				System.out.println(" Not a palindrome");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String readData()
	{
		BufferedReader buff= new BufferedReader(new InputStreamReader(System.in));
        String temp=null;
		try {
			temp = buff.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
	
}
