public class InventoryItem {
    // Private attributes
    private String itemName;
    private int itemID;
    private int quantity;
    private double price;

    // Constructor
    public InventoryItem(String itemName, int itemID, int quantity, double price) {
        this.itemName = itemName;
        this.itemID = itemID;
        this.quantity = quantity;
        this.price = price;
    }

    // Getter methods to retrieve attributes
    public String getItemName() {
        return itemName;
    }

    public int getItemID() {
        return itemID;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    // Setter methods to update attributes
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to add items to the inventory
    public void addItems(int quantityToAdd) {
        if (quantityToAdd > 0) {
            quantity += quantityToAdd;
        }
    }

    // Method to update the price of the item
    public void updatePrice(double newPrice) {
        if (newPrice >= 0) {
            price = newPrice;
        }
    }

    // Method to display information about the inventory item
    public void displayInfo() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Item ID: " + itemID);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price + "Rs");
    }
}


