package Entities;
import Abstract.Entity;

public class User implements Entity{
	
	int id;
	String fullName;
	String nationalityId;
	String birthYear;
	
	public User(int id, String fullName, String nationalityId, String birthYear) {
		this.id=id;
		this.fullName=fullName;
		this.nationalityId=nationalityId;
		this.birthYear=birthYear;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public String getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

}
