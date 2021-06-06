package com.retail.services;

import com.retail.beans.Book;
import com.retail.beans.CD;
import com.retail.beans.Cosmetic;
import com.retail.beans.ShoppingBasket;

public interface XYZRetailServices {
	public void buyBook(Book b);
	public void buyCD(CD cd);
	public void buyCosmetic(Cosmetic cosmetic);
	public void DisplayShoppingBasket(ShoppingBasket sb);
	public void DisplayFinalBill(ShoppingBasket sb);
	public void getCDDetailsByID(CD cd);
	public void getBookDetailsByID(Book b);
	public void getCosmeticDetailsByID(Cosmetic cosmetic);
	
	
	

}
