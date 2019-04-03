package m1111;

import java.util.Scanner;

public class Staff {
	Scanner input = new Scanner(System.in);
		
	private String name;
	private String surename;
	private String email;
	private String jobRole;
	private String staffNumber;
	private static int numberOfDoctors = 0;
	private static int numberOfNurses = 0;
	private static int numberOfClerks = 0;
	private static int numberOfICTofficers = 0;
	
	
	public String getName() {
		return name;
	}
	public void setName() {
		System.out.println("Enter first name:");
		System.out.println("   ");
		this.name = input.nextLine();
	}
	public String getSurename() {
		return surename;
	}
	public void setSurename() {
		System.out.println("Enter surename:");
		System.out.println("   ");
		this.surename = input.nextLine();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail() {
		//boolean c = true;
		//int i = 1;
	
		this.email = name.substring(0) + surename.substring(0) + "@hospital.com";
		
		//if (email is unique) {
		//	break;
		//} else{ 
		//	do {
		//		this.email = name.substring(0) + String.valueOf(i) + surename.substring(0) + "@hospital.com";
		//		if (email is unique) {
		//			c = false;
		//		} else {
		//			i=i+1;
		//		}
		//} while (c);
		//	
	}

	public String getJobRole() {
		return jobRole;
	}
	public void setJobRole() {
		int innt;
		boolean c = false;
		System.out.println("Enter job role:");
		System.out.println("   ");
		System.out.println("Press 1 for Doctor");
		System.out.println("Press 2 for Nurse");
		System.out.println("Press 3 for Clerk");
		System.out.println("Press 4 for ICT officer");	
		
		do {
			innt = input.nextInt();
			if (innt == 1) {
				this.jobRole = "Doctor";
				c = true;
			} else if (innt == 2) {
				this.jobRole = "Nurse";	
				c = true;
			} else if (innt == 3) {
				this.jobRole = "Clerk";	
				c = true;
			} else if (innt == 4) {
				this.jobRole = "ICT officer";
				c = true;
			} else {
				System.out.println("The number you chose is not valid!");
				System.out.println("Please choose again");
				System.out.println(" ");
				System.out.println("Press 1 for Doctor");
				System.out.println("Press 2 for Nurse");
				System.out.println("Press 3 for Clerk");
				System.out.println("Press 4 for ICT officer");
			}			
		}while (!c);
		
	}

	public String getStaffNumber() {
		return staffNumber;
	}

	public void setStaffNumber() {
		
		if (getJobRole() == "Doctor") {
			numberOfDoctors = numberOfDoctors + 1;
			this.staffNumber = "d" + Integer.toString(numberOfDoctors);
		} else if (getJobRole() == "Nurse") {
			numberOfNurses = numberOfNurses + 1;
			this.staffNumber = "n" + Integer.toString(numberOfNurses);
		} else if (getJobRole() == "Clerk") {
			numberOfClerks = numberOfClerks + 1;
			this.staffNumber = "c" + Integer.toString(numberOfClerks);
		} else if (getJobRole() == "ICT officer") {
			numberOfICTofficers = numberOfICTofficers +1;
			this.staffNumber = "ict" + Integer.toString(numberOfICTofficers);
		} 
	}
	
	@Override
	public String toString() {
		return "Staff information:" + "\n" + "                    Name = " + name + "\n" + "                    Surename = " + surename +
				"\n" + "                    Email = " + email + "\n" +  "                    JobRole=" + jobRole + "\n" + 
				"                    StaffNumber=" + staffNumber;
	}
	
	public static void main(String[] args) {
		Staff s = new Staff();
		
		s.setName();
		s.setSurename();
		s.setJobRole();
		s.setStaffNumber();
		s.setEmail();
		
		System.out.println(s.toString());
		
	}
		
		
	
}
		