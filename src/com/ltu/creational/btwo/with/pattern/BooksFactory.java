package com.ltu.creational.btwo.with.pattern;

class BooksFactory implements ProductFactory {
    public Product createProduct() {
        return new BooksProduct();
    }
}
