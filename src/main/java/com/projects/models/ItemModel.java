package com.projects.models;

import java.util.ArrayList;
import java.util.List;

import com.project.entities.Item;

public class ItemModel {
	private static List<Item> items;


	public ItemModel() {
		ItemModel.items = new ArrayList<Item>();
	}

	public static List<Item> findAll() {
		return items;
	}

	public static Item find(String TLD) {
		for (Item item : items) {
			if (item.getTLD().equalsIgnoreCase(TLD)) {
				return item;
			}
		}
		return null;
	}
}
