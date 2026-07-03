/**
 * Demonstrates Bubble Sort and Quick Sort.
 */
public class SortingDemo {

    public static void main(String[] args) {

        Order[] bubbleOrders = {

                new Order(101, "Jeet", 1500),
                new Order(102, "Rahul", 4500),
                new Order(103, "Aman", 2200),
                new Order(104, "Priya", 900),
                new Order(105, "Sneha", 7000)

        };

        Order[] quickOrders = bubbleOrders.clone();

        System.out.println("Bubble Sort");

        SortingAlgorithms.bubbleSort(bubbleOrders);

        for (Order order : bubbleOrders) {
            System.out.println(order);
            System.out.println();
        }

        System.out.println("Quick Sort");

        SortingAlgorithms.quickSort(
                quickOrders,
                0,
                quickOrders.length - 1);

        for (Order order : quickOrders) {
            System.out.println(order);
            System.out.println();
        }

    }

}