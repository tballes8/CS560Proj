package person.beans;

public class Teacher extends Person {
	private String designation;
	private String firstname;
	private String lastname;
	
	public String getDesignation() {
	  return designation;
	}
	
	public void setDesignation(String designation) {
	  this.designation = designation;
	}
	
	public String getFirstName() {
		return firstname;
	}
	
	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastName() {
		return lastname;
	}
	
	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
	
}
