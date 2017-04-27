package chapter4.chapter4;

public class Treesq3
{
	static Node r;
	/*Pre-order tranversal of bST using minimal height*/
	
	public Node merge_sort(int array[],int start,int end){
			if (end < start) 
				return  null;
			 int mid = (start + end) / 2;
			 Node root=new Node(array[mid]);
			 root.left = merge_sort(array, start, mid - 1);
			 root.right = merge_sort(array, mid + 1, end);
			 return root;
	 
	}
	public void preOrderTraversal(Node n){
		if(n==null)
			return;
		
		System.out.print(n.data+" ");
		preOrderTraversal(n.left);
		preOrderTraversal(n.right);
		
		
	}
	public void InOrderTraversal(Node n){
		if(n==null)
			return;
				
		InOrderTraversal(n.left);
		System.out.print(n.data+" ");
		InOrderTraversal(n.right);
		
	}
	public void postOrderTraversal(Node n){
		if(n==null)
			return;
				
		postOrderTraversal(n.left);
		postOrderTraversal(n.right);
		System.out.print(n.data+" ");
		}
	
	public static void main(String[] args)
	{
		Treesq3 tree=new Treesq3();
		int arr[]=new int[]{4,5,1,2,8,5};
		
		//r=tree.merge_sort(arr, 0, arr.length-1);
		System.out.println("Pre-order traversal of BST is");
		for(int i=0;i<arr.length;i++)
		tree.preOrderTraversal(new Node(arr[i]));
		System.out.println("\nIn-order traversal of BST is");
		for(int i=0;i<arr.length;i++)
		tree.InOrderTraversal(new Node(arr[i]));
		System.out.println("\nPost-order traversal of BST is");
		for(int i=0;i<arr.length;i++)
		tree.postOrderTraversal(new Node(arr[i]));
		
		}

}
