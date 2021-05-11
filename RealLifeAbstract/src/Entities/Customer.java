package Entities;
import java.time.LocalDate;

import Abstract.Entity;

public class Customer implements Entity {
	int id;
	String FirstName;
	String LastName;
	LocalDate DateofBirth;
	String NationalityId;
	public Customer(int id, String firstName, String lastName, LocalDate dateofBirth, String nationalityId) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		DateofBirth = dateofBirth;
		NationalityId = nationalityId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public LocalDate getDateofBirth() {
		return DateofBirth;
	}
	public void setDateofBirth(LocalDate dateofBirth) {
		DateofBirth = dateofBirth;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}

}
