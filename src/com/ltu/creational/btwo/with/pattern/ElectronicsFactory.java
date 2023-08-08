package com.ltu.creational.btwo.with.pattern;

class ElectronicsFactory implements ProductFactory {
    public Product createProduct() {
        return new ElectronicsProduct();
    }
}