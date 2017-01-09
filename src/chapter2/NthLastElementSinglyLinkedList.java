package chapter2;

public class NthLastElementSinglyLinkedList {

	public static void main(String[] args) {
		LinkedListNode head = null;

		// Creating A Linked List
		for (int i = 10; i < 20; i++) {
			if (head == null)
				head = new LinkedListNode(i + 2);
			else
				head.insertAtEnd(i);
		}

		System.out.println("Intial Linked List :");
		LinkedListNode.printLinkedList(head);

		int Nth = 5;
		NthLastElement(head, Nth);
	}

	/*
	 * Implement an algorithm to find the nth to last element of a singly linked
	 * list.
	 */
	private static void NthLastElement(LinkedListNode head, int n) {
		if (head == null)
			return;
		else {
			LinkedListNode node = head;
			int size = 0;
			while (head != null) {
				size++;
				head = head.next;
			}
			int position = size - n;
			while (position != 0) {
				node = node.next;
				position--;
			}
			System.out.println("\n\n" + n + "th Last Element of Singly-LinkedList is :" + node.data);
		}
	}
}

/*Solution :

Initial Linked List :
12 -> 11 -> 12 -> 13 -> 14 -> 15 -> 16 -> 17 -> 18 -> 19 -> 

5th Last Element of Singly-LinkedList is :15
*/