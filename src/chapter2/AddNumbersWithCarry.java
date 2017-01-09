package chapter2;

public class AddNumbersWithCarry {

	public static void main(String[] args) {
		LinkedListNode head1 = null, head2 = null;

		// Creating A Linked List
		for (int i = 2; i < 5; i++) {
			if (head1 == null)
				head1 = new LinkedListNode(i);
			else
				head1.insertAtEnd(i + 2);
		}

		System.out.println("First Linked List :");
		LinkedListNode.printLinkedList(head1);

		// Creating A Linked List
		for (int i = 2; i < 5; i++) {
			if (head2 == null)
				head2 = new LinkedListNode(i + 3);
			else
				head2.insertAtEnd(i);
		}
		System.out.println("\nSecond Linked List :");
		LinkedListNode.printLinkedList(head2);

		AddLinkedListWithCarry(head1, head2);

	}
	/*
	 * You have two numbers represented by a linked list, where each node
	 * contains a single digit. The digits are stored in reverse order, such
	 * that the 1’s digit is at the head of the list. Write a function that adds
	 * the two numbers and returns the sum as a linked list.
	 */

	private static void AddLinkedListWithCarry(LinkedListNode head1, LinkedListNode head2) {
		int len1 = LinkedListNode.sizeOfLinkedList(head1);
		int len2 = LinkedListNode.sizeOfLinkedList(head2);

		if (head1 == null || head2 == null || len1 != len2)
			return;
		else {
			int carry = 0, data = 0;
			LinkedListNode node3 = null;
			LinkedListNode head3 = null;
			while (head1 != null) {
				
				data = ((head1.data + head2.data) % 10) + carry;
				carry = (head1.data + head2.data) / 10;
				
				if (node3 == null) {
					node3 = new LinkedListNode((head1.data + head2.data) % 10);
					head3 = node3;
				} 
				else {
					node3.insertAtEnd(data);
				}
				head1 = head1.next;
				head2 = head2.next;
				
			}

			System.out.println("\n\nLinked list after addition:- ");
			LinkedListNode.printLinkedList(head3);

		}

	}

}
/*Solution :
First Linked List :
2 -> 5 -> 6 -> 


Second Linked List :
5 -> 3 -> 4 -> 



Linked list after addition:- 
7 -> 8 -> 0 -> */