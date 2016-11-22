package model;

public class Author extends Person {
	private int age;

	public Author() {
		super();
	}

	public Author(int age) {
		super();
		this.age = age;
	}

	public Author(String fisrtName, String lastName, String surname) {
		super(fisrtName, lastName, surname);
	}

	public Author(String fisrtName, String lastName, String surname, int age) {
		super(fisrtName, lastName, surname);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
