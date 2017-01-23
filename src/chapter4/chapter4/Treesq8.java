package chapter4.chapter4;

public class Treesq8
{
	static Node root_1;
	
	static int n=5;
	public static void main(String[] args)
	{
		Treesq8 path=new Treesq8();
		root_1=new Node(4);
		root_1.left=new Node(2);
		root_1.right=new Node(3);
		root_1.left.left=new Node(4);
		root_1.left.right=new Node(8);
		root_1.left.right.right=new Node(1);
		int level=0;
		path.SumatEachLevel(root_1,root_1.data,level);

	}


	private void SumatEachLevel(Node root_1, int data, int level)
	{
//		1.Calculate depth of tree
//		2.At each depth,enter the node value in key and list that sum-up to that value in List<node>
//		 i.e.hashmap<integer,<list<node>>>
//		3.At depth=0 , hashmap.add(root.data)
//		   list<node> sum=new list<node>
//		   for(i=depth;i>=0;i--){
//		    sum=sum+root_1.data
//		   }
			
	
		
	}

}
