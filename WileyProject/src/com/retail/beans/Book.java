package com.retail.beans;

public class Book {
	private String book_name;
	private int price;
	private int id;
	public Book(int id,String book_name, int price) {
		super();
		this.book_name = book_name;
		this.price = price;
		this.id = id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Book [book_name=" + book_name + ", price=" + price + ", id=" + id + "]";
	}
	
	

}
