package com.ubc.ca.bst;

public class FindMissingNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        FindMissingNumbers fid= new FindMissingNumbers();
        fid.find();
	}

	public void find()
	{
		int c=0;
		int i[]={3,1,2,4,8,5,7,5,6};
		System.out.println(i.length);
		for(int j=1;j<=8;j++)
		{
			System.out.println(Integer.toBinaryString(j));
			System.out.println(Integer.toBinaryString(c));

			c=c ^ j;
			System.out.println(Integer.toBinaryString(c));

		}
		System.out.println("-----------------------------------------");
		for(int j=0;j<i.length;j++)
		{
			System.out.println("value of in array "+Integer.toBinaryString(i[j]));
			System.out.println("value of c"+Integer.toBinaryString(c));
			c=c ^ i[j];
			System.out.println(Integer.toBinaryString(c));

		}
		System.out.println(c);
	}
}
