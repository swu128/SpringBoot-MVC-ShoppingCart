package com.project.entities;

public class CartItem {
	private Item item;
	private int quantity;
	private String userDomain;

	public String getUserDomain() {
		return userDomain;
	}

	public void setUserDomain(String userDomain) {
		this.userDomain = userDomain;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public CartItem() {
	}

	public CartItem(Item item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}
}
