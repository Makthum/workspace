package com.ubc.ca.bst;

import java.util.Random;

import com.ubc.ca.bst.BinarySearchTree.Node;

public class tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tester test= new tester();
		Random random= new Random();
		for(int i=0;i<52;i++)
		{
			System.out.println(random.nextInt(52-i));
		}
		//launch();

	}
	public static void launch()
	{
		System.out.println("Inside launcher");
		BinarySearchTree bst = new BinarySearchTree();
		bst.root=new Node(2);
	
		bst.insert(10);
		bst.insert(11);
		bst.insert(7);
		bst.insert(1);
		bst.insert(3);
		System.out.println(bst.size());
		bst.printPostorder();
		bst.printTree();
		
		
	}

}
