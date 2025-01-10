package com.evolvus.setterinjection;

public class Library {
  
	private Book book;
	
	public void setBook(Book book)
	{
		this.book=book;
	}
	
	
	public void library()
	{
		System.out.println("Library is open now");
		book.read();
	}
}
