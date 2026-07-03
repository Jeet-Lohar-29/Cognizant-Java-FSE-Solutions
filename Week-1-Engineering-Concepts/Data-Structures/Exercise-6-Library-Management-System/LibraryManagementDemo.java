import java.util.Arrays;
import java.util.Comparator;

/**
 * Demonstrates Library Search.
 */
public class LibraryManagementDemo {

    public static void main(String[] args) {

        Book[] books = {

                new Book(101, "Java Programming", "James Gosling"),
                new Book(102, "Data Structures", "Mark Allen"),
                new Book(103, "Operating Systems", "Galvin"),
                new Book(104, "Computer Networks", "Andrew Tanenbaum"),
                new Book(105, "Database Systems", "Elmasri")

        };

        System.out.println("Linear Search\n");

        Book linearResult =
                LibrarySearch.linearSearch(
                        books,
                        "Operating Systems");

        if (linearResult != null)
            System.out.println(linearResult);
        else
            System.out.println("Book Not Found.");

        Arrays.sort(
                books,
                Comparator.comparing(Book::getTitle));

        System.out.println("\nBinary Search\n");

        Book binaryResult =
                LibrarySearch.binarySearch(
                        books,
                        "Operating Systems");

        if (binaryResult != null)
            System.out.println(binaryResult);
        else
            System.out.println("Book Not Found.");

    }

}