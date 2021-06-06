package com.retail.database;

import java.util.HashMap;

import com.retail.beans.Book;


public class BookList {
private static HashMap<Integer,Book> books=new HashMap<Integer, Book>();
	
	static {
		books.put(101, new Book(101,"Don Quixote",1000));
		books.put(102, new Book(102,"Beloved",800));
		books.put(103, new Book(103,"Mrs. Dalloway",900));
		books.put(104, new Book(104,"Jane Eyre",500));
		books.put(105, new Book(105,"Invisible Man",1200));
		
		
	}

	public static HashMap<Integer, Book> getBooks() {
		return books;
	}

	public static void setBooks(HashMap<Integer, Book> books) {
		BookList.books = books;
	}


}
