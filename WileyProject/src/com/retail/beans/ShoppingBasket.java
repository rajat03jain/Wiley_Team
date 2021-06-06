package com.retail.beans;

public class ShoppingBasket {
	private int nBooks,nCD,nCosmetics;
	private double totalPrice;
	public int getnBooks() {
		return nBooks;
	}
	public ShoppingBasket() {
		this.nBooks=0;
		this.nCD=0;
		this.nCosmetics=0;
		this.totalPrice=0.0;
	}
	public void setnBooks(int nBooks) {
		this.nBooks = nBooks;
	}
	public int getnCD() {
		return nCD;
	}
	public void setnCD(int nCD) {
		this.nCD = nCD;
	}
	public int getnCosmetics() {
		return nCosmetics;
	}
	public void setnCosmetics(int nCosmetics) {
		this.nCosmetics = nCosmetics;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public void addBook(Book b,int nBooks) {
		this.totalPrice=nBooks*b.getPrice();
		this.nBooks+=nBooks;
		
	}
	
	
	

}
