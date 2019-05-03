package Hospital;
import java.util.Scanner;

public class Patient {

	private String firstname;
	private String lastname;
	private String address;
    private int phonenumber;
    private int birthday;
    private int birthmonth;
    private int birthyear;
    private String tribe;
    private boolean isAlive;
    private int patientID;
    
    private static int patientnumber=10000;
    
    Scanner input = new Scanner(System.in); 
    

    
    
    /////////////////////////////TAKES INPUT FROM GUI AS STRINGS AND PUTS VALUES TO THE PATIENTS ATTRIBUTES///////////////////
    public void createPatient(String firstname, String lastname, String address, String phonenumber, String birthday, String birthmonth,
			String birthyear, String tribe, String isAlive) {
	
    	
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.phonenumber = Integer.valueOf(phonenumber);
		this.birthday = Integer.valueOf(birthday);
		this.birthmonth = Integer.valueOf(birthmonth);
		this.birthyear = Integer.valueOf(birthyear);
		this.tribe = tribe;
		if (isAlive == "Yes") {
			this.isAlive = true;
		} else{
			this.isAlive = false;
		}
		setPatientID();
		this.patientID = getPatientID();
	}
    
    ////////////////////////////////WHEN WE RETURN PATIENT THIS IS WHAT THE OUTPUT SHOULD LOOK LIKE/////////////////
    
	public String toString(){
        return ("\n" + "Firstname:		" + firstname + "\n" +  "Lastname:		" + lastname + "\n" +
        	"Patient ID:		" + patientID +	"\n" +
    		"Address:		" + address + "\n" + "Phonenumber:		" + phonenumber + "\n" +
        	"Birthdaate:		" + birthday +"."+birthmonth+"."+birthyear+ "\n" +
    		"Tribe:			" + tribe + "\n" + "Is alive:		" + isAlive + "\n");
    }
	
    
	///////////////////////////SETTERS TO CHANGE THE VARIABLES LATER//////////////////////////////////
    
	public void setFirstname(String firstname) {
		System.out.println("Put in the lastname");
		this.firstname = input.nextLine();		
	}
	
	public void setLastname(String lastname) {
		System.out.println("Put in the lastname");
		this.lastname = input.nextLine();	
	}
	
	public void setAddress(String address) {
		System.out.println("Put in the Address");
		this.address = input.nextLine();		
	}
	
	public void setPhonenumber(int phonenumber) {
		System.out.println("Put in the phonenumber"); 
		this.phonenumber = input.nextInt();	
	}
	
	public void setBirthday(int birthday) {
		System.out.println("Put in the birthday");
		this.birthday=input.nextInt();	
	}
	
	public void setBirthmonth(int birthmonth) {
		System.out.println("Put in the birthmonth");
		this.birthmonth=input.nextInt();		
	}
	
	public void setBirthyear(int birthyear) {
		System.out.println("Put in the birthyear");
		this.birthyear=input.nextInt();		
	}
	
	public void setTribe(String tribe) {
		System.out.println("Put in the Tribe");
		Scanner input = new Scanner(System.in);
		this.tribe = input.nextLine();		
	}
	
	public void setAlivestatus(boolean isAlive) {
		System.out.println("Put in the Alivestatus");
		System.out.println("1 - Alive");
		System.out.println("2 - ead");
		
		while (true) {
			int i = input.nextInt();
			if (i==1) {
			this.isAlive = true;
			break;
		} else if (i ==2) {
			this.isAlive = false;
			break;
		}else {
			System.out.println("The number you chose is not valid please try again");
		}
		} 	
	}
	
	////////////////////////GETTERS FOR VARIABLES//////////////////////////////////////
	
	public String getFirstname() {
		return firstname;		
	}
	
	public String getLastname() {
		return lastname;		
	}
	
	public int getPatientID() {
		return patientID;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getTribe() {
		return tribe;
	}
	
	/////////////////CODE TO GIVE EACH PATIENT A UNIQUE ID///////////////////////////////////////////
	
	public void setPatientID() {
		patientnumber = patientnumber+1;
		this.patientID = patientnumber;
	}
	//////////////CODE TO TAKE INPUT FROM GUI ON STRING FORMAT AND CONVERT TO INTEGERS////////////////////////
	public String getPhonenumberString() {
		return Integer.toString(phonenumber);
	}
	
	public String getAlivestatusString() {
		return Boolean.toString(isAlive);
	}
	
	public String getBirthdayString() {
		return Integer.toString(birthday);
	}
	public String getbirthmonthString() {
		return Integer.toString(birthmonth);
	}
	public String getBirthyearString() {
		return Integer.toString(birthyear);
	}
	
	
	
	
	
}
