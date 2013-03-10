package com.ubc.ca.bst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.Iterator;

public class NonrepChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
      NonrepChar char1= new NonrepChar();
      BufferedReader read= new BufferedReader(new InputStreamReader(System.in));
      try {
    	  char1.findNonrep(read.readLine());
		//char1.find(read.readLine(),read.readLine());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	
	public void find(String temp,String let)
	{
		Hashtable l= new Hashtable<>();
		for(int i=0;i<temp.length();i++)
		{
			Character c=temp.charAt(i);
		Integer value=(Integer)	l.get(c);
		if(value==null)
			l.put(c, new Integer(1));
		else
			l.put(c, new Integer(value.intValue()+1));
		}
		Integer value=(Integer)l.get(new Character(let.charAt(0)));
		System.out.println(value.intValue());
	}
	
	public void findNonrep(String temp)
	{
		Hashtable l= new Hashtable<>();
		for(int i=0;i<temp.length();i++)
		{
			Character c=temp.charAt(i);
		Integer value=(Integer)	l.get(c);
		if(value==null)
			l.put(c, new Integer(1));
		else
			l.put(c, new Integer(value.intValue()+1));
		}
		for(int j = 0; j < temp.length(); j++)
		{
		  Character chr = new Character(temp.charAt(j));
		  if (((Integer) l.get(chr)).intValue( ) == 1)
		    System.out.println(chr.charValue());;
		}

	}
}
