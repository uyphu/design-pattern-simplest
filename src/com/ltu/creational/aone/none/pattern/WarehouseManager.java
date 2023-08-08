package com.ltu.creational.aone.none.pattern;

import java.util.HashMap;
import java.util.Map;

class WarehouseManager {
    private Map<String, Integer> inventory;

    public WarehouseManager() {
        inventory = new HashMap<>();
    }

    public void addItem(String item, int quantity) {
        inventory.put(item, quantity);
    }

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

    public void displayInventory() {
        System.out.println("Current Inventory:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    
    public static void main(String[] args) {
        WarehouseManager warehouseManager = new WarehouseManager();

        warehouseManager.addItem("Product A", 50);
        warehouseManager.addItem("Product B", 100);

        warehouseManager.displayInventory();

        warehouseManager.removeItem("Product A", 20);

        warehouseManager.displayInventory();
    }
}



