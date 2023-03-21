package entities;

import java.time.LocalDate;

public class Contact {

	private LocalDate dateOfBirth;
	private String name;
	private int age;
	
	public Contact() {
		
	}

	public Contact(LocalDate dateOfBirth, String name, int age) {
		this.dateOfBirth = dateOfBirth;
		this.name = name;
		this.age = age;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void getDados() {

	}
}
