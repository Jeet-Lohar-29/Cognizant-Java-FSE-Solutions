/**
 * Demonstrates Task Management System.
 */
public class TaskManagementDemo {

    public static void main(String[] args) {

        TaskManagementSystem taskManager =
                new TaskManagementSystem();

        taskManager.addTask(
                101,
                "Design Database",
                "Pending");

        taskManager.addTask(
                102,
                "Develop Login Module",
                "In Progress");

        taskManager.addTask(
                103,
                "Testing",
                "Pending");

        taskManager.displayTasks();

        System.out.println("Searching Task...\n");

        Task task = taskManager.searchTask(102);

        if (task != null)
            System.out.println(task);
        else
            System.out.println("Task Not Found.");

        System.out.println();

        taskManager.deleteTask(102);

        taskManager.displayTasks();

    }

}