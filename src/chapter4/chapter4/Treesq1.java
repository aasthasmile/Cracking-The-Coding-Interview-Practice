package chapter4.chapter4;

public class Treesq1
{
	Node root;
	
	public boolean TreeisBalanced(Node node){
		int left_h;
		int right_h;
		
		if(node==null)
			return true;
		
		left_h=height(node.left);
		right_h=height(node.right);
		
		 if (Math.abs(left_h - right_h) <= 1
	                && TreeisBalanced(node.left)
	                && TreeisBalanced(node.right)) {
	            return true;
	        }
		 return false;
	}
	public int height(Node node){
		if(node==null)
			return 0;
	
	return 1+Math.max(height(node.left),height(node.right));
	}
	
	public static void main(String[] args)
	{
		Treesq1 q1=new Treesq1();
		q1.root=new Node(1);
		q1.root.left=new Node(2);
		q1.root.right=new Node(3);
		q1.root.left.left=new Node(4);
		q1.root.left.right=new Node(5);
		q1.root.left.left.left=new Node(8);
		q1.root.right.left=new Node(6);
		q1.root.right.right=new Node(7);
		q1.root.right.left.right=new Node(9);
		q1.root.right.left.right.left=new Node(10);
		System.out.println(q1.TreeisBalanced(q1.root));
		
	}

}
