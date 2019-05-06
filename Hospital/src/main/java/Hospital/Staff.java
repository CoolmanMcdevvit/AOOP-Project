package Hospital;

public class Staff extends Person{
	
	private String email;
	private int staffID;
	private String jobRole;
	private int phonenumber;
	private String department;
	
	

	private static int staffnumber = 0;
	private static int phoneNumber = 55100000;
	
	
	public void createStaff(String firstname, String lastname, String jobrole, String department) {
	
    	
		this.firstname = firstname;
		this.lastname = lastname;
		this.jobRole = jobrole;
		this.department = department;
		setStaffID();
		setEmail();
		setPhonenumber();
	}
	

	public String toString(){
        return ("\n" + "Firstname:		" + firstname + "\n" +  "Lastname:		" + lastname + "\n" +
        	"Staff ID:		" + staffID +	"\n" +
    		"email:		" + email + "\n" + "Phonenumber:		" + phonenumber + "\n" +
        	 "\n");
    }
	
	public String getEmail() {
		return email;
	}

	public void setEmail() {
		this.email = getFirstname() + "_" + getLastname() + getStaffID() + "@hospital.com";
	}

	public String getJobRole() {
		return jobRole;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	
	public Integer getStaffID() {
		return staffID;
	}
	
	public void setStaffID() {
		staffnumber = staffnumber+1;
		this.staffID = staffnumber;
	}

	public int getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber() {
		phoneNumber = phoneNumber +1;
		this.phonenumber = phoneNumber;
	}
	

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
