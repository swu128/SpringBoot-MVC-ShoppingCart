package com.project.entities;

public class Item {

	private String TLD;
	private String SLD;
	private double price;
	private int quantity;

	private double comUpdatedPrice;
	private double netUpdatedPrice;
	private double orgUpdatedPrice;
	private double infoUpdatedPrice;

	private String userDomain;

	public String getUserDomain() {
		return userDomain;
	}

	public void setUserDomain(String userDomain) {
		this.userDomain = userDomain;
	}

	public String getTLD() {
		return TLD;
	}

	public void setTLD(String TLD) {
		this.TLD = TLD;
	}


	public String getSLD() {
		return SLD;
	}


	public void setSLD(String SLD) {
		this.SLD = SLD;
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getComUpdatedPrice() {
		return comUpdatedPrice;
	}

	public void setComUpdatedPrice(double comUpdatedPrice) {
		this.comUpdatedPrice = comUpdatedPrice;
	}

	public double getNetUpdatedPrice() {
		return netUpdatedPrice;
	}

	public void setNetUpdatedPrice(double netUpdatedPrice) {
		this.netUpdatedPrice = netUpdatedPrice;
	}

	public double getOrgUpdatedPrice() {
		return orgUpdatedPrice;
	}

	public void setOrgUpdatedPrice(double orgUpdatedPrice) {
		this.orgUpdatedPrice = orgUpdatedPrice;
	}

	public double getInfoUpdatedPrice() {
		return infoUpdatedPrice;
	}

	public void setInfoUpdatedPrice(double infoUpdatedPrice) {
		this.infoUpdatedPrice = infoUpdatedPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


}
