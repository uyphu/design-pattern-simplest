package com.ltu.creational.btwo.with.pattern;

import com.ltu.creational.btwo.none.pattern.Item;
import com.ltu.creational.btwo.none.pattern.ItemA;

public class ItemAFactory implements ItemFactoryOption2{
	public Item createItem(String name) {
        return new ItemA(name);
    }
}
