package com.ltu.creational.cthree.with.pattern;

//Item2B implements the Item2 interface
class Item2B implements Item2 {
	private String name;

	public Item2B(String name) {
		this.name = name;
	}

	public void useItem2() {
		System.out.println("Using Item2B: " + name);
	}
}
