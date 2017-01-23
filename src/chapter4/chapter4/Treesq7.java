package chapter4.chapter4;

public class Treesq7
{
	static Node root_1;
	static Node root_2;
	private boolean compareTwoTrees(Node root1, Node root2)
	{
		if(root1==null){
			System.out.println("Tree 1 is empty");
			return false;
		}
		else if(root2==null){
			System.out.println("Tree2 is empty");
			return false;
		}
		else{
			if(root1.data==root2.data){
				System.out.println("T2 is Subtree of T1");
				Inordertravesal(root1,root2);
				return true;
			}
			else if(root1.left!=null){
				compareTwoTrees(root1.left, root2);
			}
			else if(root1.right!=null){
				compareTwoTrees(root1.right, root2);
			}
			else{
				System.out.println("T2 is not subtree of T1");
				return false;
			}
			return true;
		}
	
			
	}


	
	private void Inordertravesal(Node root1, Node root2)
	{
		if(root2==null)
			return;
		if(root1==null){
			System.out.println("Error1");
			System.exit(0);
		}
		Inordertravesal(root1.left, root2.left);
		if(root2.data!=root1.data){
			System.out.println("Error2");
			System.exit(0);
		}
		Inordertravesal(root1.right, root2.right);
			
	}



	public static void main(String[] args)
	{
		Treesq7 subtree=new Treesq7();
		root_1=new Node(1);
		root_1.left=new Node(2);
		root_1.right=new Node(3);
		root_1.left.left=new Node(4);
		root_1.left.right=new Node(5);
		root_1.left.right.right=new Node(6);
		//root_1.left.right.right.left=new Node(7);
		
		
		root_2=new Node(2);
		root_2.left=new Node(4);
		root_2.right=new Node(5);
		root_2.right.right=new Node(6);
		root_2.right.right.left=new Node(7);
		
		//root_2.left.left=new Node(4);
		//root_2.left.right=new Node(5);
		
		subtree.compareTwoTrees(root_1,root_2);

	}

	
}
