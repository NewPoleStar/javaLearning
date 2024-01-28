package com.objects.basics;

public class BookMain {

	public static void main(String[] args) {

		Book book = new Book(null, null, 0, null);
		book.title = "Java First";
		book.author = "Kathy Sierra";
		book.price = 499;

		Book book2 = new Book(null, null, 0, null);
		book2.title = "Full Stack Developer";
		book2.author = "Bert Bates";
		book2.price = 501;

		book.getDetails();
		book2.getDetails();
	}

}
