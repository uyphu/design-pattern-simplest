package com.ltu.creational.btwo.none.pattern;

// ItemFactory class with create method for creating items
class ItemFactory {
	public Item create(String itemType, String name) {
		if ("ItemA".equalsIgnoreCase(itemType)) {
			return new ItemA(name);
		} else if ("ItemB".equalsIgnoreCase(itemType)) {
			return new ItemB(name);
		} else {
			throw new IllegalArgumentException("Invalid item type: " + itemType);
		}
	}
}

//class ItemFactory {
//    private Map<String, Supplier<Item>> itemSuppliers = new HashMap<>();
//
//    public void registerItem(String itemType, Supplier<Item> itemSupplier) {
//        itemSuppliers.put(itemType, itemSupplier);
//    }
//
//    public Item create(String itemType, String name) {
//        Supplier<Item> itemSupplier = itemSuppliers.get(itemType);
//        if (itemSupplier != null) {
//            return itemSupplier.get();
//        } else {
//            throw new IllegalArgumentException("Invalid item type: " + itemType);
//        }
//    }
//}