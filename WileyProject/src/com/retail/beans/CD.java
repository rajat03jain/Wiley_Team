package com.retail.beans;

public class CD {
	private String name;
	private int id;
	private int price;
	public CD(int id,String name, int price) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CD [name=" + name + ", id=" + id + ", price=" + price + "]";
	}
	

}
