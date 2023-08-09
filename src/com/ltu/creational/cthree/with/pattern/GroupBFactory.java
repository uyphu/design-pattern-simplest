package com.ltu.creational.cthree.with.pattern;

import com.ltu.creational.btwo.none.pattern.Item;
import com.ltu.creational.btwo.none.pattern.ItemB;

class GroupBFactory implements GroupFactory {
    public Item createItem(String name) {
        return new ItemB(name);
    }

    public Item2 createItem2(String name) {
        return new Item2B(name);
    }
}