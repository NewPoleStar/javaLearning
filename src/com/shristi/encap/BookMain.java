package com.shristi.encap;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book = new Book();
		book.setTitle("Java");
		book.setPrice(1500);
		book.setBookId(525);
		book.setAvailable(true);
		
		System.out.println(book.getTitle());
		System.out.println(book.getPrice());
		System.out.println(book.getBookId());
		System.out.println(book.isAvailable());
		System.out.print(book);
	}

}
