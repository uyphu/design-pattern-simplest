package com.ltu.creational.factory;

//Concrete Creator A
public class ConcreteCreatorA implements Creator {
	@Override
	public Product factoryMethod() {
		return new ConcreteProductA();
	}
}