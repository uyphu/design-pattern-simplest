package com.ltu.creational.btwo.with.pattern;

import com.ltu.creational.btwo.none.pattern.Item;

public class ItemCFactory implements ItemFactoryOption2{
	public Item createItem(String name) {
        return new ItemC(name);
    }
}