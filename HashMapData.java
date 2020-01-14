package Hospital;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.sql.*;


public class HashMapData {
	
	private Map<Integer, Patient> HashMapData;
	
	
	
	public Map<Integer, Patient> gethashmapPatient() {
	
		return HashMapData;
	}
	
	public Collection<Patient> getthings(){
		return HashMapData.values();
	}
	public HashMapData() {
		HashMapData = new HashMap<Integer, Patient>();	
	}
	
	public void registerPatient(Patient p) {
		for (Patient patient: HashMapData.values()) {
			if(p.firstname.isEmpty() || p.getBirthday() == null || p.getAddress()== null) {
				System.out.println("Invalid inptus.... check again");
				return;
			}
			if(patient.getFirstname().equals(p.firstname) && patient.getLastname().equals(p.lastname) && patient.getBirthday().equals(p.getBirthday())){
				System.out.println("Patient with same firstname, lastname and birthday is already in the system:");
				return;
			}
		}
		p.setPatientID();
		HashMapData.put(p.getPatientID(), p);	
	}
	
	public boolean IspIDValid(int ID) {
		if (HashMapData.containsKey(ID)){
			return true;
		} else {
			return false;
		}
	}
	
	
	
	public Patient SearchpID(int ID) {
		
		if(IspIDValid(ID)) {
		System.out.println(HashMapData.get(ID));
			return HashMapData.get(ID);
		} else {
			System.out.println("There is no patient with that ID");
			return null;
		}
	}
	
	
	public List<Patient> SearchPFirstName(String firstNameToCompare) {
		
		List<Patient> patList = new ArrayList<Patient>();
		
		Iterator<Patient> iterator = HashMapData.values().iterator();
		while (iterator.hasNext()) {
	        Patient patient = iterator.next();
	        if (patient.getFirstname().equals(firstNameToCompare)) {  
	        	System.out.println(HashMapData.get(patient.getPatientID()));
	        	patList.add(patient);
	        }
	    }
		
		if (patList.isEmpty()) {
			System.out.println("There is no patient registered with that first name");
			return null;
		} else {
			return patList;
		}
	}
	
	public List<Patient> SearchPLastName(String lastNameToCompare) {
	
		List<Patient> patList = new ArrayList<Patient>();
	
		Iterator<Patient> iterator = HashMapData.values().iterator();
		while (iterator.hasNext()) {
	        Patient patient = iterator.next();
	        if (patient.getLastname().equals(lastNameToCompare)) {
	        	System.out.println(HashMapData.get(patient.getPatientID()));
	        	patList.add(patient);
        }
    }
	
		if (patList.isEmpty()) {
			System.out.println("There is no one with that last name");
			return patList;
		} else {
			return patList;
			}
	
	}

	public String printHMD() {
		System.out.print(HashMapData.values());
		return HashMapData.values().toString();
	}
	
	public void changePatient(int patID, String firstname, String lastname, String address, String phonenumber, String bDay, String bMonth,
			String bYear, String tribe, String isAlive) {
		
		
		if(IspIDValid(patID)) {
			
			Patient p = HashMapData.get(patID);
			
			if(p.getFirstname().equals(firstname) || p.getLastname().equals(lastname) ) {
				System.out.print("You cant change the name or birthday");
				p.setAddress(address);
				p.setPhonenumber(phonenumber);
				//p.setBirthday(bDay, bMonth, bYear);
				p.setTribe(tribe);
			}
			
			
		} else{
			System.out.println("This is not a valid ID");
		}
	}
	
	public void admitPatient(String Dep, String ID) {
		int id = Integer.valueOf(ID);
		Patient P = SearchpID(id);
		Department D = Department.parseDepartment(Dep);
		if(D==null) { // if the String does not match a department name. Return
			System.out.println("No department with that name");
			return;
		}
		
		if(D.Beds() == true) {
			if(OccupiedBeds(Dep) >= D.NoBeds()){
				System.out.println("No beds available in department: " + D.getName());
				return;
			}
			//System.out.println("Enter the bed number you want to assing");
			int i = 17;
			if(isBedavailable(i, D.getName()) == true) {
				P.setDepartment(D.getName());
				P.setBednumber(i);
			}else return;
			
		}else if (D.Beds()== false) {
			P.setDepartment(Dep);
		}
		
//		else if(OccupiedBeds(Dep) >= D.NoBeds() && D.Beds()==true) { // check if beds are available
//			System.out.println("No beds available in department: " + D.getName());
//			return;
//		}else {
//			System.out.println("Which bed would you like you assign the patient? ");
//			int i = 19;
//			if(isBedavailable(i, Dep) == false || i> D.NoBeds() || i<0) {
//				System.out.print("This bed is occupied or selected bed does not exist");
//				return;
//			}
//			P.setBednumber(i);
//			P.setDepartment(Dep);
		
		
		
		
	}
	
	
	// Checks if a patient is assigned to the same bed at the same department
	
	public boolean isBedavailable(int t, String D){
		int i = Integer.valueOf(t);
		Iterator<Patient> iterator = HashMapData.values().iterator();
		while (iterator.hasNext()) {
	        Patient patient = iterator.next();
	        if (patient.getBednumber() == i && patient.getDepartment().equals(D)) {
	        	return false;
	        }
	    }
		return true;
	}
	
	public int OccupiedBeds(String s) {
		int av = 0;
		
		Iterator<Patient> iterator = HashMapData.values().iterator();
		while (iterator.hasNext()) {
	        Patient patient = iterator.next();
	        if (patient.getDepartment().contentEquals(s)) {
	        	av = av +1;
	        }
	    }
		return av;
	}
	
	
	public void DischargePatient(String ID) {
		int id = Integer.valueOf(ID);
		Patient P = SearchpID(id);
		P.setBednumber(0);
		P.setDepartment("None");
	}
	
//	public Map<Integer, Staff> gethashmapStaff() {
//	
//		return hashmapStaff;
//	}

	
	
//	public void outputPDF() {
//		https://www.concretepage.com/itext/create-pdf-with-text-list-table-in-java-using-itext
//	}
//	
//
	public void initializeData() {
//		HashMapData
//		populates the hashmaps with data from the sql database
		try{
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital_JAVA", "root", "sql");
		    Statement stmt = con.createStatement();
		    ResultSet rs = stmt.executeQuery("SELECT * FROM Patient");
		    while (rs.next())
		            {
		            	Patient temp = new Patient();
		            	temp.setPatient(rs.getString(2), rs.getString(3), rs.getString(5), rs.getInt(7), rs.getString(4), rs.getString(8), rs.getBoolean(9),rs.getInt(10));
		            	HashMapData.put(temp.getPatientID(), temp);
		            };
		    con.close();
		}
		catch(Exception e) {
	        System.out.println(e);
		}
	}


	//	
	//}
	//	
	//	
	public void closeData() {
//		clear the database and populate again with the hashmaps
	    try{
	  		Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital_JAVA", "root", "sql");
		    Statement stmt = con.createStatement();
		    
	        
	        stmt.executeUpdate("DELETE FROM Patient");
	        int key = 10001;
		    while (HashMapData.containsKey(key)) {
		    	stmt.executeUpdate("INSERT INTO Patient (Pati_Name, Pati_Surname, Pati_Bdate, Pati_Address, Pati_Phone,Pati_Tribe, Pati_Dept, Pati_ID)" 
	                + "VALUES('" + HashMapData.get(key).getFirstname() +"','"+ HashMapData.get(key).getLastname()
	                +"','"+ HashMapData.get(key).getBirthday() + "','" + HashMapData.get(key).getAddress()
	                +"','"+ HashMapData.get(key).getPhonenumberString() +"','"+ HashMapData.get(key).getTribe() + "','"+ HashMapData.get(key).getDepartment() + "','"+ HashMapData.get(key).getPatientID()+ "')"); 
	                // need to update the database first, HashMapData.get(loop) to get the features.
		    	key++;
	        };
	  		con.close();
	    }
		catch(Exception e) {
	        System.out.println(e);
		}
	    }
}

