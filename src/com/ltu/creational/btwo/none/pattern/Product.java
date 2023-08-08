package com.ltu.creational.btwo.none.pattern;

/**
 * In this example, the Product class handles the processing of different product types. 
 * However, this approach leads to code that's harder to maintain and extend, especially as more product types are added.
	Refactor Using Factory Method Pattern:
 * @author phule
 *
 */

class Product {
    private String type;

    public Product(String type) {
        this.type = type;
    }

    public void processOrder() {
        if (type.equals("electronics")) {
            System.out.println("Processing electronics product order...");
            // Additional logic for electronics products
        } else if (type.equals("clothing")) {
            System.out.println("Processing clothing product order...");
            // Additional logic for clothing products
        } else if (type.equals("books")) {
            System.out.println("Processing books product order...");
            // Additional logic for books products
        } else {
            System.out.println("Unknown product type.");
        }
    }
    
    //For testing
    public static void main(String[] args) {
        Product electronicsProduct = new Product("electronics");
        Product clothingProduct = new Product("clothing");
        Product booksProduct = new Product("books");

        electronicsProduct.processOrder();
        clothingProduct.processOrder();
        booksProduct.processOrder();
    }
}
