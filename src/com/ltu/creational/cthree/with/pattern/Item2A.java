package com.ltu.creational.cthree.with.pattern;

//Item2A implements the Item2 interface
class Item2A implements Item2 {
	private String name;

	public Item2A(String name) {
		this.name = name;
	}

	public void useItem2() {
		System.out.println("Using Item2A: " + name);
	}
}
