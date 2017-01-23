package chapter4.chapter4;

public class Treeq5
{
	static Node root_node;
	static int array[]=new int[5];
	int i=0;

	public int[] InOrderTraversal(Node n){
		if(n==null)
			return null ;
				
		InOrderTraversal(n.left);
		//System.out.print(n.data+" ");
		array[i]=n.data;
		//System.out.println(array[i]);
		i++;
		
		
		InOrderTraversal(n.right);
		return array;
	}
	
	public static void main(String[] args)
	{
		Treeq5 t=new Treeq5();
		
		root_node=new Node(1);
		root_node.left=new Node(2);
		root_node.right=new Node(3);
		root_node.left.left=new Node(4);
		root_node.left.right=new Node(5);
		System.out.println("\nIn-order traversal of BST is");
		int arr[]=new int[5];
		arr=t.InOrderTraversal(root_node);
		for(int i=0 ;i<5;i++)
		System.out.println(arr[i]);
		int nextofElement=4;
		for(int i=0;i<5;i++){
			if(arr[i]==nextofElement){
				System.out.println(i);
				System.out.println("The next elemet will be:"+arr[i+1]);}
	
			
		}
	}
	
	}

