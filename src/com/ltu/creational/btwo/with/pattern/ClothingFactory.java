package com.ltu.creational.btwo.with.pattern;

class ClothingFactory implements ProductFactory {
    public Product createProduct() {
        return new ClothingProduct();
    }
}

