package com.ltu.creational.btwo.none.pattern;

public class ClientApp {
	public static void main(String[] args) {
        ItemFactory itemFactory = new ItemFactory();

        Item itemA = itemFactory.create("ItemA", "ItemA Variant 1");
        Item itemB = itemFactory.create("ItemB", "ItemB Variant 2");

        itemA.use(); // Output: Using ItemA: ItemA Variant 1
        itemB.use(); // Output: Using ItemB: ItemB Variant 2
        
        System.out.println("If you need to add a new type of item, such as ItemC, How to deal with it?");
    }

}