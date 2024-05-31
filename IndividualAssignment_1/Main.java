package IndividualAssignment_1;

public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();

        // Add some tasks to the to-do list
        Task task1 = new Task("Finish the presentation", "Prepare the slides and practice the presentation");
        Task task2 = new Task("Clean the house", "Vacuum, dust, and mop the floors");
        Task task3 = new Task("Read a book", "Start reading the latest book by your favorite author");
        Task task4 = new Task("Go for a jog", "Spend 30 minutes jogging around the park");

        toDoList.addToDo(task1);
        toDoList.addToDo(task2);
        toDoList.addToDo(task3);
        toDoList.addToDo(task4);

        // View the current to-do list
        System.out.println("Current To-Do List:");
        toDoList.viewToDoList();

        // Mark a task as completed
        toDoList.markToDoAsCompleted("Clean the house");

        // View the updated to-do list
        System.out.println("\nUpdated To-Do List:");
        toDoList.viewToDoList();

    }
}


