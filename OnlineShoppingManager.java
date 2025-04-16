import java.util.Vector;

// Product class to hold product info
class Product {
    String name;
    double price;
    String category;

    Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    void showProduct() {
        System.out.println("Name: " + name + ", Price: $" + price + ", Category: " + category);
    }
}

// Manager class to handle product operations
public class OnlineShoppingManager {
    Vector<Product> inventory = new Vector<>();

    // Add a product
    void addProduct(String name, double price, String category) {
        Product newProduct = new Product(name, price, category);
        inventory.add(newProduct);
        System.out.println("Added: " + name);
    }

    // Remove product by name
    void removeProduct(String name) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).name.equalsIgnoreCase(name)) {
                inventory.remove(i);
                System.out.println("Removed: " + name);
                return;
            }
        }
        System.out.println("Product not found: " + name);
    }

    // Show all products
    void displayProducts() {
        System.out.println("\n--- Product Inventory ---");
        if (inventory.isEmpty()) {
            System.out.println("No products available.");
        } else {
            for (Product p : inventory) {
                p.showProduct();
            }
        }
    }

    // Main method to run everything automatically
    public static void main(String[] args) {
        OnlineShoppingManager manager = new OnlineShoppingManager();

        // Add products
        manager.addProduct("Phone", 699.99, "Electronics");
        manager.addProduct("Sneakers", 89.99, "Footwear");
        manager.addProduct("Notebook", 2.99, "Stationery");

        // Show products
        manager.displayProducts();

        // Remove one product
        manager.removeProduct("Sneakers");

        // Show updated list
        manager.displayProducts();
    }
}

/*
Output:

Added: Phone
Added: Sneakers
Added: Notebook

--- Product Inventory ---
Name: Phone, Price: $699.99, Category: Electronics
Name: Sneakers, Price: $89.99, Category: Footwear
Name: Notebook, Price: $2.99, Category: Stationery
Removed: Sneakers

--- Product Inventory ---
Name: Phone, Price: $699.99, Category: Electronics
Name: Notebook, Price: $2.99, Category: Stationery
 */