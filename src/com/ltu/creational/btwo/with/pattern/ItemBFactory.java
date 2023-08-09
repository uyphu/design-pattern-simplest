package com.ltu.creational.btwo.with.pattern;

import com.ltu.creational.btwo.none.pattern.Item;
import com.ltu.creational.btwo.none.pattern.ItemB;

public class ItemBFactory implements ItemFactoryOption2{
	public Item createItem(String name) {
        return new ItemB(name);
    }
}
