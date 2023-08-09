package com.ltu.creational.btwo.with.pattern;

import com.ltu.creational.btwo.none.pattern.Item;

public class ClientApp2 {
	public static void main(String[] args) {
        ItemFactoryOption2 itemAFactory = new ItemAFactory();
        ItemFactoryOption2 itemBFactory = new ItemBFactory();
        ItemFactoryOption2 itemCFactory = new ItemCFactory();

        Item itemA = itemAFactory.createItem("ItemA Variant 1");
        Item itemB = itemBFactory.createItem("ItemB Variant 2");
        Item itemC = itemCFactory.createItem("ItemC Variant 3");

        itemA.use();
        itemB.use();
        itemC.use();
        System.out.println("If warehouse another item called Item2 that related to Item and when create Item it has to create Item2, How to deal with it?");
    }
}
