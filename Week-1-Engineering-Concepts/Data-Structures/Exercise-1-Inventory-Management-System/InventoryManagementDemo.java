/**
 * Demonstrates Inventory Management System.
 */
public class InventoryManagementDemo {

    public static void main(String[] args) {

        InventoryManager inventory = new InventoryManager();

        inventory.addProduct(
                new Product(101, "Laptop", 15, 65000));

        inventory.addProduct(
                new Product(102, "Keyboard", 50, 1200));

        inventory.displayInventory();

        inventory.updateProduct(
                101,
                "Gaming Laptop",
                10,
                72000);

        inventory.displayInventory();

        inventory.deleteProduct(102);

        inventory.displayInventory();

    }

}