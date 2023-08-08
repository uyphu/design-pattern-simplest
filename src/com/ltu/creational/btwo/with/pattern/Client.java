package com.ltu.creational.btwo.with.pattern;


public class Client {
    public static void main(String[] args) {
        ProductFactory electronicsFactory = new ElectronicsFactory();
        ProductFactory clothingFactory = new ClothingFactory();
        ProductFactory booksFactory = new BooksFactory();

        Product electronicsProduct = electronicsFactory.createProduct();
        Product clothingProduct = clothingFactory.createProduct();
        Product booksProduct = booksFactory.createProduct();

        electronicsProduct.processOrder();
        clothingProduct.processOrder();
        booksProduct.processOrder();
        
        //When we have a new requirement
        ProductFactory newFactory = new NewFactory();
        
        Product newProduct = newFactory.createProduct();
        newProduct.processOrder();
    }
}