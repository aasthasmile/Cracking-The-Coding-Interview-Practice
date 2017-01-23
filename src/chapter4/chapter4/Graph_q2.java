package chapter4.chapter4;

import java.util.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Graph_q2
{
	List<Integer> adjacent[] ;
	public void directedGraph(){
	adjacent=new List[10];
	for(int i=0;i<adjacent.length;i++){
		adjacent[i]=new ArrayList<Integer>();
		}	
	}
	
	public void addEdgetoGraph(int v1,int v2){
		adjacent[v1].add(v2);
	}
	
	public boolean NodeReacheable(int source,int destination){
		
		boolean VisitedNodes[]=new boolean[10];
		LinkedList<Integer> queue=new LinkedList<>();
		queue.add(source);
		while(!queue.isEmpty()){
			int s=queue.poll();
			Iterator<Integer> it=adjacent[s].iterator();
			while(it.hasNext()){
				int n=it.next();
				if(n== destination)
					return true;
				
				if(!VisitedNodes[n]){
					VisitedNodes[n]=true;
					queue.add(n);
				}
			}
		}
		return false;
	}
	
	
	public static void main(String[] args)
	{
		Graph_q2 graph=new Graph_q2();
		graph.directedGraph();
		graph.addEdgetoGraph(0, 1);
		graph.addEdgetoGraph(0, 2);
		graph.addEdgetoGraph(1, 2);
		graph.addEdgetoGraph(2, 0);
		graph.addEdgetoGraph(2, 3);
		graph.addEdgetoGraph(3, 3);
		
		boolean b=graph.NodeReacheable(0, 3);
		System.out.println(b);
			}



	
}
