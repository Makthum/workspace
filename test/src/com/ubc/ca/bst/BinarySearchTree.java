package com.ubc.ca.bst;

public class BinarySearchTree {
	public Node root;
	public static class Node {
		 	Node left;
		 	Node right;
		 	int data;
		 	Node(int newData)
			{
			 left=null;
			 right=null;
			 data=newData;
			 
			}
		 	}
	public boolean lookup(int data)
	{
		return(lookup(root,data));
	}
	
	private boolean lookup(Node root,int data)
	{
		if(null==root)
			return(false);
		if(data==root.data)
			return true;
		else if (data< root.data)
			return( lookup(root.left,data));
		else
			return(lookup(root.right,data));
	}
	public Node insert(int data)
	{
		return (insert(root,data));
	}
	private Node insert(Node node, int data)
	{
		if(node==null)
		{
			node=new Node(data);
		}
		else if (data<=node.data)
		node.left=insert(node.left,data);
		else
			node.right=insert(node.right,data);
		return (node);
			
			
	}
	
	public int size()
	{
		return(size(root));
	}

	private int size(Node node)
	{
		if(node==null)
			return 0;
		else 
			return (size(node.left)+1+size(node.right));
					
	}
	public void printTree() { 
		 printTree(root); 
		 System.out.println(); 
		}
		private void printTree(Node node) { 
		 if (node == null) return;

		 // left, node itself, right 
		 printTree(node.left); 
		 System.out.print(node.data + "  "); 
		 printTree(node.right); 
		} 
		public void printPostorder() { 
			 printPostorder(root); 
			 System.out.println(); 
			}
			public void printPostorder(Node node) { 
			  if (node == null) return;

			  // first recur on both subtrees 
			  printPostorder(node.left); 
			  printPostorder(node.right);

			  // then deal with the node 
			 System.out.print(node.data + "  "); 
			} 
			 
}
