package Entities;
import Abstract.Entity;

public class Customer implements Entity{
	int id;
	String firstName;
	String lastName;
	Long nationalityId;
	int birthYear;
	
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear=birthYear;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(long i) {
		this.nationalityId = i;
	}

}
