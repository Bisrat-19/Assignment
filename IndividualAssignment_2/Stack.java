package IndividualAssignment_2;

public class Stack {
	 Node top;

	 void push(int data) {
		 Node newNode = new Node(data);
		 newNode.next = top;
		 top = newNode;
	 }

	 int pop() {
		 if (top == null) throw new RuntimeException("Stack is empty");
		 int item = top.data;
		 top = top.next;
        return item;
	 }

	 int peek() {
		 if (top == null) throw new RuntimeException("Stack is empty");
		 return top.data;
	 }

	 boolean isEmpty() {
		 return top == null;
	 }
}
