package model;

public class Person {
	String fisrtName;
	String lastName;
	String surname;
	public String getFisrtName() {
		return fisrtName;
	}
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Person() {
		super();
	}

	public Person(String fisrtName, String lastName, String surname) {
		super();
		this.fisrtName = fisrtName;
		this.lastName = lastName;
		this.surname = surname;
	}
	
}
