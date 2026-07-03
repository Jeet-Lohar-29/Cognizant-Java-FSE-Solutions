import java.util.HashMap;

/**
 * Inventory Management using HashMap.
 */
public class InventoryManager {

    private HashMap<Integer, Product> inventory = new HashMap<>();

    // Add Product
    public void addProduct(Product product) {

        inventory.put(product.getProductId(), product);

        System.out.println("Product Added Successfully.");
    }

    // Update Product
    public void updateProduct(int id, String name, int quantity, double price) {

        Product product = inventory.get(id);

        if (product != null) {

            product.setProductName(name);
            product.setQuantity(quantity);
            product.setPrice(price);

            System.out.println("Product Updated Successfully.");

        } else {

            System.out.println("Product Not Found.");

        }

    }

    // Delete Product
    public void deleteProduct(int id) {

        if (inventory.remove(id) != null) {

            System.out.println("Product Deleted Successfully.");

        } else {

            System.out.println("Product Not Found.");

        }

    }

    // Display Inventory
    public void displayInventory() {

        System.out.println("\nInventory");

        System.out.println("-----------------------------");

        if (inventory.isEmpty()) {

            System.out.println("Inventory is Empty.");

            return;

        }

        for (Product product : inventory.values()) {

            System.out.println(product);

            System.out.println();

        }

    }

}