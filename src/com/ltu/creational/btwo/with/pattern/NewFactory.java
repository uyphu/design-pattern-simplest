package com.ltu.creational.btwo.with.pattern;

public class NewFactory implements ProductFactory{

	@Override
	public Product createProduct() {
		// TODO Auto-generated method stub
		return new NewProduct();
	}

}
