package com.ltu.creational.btwo.none.pattern;

//ItemB implements the Item interface
public class ItemB implements Item {
	private String name;

	public ItemB(String name) {
		this.name = name;
	}

	public void use() {
		System.out.println("Using ItemB: " + name);
	}
}
