package chapter4.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Treesq4
{
	static Node root_node;
	
	public ArrayList<LinkedList<Node>> LinkedLevelList(Node root){
		int level=0;
		ArrayList<LinkedList<Node>> Allnodes=new ArrayList<LinkedList<Node>>();
		LinkedList<Node> elementsListAtEachLevel=new LinkedList<Node>();
		elementsListAtEachLevel.add(root);
		Allnodes.add(level, elementsListAtEachLevel);
		
		while (true){
			elementsListAtEachLevel=new LinkedList<Node>();
			for (int i=0;i<Allnodes.get(level).size();i++){
				Node n=Allnodes.get(level).get(i);
				System.out.println("Elements at level="+(level)+" is  "+n.data);
				if(n!=null){
					if(n.left!=null) 
						elementsListAtEachLevel.add(n.left);
					if(n.right!=null)
						elementsListAtEachLevel.add(n.right);
			}
		}
	if(elementsListAtEachLevel.size() > 0){
		Allnodes.add(level+1, elementsListAtEachLevel);
		//System.out.println();
	}else
		break;
	level++;
	}
		return Allnodes;
	}

	public static void main(String[] args){
		Treesq4 t=new Treesq4();
		root_node=new Node(1);
		root_node.left=new Node(2);
		root_node.right=new Node(3);
		root_node.left.left=new Node(4);
		root_node.left.right=new Node(5);
		root_node.left.left.left=new Node(8);
		root_node.right.left=new Node(6);
		root_node.right.right=new Node(7);
		root_node.right.left.right=new Node(9);
		root_node.right.left.right.left=new Node(10);
		
		ArrayList<LinkedList<Node>> list=t.LinkedLevelList(root_node);
	}
}
	
	
	
	
	
	
	
	
	

//	static Node root;
//	ArrayList<LinkedList<Node>> treeNodesAtEachLevel=new ArrayList<LinkedList<Node>>();
//	
//	public static ArrayList<LinkedList<Node>> makeArrayForEachLevel(Node node){
//		int level=0;//root node
//		return addNodesToLists(new ArrayList<LinkedList<Node>>(),node,level);
//	}
//	
//	private static ArrayList<LinkedList<Node>> addNodesToLists(ArrayList<LinkedList<Node>> arrayList,Node root,int level ){
//	if(root!=null) {
//		if(arrayList.get(level)==null){
//			LinkedList<Node> newList=new LinkedList<Node>();
//			arrayList.add(level,newList);
//		}
//	LinkedList<Node> nodeList = arrayList.get(level);
//    nodeList.add(root);
//    addNodesToLists(arrayList, root.left, level + 1);
//    addNodesToLists(arrayList, root.right, level + 1);
//	}
//	
//	return arrayList;
//}
//public static void main(String[] args)
//	{
//		int level=0;
//		ArrayList<LinkedList<Node>> nodes=new ArrayList<>();
//		nodes.add(0,Arrays.asList(20,24,26,28,32,34,36));
//		
//		ArrayList<LinkedList<Node>> list= makeArrayForEachLevel(root);
//		addNodesToLists(nodes, root, level);
//	}


