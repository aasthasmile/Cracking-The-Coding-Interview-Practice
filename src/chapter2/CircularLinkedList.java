package chapter2;

public class CircularLinkedList {

	public static void main(String[] args) {
		LinkedListNode head = null;

		// Creating A Linked List
		for (int i = 1; i < 6; i++) {
			if (head == null)
				head = new LinkedListNode(i);
			else
				head.insertAtEnd(i % 3);
		}
		
		System.out.println("Initial Linked List :");
		LinkedListNode.printLinkedList(head);
		
		System.out.println("Cycle In Linked List: "+cycleInLinkedList(head));
	}

	/*
	 * Given a circular linked list, implement an algorithm which returns node
	 * at the beginning of the loop.
	 */
	private static boolean cycleInLinkedList(LinkedListNode head) {
		if (head == null)
			return false;
		else {
			LinkedListNode node1 = head;
			LinkedListNode node2 = head.next;
			while (node1 != null && node2!=null && node2.next!=null) {
				if (node1 == node2) 
					return true;
			
			node1=node1.next;
			node2=node2.next.next;
			}
		
			return false;
		}
		
	}
}