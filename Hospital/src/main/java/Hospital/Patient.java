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
    
    
    
    
    public void Patient(String firstname, String lastname, String address, String phonenumber, String birthday, String birthmonth,
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
    
    
    
	public String toString(){
    	System.out.println("We found 1 patient with that ID");
    	System.out.println(" ");
        return ("\n" + "Firstname:		" + firstname + "\n" +  "Lastname:		" + lastname + "\n" +
        	"Patient ID:		" + patientID +	"\n" +
    		"Address:		" + address + "\n" + "Phonenumber:		" + phonenumber + "\n" +
        	"Birthdaate:		" + birthday +"."+birthmonth+"."+birthyear+ "\n" +
    		"Tribe:			" + tribe + "\n" + "Is alive:		" + isAlive + "\n");
    }
	
	public String setFirstname(String firstname) {
	
		return firstname;
		
		
	}
	public void setLastname(String lastname) {
		System.out.println("Put in the lastname");
		this.lastname = input.nextLine();
		
	}
	public void setAddress(String address) {
		System.out.println("Put in the Adress");
		this.address= input.nextLine();
		
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
		this.isAlive = input.hasNextBoolean();
		
	}
	public String getFirstname() {
		return firstname;		
	}
	
	public String getLastname() {
		return lastname;		
	}
	
	public void setPatientID() {
		patientnumber = patientnumber+1;
		this.patientID = patientnumber;
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
