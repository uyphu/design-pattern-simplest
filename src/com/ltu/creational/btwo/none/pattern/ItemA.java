package com.ltu.creational.btwo.none.pattern;

//ItemA implements the Item interface
public class ItemA implements Item {
	private String name;

	public ItemA(String name) {
		this.name = name;
	}

	public void use() {
		System.out.println("Using ItemA: " + name);
	}
}
