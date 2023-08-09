package com.ltu.creational.btwo.with.pattern;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import com.ltu.creational.btwo.none.pattern.Item;

public class ItemFactoryOption1 {
	private Map<String, Supplier<Item>> itemSuppliers = new HashMap<>();

	public void registerItem(String itemType, Supplier<Item> itemSupplier) {
		itemSuppliers.put(itemType, itemSupplier);
	}

	public Item create(String itemType, String name) {
		Supplier<Item> itemSupplier = itemSuppliers.get(itemType);
		if (itemSupplier != null) {
			return itemSupplier.get();
		} else {
			throw new IllegalArgumentException("Invalid item type: " + itemType);
		}
	}
}
