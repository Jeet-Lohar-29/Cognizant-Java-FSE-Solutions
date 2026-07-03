import java.util.Arrays;
import java.util.Comparator;

/**
 * Demonstrates Linear Search and Binary Search.
 */
public class SearchDemo {

    public static void main(String[] args) {

        Product[] products = {

                new Product(105, "Laptop", "Electronics"),
                new Product(101, "Mouse", "Electronics"),
                new Product(108, "Keyboard", "Electronics"),
                new Product(103, "Monitor", "Electronics"),
                new Product(110, "Printer", "Electronics")

        };

        System.out.println("Linear Search");

        Product linearResult =
                SearchAlgorithms.linearSearch(products, 103);

        if (linearResult != null)
            System.out.println(linearResult);
        else
            System.out.println("Product Not Found");

        // Sort array before Binary Search
        Arrays.sort(products,
                Comparator.comparingInt(Product::getProductId));

        System.out.println("\nBinary Search");

        Product binaryResult =
                SearchAlgorithms.binarySearch(products, 103);

        if (binaryResult != null)
            System.out.println(binaryResult);
        else
            System.out.println("Product Not Found");

    }

}