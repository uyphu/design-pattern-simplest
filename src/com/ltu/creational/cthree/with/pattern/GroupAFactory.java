package com.ltu.creational.cthree.with.pattern;

import com.ltu.creational.btwo.none.pattern.Item;
import com.ltu.creational.btwo.none.pattern.ItemA;

class GroupAFactory implements GroupFactory {
    public Item createItem(String name) {
        return new ItemA(name);
    }

    public Item2 createItem2(String name) {
        return new Item2A(name);
    }
}