package com.ltu.creational.cthree.with.pattern;

import com.ltu.creational.btwo.none.pattern.Item;

public interface GroupFactory {
	Item createItem(String name);
	Item2 createItem2(String name);
}
