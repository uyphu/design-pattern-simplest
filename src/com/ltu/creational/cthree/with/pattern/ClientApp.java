package com.ltu.creational.cthree.with.pattern;

import com.ltu.creational.btwo.none.pattern.Item;

public class ClientApp {
	
	public static void main(String[] args) {
        GroupFactory itemAFactory = new GroupAFactory();
        GroupFactory itemBFactory = new GroupBFactory();

        Item itemA = itemAFactory.createItem("ItemA Variant 1");
        Item2 item2A = itemAFactory.createItem2("Item2A Variant 1");

        Item itemB = itemBFactory.createItem("ItemB Variant 2");
        Item2 item2B = itemBFactory.createItem2("Item2B Variant 2");

        itemA.use();
        item2A.useItem2();
        itemB.use();
        item2B.useItem2();
    }

}
