package model;

import java.util.Date;

public class Book {
	private String ISBN;
	private float price;
	private Author author;
	private Date publishDate;

	public Book() {
		super();
	}
	
	public Book(String iSBN, float price, Author author, Date publishDate) {
		super();
		ISBN = iSBN;
		this.price = price;
		this.author = author;
		this.publishDate = publishDate;
	}

	public Book(String iSBN, float price, Author author) {
		super();
		ISBN = iSBN;
		this.price = price;
		this.author = author;
	}
	
	public Book(String iSBN, float price, String fisrtName, String lastName, String surname, int age) {
		super();
		ISBN = iSBN;
		this.price = price;
		this.author = new Author(fisrtName, lastName, surname, age);
	}	

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

}
