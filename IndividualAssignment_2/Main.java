package IndividualAssignment_2;

public class Main {
	 public static void main(String[] args) {
		 // Test Linked List operations
		 LinkedList list = new LinkedList();
		 list.insertAtPos(70, 1);
		 list.insertAtPos(80, 2);
		 list.insertAtPos(90, 3);

		 System.out.println("Linked List: ");
		 printList(list.head);

		 System.out.println("\nSearching for 20: " + list.searchNode(70));
		 System.out.println("Searching for 40: " + list.searchNode(40));

		 list.deleteAtPosition(2);
		 System.out.println("\nLinked List after deleting at position 2: ");
		 printList(list.head);

		 list.deleteAfterNode(list.head);
		 System.out.println("\nLinked List after deleting after the head node: ");
		 printList(list.head);

		 // Test Stack operations
		 Stack stack = new Stack();
		 stack.push(10);
		 stack.push(20);
		 stack.push(30);

		 System.out.println("\nStack: ");
		 System.out.println("Peek: " + stack.peek());
		 System.out.println("Pop: " + stack.pop());
		 System.out.println("Peek: " + stack.peek());
	 }

	 static void printList(Node node) {
		 while (node != null) {
			 System.out.print(node.data + " ");
			 node = node.next;
		 }
	 }
}
