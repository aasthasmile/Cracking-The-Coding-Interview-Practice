package chapter2;

import java.util.HashSet;

public class DeleteDuplicates {

	public static void main(String[] args) {
		LinkedListNode head = null;

		// Creating A Linked List
		for (int i = 1; i < 6; i++) {
			if (head == null) head = new LinkedListNode(i);
				else 	head.insertAtEnd(i % 3);
			}
		System.out.println("Initial Linked List :");
		LinkedListNode.printLinkedList(head);
		
		// Removing duplicate elements from LinkedList
		delDulplicates(head);
	}

	/* Write code to remove duplicates from an unsorted linked list */
	private static void delDulplicates(LinkedListNode head) {
		if (head == null) 
			return;
		else {
			HashSet<Integer> hashSet = new HashSet<Integer>();
			LinkedListNode node = head;
			LinkedListNode prev = null;
			while (head != null) {
				if (!hashSet.contains(head.data)) {
					hashSet.add(head.data);
					prev = head;
				} else 
					prev.next = head.next;
				head = head.next;
			}

			// Printing the linkedList
			System.out.println("\n\n Linked list after removing duplicate items :");
			LinkedListNode.printLinkedList(node);
		}

	}

}
/*Solution 
 * 
 Initial Linked List :
1 -> 2 -> 0 -> 1 -> 2 -> 

 Linked list after removing duplicate items :
1 -> 2 -> 0 -> */

