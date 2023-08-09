package com.ltu.creational.btwo.with.pattern;

import com.ltu.creational.btwo.none.pattern.Item;
import com.ltu.creational.btwo.none.pattern.ItemA;
import com.ltu.creational.btwo.none.pattern.ItemB;

public class ClientApp1 {
	public static void main(String[] args) {
        ItemFactoryOption1 itemFactory = new ItemFactoryOption1();

        itemFactory.registerItem("ItemA", () -> new ItemA("ItemA Variant 1"));
        itemFactory.registerItem("ItemB", () -> new ItemB("ItemB Variant 2"));
        itemFactory.registerItem("ItemC", () -> new ItemC("ItemC Variant 3"));

        Item itemA = itemFactory.create("ItemA", "ItemA Variant 1");
        Item itemB = itemFactory.create("ItemB", "ItemB Variant 2");
        Item itemC = itemFactory.create("ItemC", "ItemC Variant 3");

        itemA.use();
        itemB.use();
        itemC.use();
    }
}
