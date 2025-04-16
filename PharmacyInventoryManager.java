import java.util.ArrayList;

// Class representing a medication or supply item
class Item {
    String id;
    String name;
    int quantity;
    double price;

    Item(String id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    void showItem() {
        System.out.println("ID: " + id + ", Name: " + name +
                ", Quantity: " + quantity + ", Price: $" + price);
    }
}

public class PharmacyInventoryManager {
    ArrayList<Item> inventory = new ArrayList<>();

    // Add a new item
    void addItem(String id, String name, int quantity, double price) {
        for (Item item : inventory) {
            if (item.id.equalsIgnoreCase(id)) {
                System.out.println("Item with ID " + id + " already exists.");
                return;
            }
        }
        inventory.add(new Item(id, name, quantity, price));
        System.out.println("Item added: " + name);
    }

    // Update an existing item by ID
    void updateItem(String id, int newQuantity, double newPrice) {
        for (Item item : inventory) {
            if (item.id.equalsIgnoreCase(id)) {
                item.quantity = newQuantity;
                item.price = newPrice;
                System.out.println("Item updated: " + item.name);
                return;
            }
        }
        System.out.println("Item with ID " + id + " not found.");
    }

    // Remove an item by ID
    void removeItem(String id) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).id.equalsIgnoreCase(id)) {
                System.out.println("Removed item: " + inventory.get(i).name);
                inventory.remove(i);
                return;
            }
        }
        System.out.println("Item with ID " + id + " not found.");
    }

    // Display all items
    void displayItems() {
        System.out.println("\n--- Pharmacy Inventory ---");
        if (inventory.isEmpty()) {
            System.out.println("No items in inventory.");
        } else {
            for (Item item : inventory) {
                item.showItem();
            }
        }
    }

    // Search for an item by ID
    void searchItemById(String id) {
        for (Item item : inventory) {
            if (item.id.equalsIgnoreCase(id)) {
                System.out.println("Item found:");
                item.showItem();
                return;
            }
        }
        System.out.println("Item with ID " + id + " not found.");
    }

    // Main method (no user input, runs automatically)
    public static void main(String[] args) {
        PharmacyInventoryManager manager = new PharmacyInventoryManager();

        // Add some items
        manager.addItem("MED001", "Paracetamol", 100, 1.50);
        manager.addItem("MED002", "Bandage", 50, 0.75);
        manager.addItem("MED003", "Antibiotic Cream", 30, 5.25);

        // Display inventory
        manager.displayItems();

        // Update an item
        manager.updateItem("MED002", 60, 0.80);

        // Remove an item
        manager.removeItem("MED003");

        // Search for an item
        manager.searchItemById("MED001");

        // Final inventory display
        manager.displayItems();
    }
}

/*
Output:

Item added: Paracetamol
Item added: Bandage
Item added: Antibiotic Cream

--- Pharmacy Inventory ---
ID: MED001, Name: Paracetamol, Quantity: 100, Price: $1.5
ID: MED002, Name: Bandage, Quantity: 50, Price: $0.75
ID: MED003, Name: Antibiotic Cream, Quantity: 30, Price: $5.25
Item updated: Bandage
Removed item: Antibiotic Cream
Item found:
ID: MED001, Name: Paracetamol, Quantity: 100, Price: $1.5

--- Pharmacy Inventory ---
ID: MED001, Name: Paracetamol, Quantity: 100, Price: $1.5
ID: MED002, Name: Bandage, Quantity: 60, Price: $0.8
 */