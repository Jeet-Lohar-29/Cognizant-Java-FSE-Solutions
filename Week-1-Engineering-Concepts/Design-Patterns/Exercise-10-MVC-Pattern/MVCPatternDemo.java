/**
 * Demonstrates the MVC Pattern.
 */
public class MVCPatternDemo {

    public static void main(String[] args) {

        Student student = new Student(
                "Jeet Lohar",
                "12345",
                "A");

        StudentView view = new StudentView();

        StudentController controller =
                new StudentController(student, view);

        System.out.println("Initial Student Details:");
        controller.updateView();

        System.out.println();

        controller.setStudentName("Rahul Sharma");
        controller.setStudentGrade("A+");

        System.out.println("Updated Student Details:");
        controller.updateView();

    }

}