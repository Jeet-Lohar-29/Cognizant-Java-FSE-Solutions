/**
 * Task Management using Singly Linked List.
 */
public class TaskManagementSystem {

    private Task head;

    // Add Task
    public void addTask(int id, String name, String status) {

        Task newTask = new Task(id, name, status);

        if (head == null) {

            head = newTask;

        } else {

            Task current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newTask;

        }

        System.out.println("Task Added Successfully.");

    }

    // Search Task
    public Task searchTask(int id) {

        Task current = head;

        while (current != null) {

            if (current.taskId == id) {
                return current;
            }

            current = current.next;

        }

        return null;

    }

    // Display Tasks
    public void displayTasks() {

        System.out.println("\nTask List");
        System.out.println("----------------------");

        if (head == null) {

            System.out.println("No Tasks Found.");
            return;

        }

        Task current = head;

        while (current != null) {

            System.out.println(current);
            System.out.println();

            current = current.next;

        }

    }

    // Delete Task
    public void deleteTask(int id) {

        if (head == null) {

            System.out.println("Task List is Empty.");
            return;

        }

        if (head.taskId == id) {

            head = head.next;
            System.out.println("Task Deleted Successfully.");
            return;

        }

        Task current = head;

        while (current.next != null &&
                current.next.taskId != id) {

            current = current.next;

        }

        if (current.next == null) {

            System.out.println("Task Not Found.");

        } else {

            current.next = current.next.next;

            System.out.println("Task Deleted Successfully.");

        }

    }

}