package chapter4.chapter4;

public class BinaryTree
{
	static Node root;
	static int position=1;
	void initRoot(int value){
		if(root==null)
			root=new Node(value);
		else{
			BTInsert(root, new Node(value),position);
			position++;
						}
		}
	
	void BTInsert( Node root,Node newNode,int i){
		if(root==null) 
			return;
		else
		{
			int parent=(i-1)/2;
			if(parent==0){  //data for the root node
				if(root.left==null) root.left=newNode;
				if(root.right==null) root.right=newNode;
				System.out.println("The newNode= "+newNode.data+" is inserted at "+i+" position");
			}
			else {  //data for other nodes
				
				if((parent%2)==1) //2*i+1
						root=root.left;
				else if ((parent%2)==0)  //2*i+2
						root=root.right;
				}
			System.out.println("The newNode= "+newNode.data+" is inserted at "+i+" position");
		}	
		
	}
	

	public static void main(String[] args)
	{
		BinaryTree btree=new BinaryTree();
		btree.initRoot(7);
		btree.initRoot(2);
		btree.initRoot(4);
		btree.initRoot(8);
		btree.initRoot(9);
		btree.initRoot(0);
		btree.initRoot(12);
		btree.initRoot(13);
		
		
		

	}

}
