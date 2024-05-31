package IndividualAssignment_2;

public class Node {
	int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

// Linked List class
class LinkedList {
    Node head;
    Node tail;

    public void insertAtPos(int data, int pos) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        int count = 1;
        while (current != null && count < pos - 1) {
            current = current.next;
            count++;
        }
        if (current == null) {
            tail.next = newNode;
            tail = newNode;
        } else {
            newNode.next = current.next;
            current.next = newNode;
            if (newNode.next == null) {
                tail = newNode;
            }
        }
    }

    public boolean searchNode(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void deleteAtPosition(int pos) {
        if (head == null) {
            return;
        }
        if (pos == 1) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return;
        }
        Node current = head;
        int count = 1;
        while (current != null && count < pos - 1) {
            current = current.next;
            count++;
        }
        if (current == null || current.next == null) {
            return;
        }
        Node temp = current.next;
        current.next = temp.next;
        if (temp.next == null) {
            tail = current;
        }
    }

    public void deleteAfterNode(Node node) {
        if (node == null || node.next == null) {
            return;
        }
        Node temp = node.next;
        node.next = temp.next;
        if (temp.next == null) {
            tail = node;
        }
    }
}