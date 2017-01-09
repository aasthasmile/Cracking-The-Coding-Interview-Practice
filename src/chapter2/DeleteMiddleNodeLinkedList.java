package chapter2;

public class DeleteMiddleNodeLinkedList {

	public static void main(String[] args) {
		LinkedListNode head = null;

		// Creating A Linked List
		for (int i = 10; i < 27; i++) {
			if (head == null)
				head = new LinkedListNode(i + 2);
			else
				head.insertAtEnd(i);
		}

		System.out.println("Initial Linked List :");
		LinkedListNode.printLinkedList(head);

		DeleteMiddleElement(head);

	}

	/*
	 * Implement an algorithm to delete a node in the middle of a single linked
	 * list, given only access to that node.
	 */

	private static void DeleteMiddleElement(LinkedListNode head) {
		if (head == null)
			return;
		else {
			int size = sizeOfLinkedList(head);
						
			LinkedListNode curr = head;
			LinkedListNode prev = null;
			
			//Odd or even size of list
			int middle=(size%2!=0)?(size/2)+1:(size/2) ;
			for (int i = 1; i < middle; i++) {
				prev = curr;
				curr = curr.next;
			}
			prev.next = curr.next;
			curr.next = null;

			// Printing the linkedList
			System.out.println("\n\n Linked list after removing "+middle+"th item :");
			LinkedListNode.printLinkedList(head);
		}
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
/*Solution
 * Initial Linked List :
12 -> 11 -> 12 -> 13 -> 14 -> 15 -> 16 -> 17 -> 18 -> 19 -> 

 Linked list after removing 5th item :
12 -> 11 -> 12 -> 13 -> 15 -> 16 -> 17 -> 18 -> 19 -> */
