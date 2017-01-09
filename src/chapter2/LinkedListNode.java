package chapter2;

public class LinkedListNode {
	int data;
	LinkedListNode next;
	LinkedListNode prev;

	public LinkedListNode(int data) {
		this.data = data;
	}

	public void insertAtBeginnning(int data) {
		LinkedListNode startNode = new LinkedListNode(data);
		LinkedListNode start = this;
		startNode.next = start;
		start = startNode;
	}

	public void insertAtEnd(int data) {
		LinkedListNode end = new LinkedListNode(data);
		LinkedListNode start = this;

		while (start.next != null)
			start = start.next;
		start.next = end;
	}
	
	public void insertAtPosition(int position,int data) {
		LinkedListNode start = this;
		LinkedListNode startNode = new LinkedListNode(data);
		LinkedListNode prev=start;
		int count=1;
		while(count<position-1 && prev.next!=null){
			prev=prev.next;
			count++;
		}
		startNode.next=prev.next;
		prev.next=startNode;
		
	}
	
	public void insertAtBegining_DoublylinkedList(){
		LinkedListNode start = this;
		LinkedListNode new1 = new LinkedListNode(data);
		
		if(start!=null){
			new1.next=start;
			new1.prev=null;
			
			start.prev=new1;
			start=new1;
		}
		
	}

	public void insertAtEnd_DoublylinkedList(){
		LinkedListNode start = this;
		LinkedListNode new1 = new LinkedListNode(data);
		LinkedListNode last=start;
		while(last!=null){
			last=last.next;
		}
		last.next=new1;
		new1.prev=last;
		new1.next=null;
		last=new1;
	}
	
	public static void printLinkedList(LinkedListNode head) {

		while (head != null) {
			System.out.print(head.data + " -> ");
			head = head.next;
		}
		System.out.println("\n");
	}

	public static int sizeOfLinkedList(LinkedListNode head) {

		LinkedListNode node = head;
		int size = 0;
		while (node != null) {
			size++;
			node = node.next;
		}
		return size;

	}
}
