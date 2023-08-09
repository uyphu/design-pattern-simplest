package com.ltu.creational.btwo.with.pattern;

import com.ltu.creational.btwo.none.pattern.Item;

//ItemC implements the Item interface
class ItemC implements Item {
	private String name;

	public ItemC(String name) {
		this.name = name;
	}

	public void use() {
		System.out.println("Using ItemC: " + name);
	}
}
