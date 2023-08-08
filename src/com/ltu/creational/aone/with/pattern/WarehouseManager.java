/**
 * The Singleton Pattern is used when you want to ensure that a class has only one instance 
 * throughout the entire life cycle of your application, and that instance should be easily 
 * accessible from anywhere in the application.
 * Ex: Database Connection, Log, Cache, Configuration
 */
/**
 * Class Diagram
+----------------------------+
| Singleton                  |
+----------------------------+
| - instance: Singleton      |
+----------------------------+
| + getInstance(): Singleton |
+----------------------------+

 */
package com.ltu.creational.aone.with.pattern;

import java.util.HashMap;
import java.util.Map;


/**
 * The Class WarehouseManager.
 */
class WarehouseManager {
    
    /** The instance. */
    private static volatile WarehouseManager instance; // Singleton instance
    
    /** The inventory. */
    private Map<String, Integer> inventory;

    /**
     * Instantiates a new warehouse manager.
     */
    private WarehouseManager() {
        inventory = new HashMap<>();
    }

    /**
     * Gets the single instance of WarehouseManager.
     *
     * @return single instance of WarehouseManager
     */
    public static WarehouseManager getInstance() {
        if (instance == null) {
        	synchronized (WarehouseManager.class) {
				if (instance == null) {
					instance = new WarehouseManager();
				}
			}
            
        }
        return instance;
    }

    /**
     * Adds the item.
     *
     * @param item the item
     * @param quantity the quantity
     */
    public void addItem(String item, int quantity) {
        inventory.put(item, quantity);
    }

    /**
     * Removes the item.
     *
     * @param item the item
     * @param quantity the quantity
     */
    public void removeItem(String item, int quantity) {
        if (inventory.containsKey(item)) {
            int currentQuantity = inventory.get(item);
            if (currentQuantity >= quantity) {
                inventory.put(item, currentQuantity - quantity);
            } else {
                System.out.println("Insufficient quantity available.");
            }
        } else {
            System.out.println("Item not found in inventory.");
        }
    }

    /**
     * Display inventory.
     */
    public void displayInventory() {
        System.out.println("Current Inventory:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        WarehouseManager warehouseManager = WarehouseManager.getInstance();

        warehouseManager.addItem("Product A", 50);
        warehouseManager.addItem("Product B", 100);

        warehouseManager.displayInventory();

        warehouseManager.removeItem("Product A", 20);

        warehouseManager.displayInventory();
    }
}
