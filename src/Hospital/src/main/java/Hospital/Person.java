package Hospital.src.main.java.Hospital;

public class Person {
	
	protected String firstname;
	protected String lastname;
	protected String department;
	
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;		
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setDepartment(String department){this.department = department;}
	
	public String getFirstname() {return firstname;}
	
	public String getLastname() {
		return lastname;		
	}

	public String getDepartment(){return department;}
	
}
