package IndividualAssignment_1;

public class ToDoList {
	private Node head;

    public ToDoList() {
        this.head = null;
    }

    public void addToDo(Task task) {
        Node newNode = new Node(task);

        if (this.head == null) {
            this.head = newNode;
        } else {
            Node current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void markToDoAsCompleted(String title) {
        Node current = this.head;
        while (current != null) {
            if (current.task.getTitle().equals(title)) {
                current.task.markCompleted();
                return;
            }
            current = current.next;
        }
        System.out.println("Task with title '" + title + "' not found.");
    }

    public void viewToDoList() {
        Node current = this.head;
        if (current == null) {
            System.out.println("To-Do List is empty.");
            return;
        }

        System.out.println("To-Do List:");
        while (current != null) {
            System.out.println("- " + current.task.getTitle() + " (" + (current.task.isCompleted() ? "Completed" : "Incomplete") + ")");
            current = current.next;
        }
    }
}


