package Hospital;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Patient extends Person {

	private String address;
    private int phonenumber;
    private String birthday;
    private String isAlive;
    private int patientID;
    private String tribe;
    private static int patientnumber=10000;
    private String department;
    private int bednumber;
  

    
	public String getAlivestatus() {
		return isAlive;
	}
    public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getBednumber() {
		return bednumber;
	}

	public void setBednumber(String bednumber) {
		this.bednumber = Integer.valueOf(bednumber);
	}

	Scanner input = new Scanner(System.in); 
    
    /////////////////////////////TAKES INPUT FROM GUI AS STRINGS AND PUTS VALUES TO THE PATIENTS ATTRIBUTES///////////////////
    public void createPatient(String firstname, String lastname, String address, String phonenumber, String bDay, String bMonth,
			String bYear, String tribe, String isAlive) {
    	
		setFirstname(firstname);
		if(firstname.isEmpty()) {
			return;
		}
		setLastname(lastname);
		setAddress(address);
		setPhonenumber(phonenumber);
		setBirthday(bDay, bMonth, bYear);
		setTribe(tribe);
		setAlivestatus(isAlive);
		
		setDepartment("None");
		//setPatientID();
		//this.patientID = getPatientID();
		
	}
    
    ////////////////////////////////WHEN WE RETURN PATIENT THIS IS WHAT THE OUTPUT SHOULD LOOK LIKE/////////////////
    
	public String toString(){
        return ("\n" + "Firstname:		" + firstname + "\n" +  "Lastname:		" + lastname + "\n" +
        	"Patient ID:		" + patientID +	"\n" +
    		"Address:		" + address + "\n" + "Phonenumber:		" + phonenumber + "\n" +
        	"Birthdaate:		" + birthday + "\n" +
    		"Tribe:			" + tribe + "\n" + "Is alive:		" + isAlive + "\n" +
        	"Department: 		" + department + "\n" + "Bednumber:		" + bednumber + "\n");
    }
	
    
	///////////////////////////SETTERS TO CHANGE THE VARIABLES LATER//////////////////////////////////
    
	
	public void setAddress(String address) {		
		this.address = address;		
	}
	
	public void setPhonenumber(String phonenumber) {
		String phonenumber2;
		phonenumber2 = phonenumber;
			if(phonenumber2.length()==8) {
				this.phonenumber = Integer.valueOf(phonenumber2);
			}else {
				System.out.println("try another phonenumber dibshit...");
				Scanner in = new Scanner(System.in);
				String PN = in.nextLine();
				setPhonenumber(PN);
			}
		
	}
	

	public void setBirthday(String day, String month, String year) {
		 DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		 	int DAY, MON, YEA;
		 	DAY = Integer.valueOf(day);
		 	MON = Integer.valueOf(month);
		 	YEA = Integer.valueOf(year);
		 	format.setLenient(false);

	        String date = String.format("%02d", DAY) + "." + String.format("%02d", MON) + "."  + String.format("%04d", YEA);
	        try {
	            format.parse(date);
	            this.birthday = date;
	        } catch (ParseException e) {
	            System.out.println("Date " + date + " is not valid according to " + /// need to take a better look
	                ((SimpleDateFormat) format).toPattern() + " pattern.");
	        }
	}
	
	
	///////////////////////// This is just for testing ///////////////////////////////
	public void setBday(String bDay) {
		DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        format.setLenient(false);

        String date = bDay;
        try {
            format.parse(date);
            this.birthday = date;
        } catch (ParseException e) {
            System.out.println("Date " + date + " is not valid according to " + /// need to take a better look
                ((SimpleDateFormat) format).toPattern() + " pattern.");
        }
	}
	/////////////////////////////////////////////////////////////////////////////////////
	
	public void setTribe(String tribe) {
		this.tribe = tribe;	
	}
	
	public void setAlivestatus(String isAlive) {
		this.isAlive = isAlive;
	}

	
	////////////////////////GETTERS FOR VARIABLES//////////////////////////////////////
	
	public int getPatientID() {
		return patientID;
	}
	
	public String getBirthday() {
		return birthday;
	}
	
	public String getBirthDAY() {
		return birthday.substring(0,2);
	}
	public String getBirthMONTH() {
		return birthday.substring(3,5);
	}
	public String getBirthYEAR() {
		return birthday.substring(6,10);
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
		return isAlive;
	}
	

	
	public Patient setPatient(String firstname, String lastname, String address, int phonenumber, String birthday, String tribe, boolean isAlive) {
    	Patient p = new Patient();
    	this.setFirstname(firstname);
    	this.setLastname(lastname);
    	this.setAddress(address);
    	this.setPhonenumberB(phonenumber);
    	this.setBday(birthday);
    	this.tribe=tribe;
    	this.isAlive=isAlive;
    	this.setDepartment("None");
    	//this.setPatientID();

    	return p;
	}

	private void setPhonenumberB(int phonenumber) {
		this.phonenumber=phonenumber;
		
	}
	
	
}
