package com.objects.basics;

public class Book {

	String title;
	String author;
	double price;
	String category;

	public Book(String title, String author, double price, String category) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
	}

	void getDetails() {
		System.out.println("");
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + "$" + price);
	}
	
	void checkBookType() {
		if (price>=500) {
			System.out.println("Book Category/Type: " + "Premium Book");
		} else
			System.out.println("Book Category/Type: " + "Standard Book");
	
	}
}
