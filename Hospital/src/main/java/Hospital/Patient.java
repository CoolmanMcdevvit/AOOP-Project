package Hospital;
import java.util.Scanner;

public class Patient extends Person {

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
    
	
	public void setAddress(String address) {		
		this.address = address;		
	}
	
	public void setPhonenumber(int phonenumber) {	
		this.phonenumber = phonenumber;	
	}
	
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	
	public void setBirthmonth(int birthmonth) {
		this.birthmonth = birthmonth; 		
	}
	
	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;		
	}
	
	public void setTribe(String tribe) {
		this.tribe = tribe;	
	}
	
	public void setAlivestatus(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	////////////////////////GETTERS FOR VARIABLES//////////////////////////////////////
	
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
