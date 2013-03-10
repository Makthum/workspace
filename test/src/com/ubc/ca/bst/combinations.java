package com.ubc.ca.bst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class combinations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stubBufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		combinations per= new combinations();
		try {
			per.combine(reader.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		void combine( String input)
		{
		  int inputLength = input.length();
		  boolean[ ] used = new boolean[ inputLength ];
		  StringBuffer outputString = new StringBuffer();
		  char[ ] in = input.toCharArray( );
		  
		  combine ( in, outputString, used, inputLength, 0 );
		  System.out.println(outputString);

		}

		  void combine( char[ ] in, StringBuffer outputString, 
		                    boolean[ ] used, int inputlength, int level)
		  {
			//  System.out.println(outputString + "         "+ used[0] + ","+used[1]+","+used[2]);
		     if( level == inputlength) {
		     System.out.println ( outputString.toString()); 
		     return;
		     }

		    for( int i = 0; i < inputlength; ++i )
		    {       
	       //    System.out.println("Iteration value "+i);
		       if( used[i] ) continue;

		       outputString.append( in[i] );      
		     //  System.out.println("Output String before permutation - before recursion          " +outputString);
		       used[i] = true;       
		       if(i==0)
		       {combine( in,   outputString, used, inputlength, level + 1 );       
		       used[i] = false;       
		    //   System.out.println(used[0] + ","+used[1]+","+used[2]);
		         outputString.setLength(   outputString.length() - 1 );
		       }
			  //     System.out.println("Output String before permutation - after recursion           "+outputString);

		    }
		 }

	

}
