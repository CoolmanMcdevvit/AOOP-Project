package m1111;

import java.util.Scanner;


public class Patient {
	Scanner input = new Scanner(System.in);
	
	private String name;
	private String surename;
	private String address;
	private String tribe;
	private int phonenumber;
	private int month;
	private int day;
	private int year;
	private int patientnumber;
	private String alive;
	private String comment;
	private static int numberOfPatients = 0;
	

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

	public String getAddress() {
		return address;
	}

	public void setAddress() {
		System.out.println("Enter adress:");
		System.out.println("   ");
		this.address = input.nextLine();
	}

	public String getTribe() {
		return tribe;
	}

	public void setTribe() {
		int var;
		boolean c = false;
		System.out.println("Which tribe does the patient belong to?");
			System.out.println("   ");
			System.out.println("1 - Nayogo");
			System.out.println("2 - Mahani");
			System.out.println("3 - Jabbosah");
			System.out.println("4 - Naigari");
			System.out.println("5 - Other");
		do{
			var = input.nextInt();
			
			if (var == 1) {
				this.tribe = "Nayogo";
				c = true;
			} else if (var == 2) {
				this.tribe = "Mahani";
				c = true;
			} else if (var == 3) {
				this.tribe = "Jabbosah";
				c = true;
			} else if (var == 4) {
				this.tribe = "Naigari";
				c = true;
			} else if (var == 5) {
				System.out.println("Type in the name of the tribe");
				this.tribe = input.nextLine();
			} else {
				System.out.println("The number you chose is not valid.");
				System.out.println("Please choose again");
			}
		}while(!c);
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber() {
		System.out.println("Enter phonenumber (only 8 digits):");
		System.out.println("   ");
		this.phonenumber = input.nextInt();
	}

	public int getMonth() {
		return month;
	}

	public void setMonth() {
		System.out.println("Enter month:");
		System.out.println("   ");
		this.month = input.nextInt();
	}

	public int getDay() {
		return day;
	}

	public void setDay() {
		System.out.println("Enter the date of birth");
		System.out.println("Day of the month:");
		System.out.println("   ");
		this.day = input.nextInt();
	}

	public int getYear() {
		return year;
	}

	public void setYear() {
		System.out.println("Enter year:");
		System.out.println("   ");
		this.year = input.nextInt();
	}

	public String isAlive() {
		return alive;
	}

	public void setAlive() {
		int var;
		boolean c = false;
		System.out.println("Is the patient alive?");
		System.out.println("   ");
		System.out.println("1 - Yes");
		System.out.println("2 - No");
		
		do {
			var = input.nextInt();
			if (var == 1) {
			this.alive = "Yes";
			c = true;
		} else if (var == 2) {
			this.alive = "No";
			c = true;
		} else {
			System.out.println("The number you chose is not valid. Please choose either 1 or 2");
			}	
		}while(!c);			
	}
	
	public String getComment() {
		return comment;
	}

	public void setComment() {
		Scanner input = new Scanner(System.in);
		System.out.println("Any comment about the patients condition?");
		System.out.println("   ");
		this.comment = input.nextLine();
	}
	
	
	public int getPatientnumber() {
		return patientnumber;
	}

	public void setPatientnumber() {
		numberOfPatients = numberOfPatients + 1;
		this.patientnumber = numberOfPatients;
	}

	
	public String toStringForPatientNumber() {
		return Integer.toString(day)+Integer.toString(month)+Integer.toString(year);
	}

	
	
	@Override
	public String toString() {
		return "Patient information:" + "\n" + "                    Name = " + name + "\n" + "                    Surename = " + surename + "\n"
				+ "                    Address = " + address + "\n" + "                    Tribe = " + tribe + "\n" + "                    Phonenumber = " + phonenumber + "\n"
				+ "                    Date of Birth = " + day + " / " +  month + " / " + year
				+ "\n" + "                    Patientnumber = " + patientnumber + "\n" + "                    Alive = " + alive + "\n" + "                    Comment = " + comment;
	}

	public void registerPatient() {
		
		Patient p = new Patient();
		p.setAlive();
		p.setName();
		p.setSurename();
		p.setAddress();
		p.setTribe();
		p.setPhonenumber();		
		p.setComment();		
		p.setDay();
		p.setMonth();
		p.setYear();		
		p.setPatientnumber();	
		p.toString();
	}
	
}