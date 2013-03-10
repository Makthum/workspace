package com.ubc.ca.bst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibseq {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fibseq fibseq= new fibseq();
		BufferedReader red= new BufferedReader(new InputStreamReader(System.in));
		try {
			fibseq.printfib(red.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void printfib(String num)
	{
		int c=Integer.parseInt(num);
		if(c==1)
		{
			System.out.println("1");
		}
		else
		{
			for(int i=1;i<=c;i++)
			{
				System.out.println(fib(i));
			}
		}
	}
	private int fib(int i)
	{
		
		if(i==2)
			return 1;
		if(i==1)
			return 1;
			else
			{
				int c=fib(i-1)+fib(i-2);
			
			return (c );
			}
	}

}
