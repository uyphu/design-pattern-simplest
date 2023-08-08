package com.ltu.creational.btwo.with.pattern;
/**
 * 
 * @author phule
 * Of course! The Open/Closed Principle encourages software entities to be open for extension but closed for modification. 
 * Let's extend the previous example by adding a new kind of product while adhering to this principle. 
 * We'll add a "NewProduct" type.
 */
public class NewProduct implements Product{

	@Override
	public void processOrder() {
		System.out.println("We'll add a \"NewProduct\" type");
		
	}

}
