public class Main {
    public static void main(String[] args) {
        // Create an instance of InventoryItem
        InventoryItem item1 = new InventoryItem("Apple", 10, 5, 150);

        // Display information about the inventory item
        System.out.println("Initial Inventory Item:");
        item1.displayInfo();

        // Add items to the inventory
        item1.addItems(5);

        // Update the price
        item1.updatePrice(180);

        // Display updated information
        System.out.println("\nUpdated Inventory Item:");
        item1.displayInfo();
    }
}