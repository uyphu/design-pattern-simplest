package com.ltu.creational.factory;

//Concrete Creator B
public class ConcreteCreatorB implements Creator {
	@Override
	public Product factoryMethod() {
		return new ConcreteProductB();
	}
}
