package model;

public class Book {
	private String ISBN;
	private float price;
	private Author author;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String iSBN, float price, Author author) {
		super();
		ISBN = iSBN;
		this.price = price;
		this.author = author;
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
