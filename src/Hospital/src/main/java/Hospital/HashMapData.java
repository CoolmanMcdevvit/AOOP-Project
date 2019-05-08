package Hospital.src.main.java.Hospital;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class HashMapData {

	public  HashMap<Integer, Patient> hashmapdata;
	public HashMap<Integer, Staff> hashmapStaff;

	public HashMapData() {
		hashmapdata = new HashMap<Integer, Patient>();
	}

	public Map<Integer, Patient> getHashMapData(){
		return hashmapdata;
	}


	public void registerPatient(Patient p) {
		p.setPatientID();
		hashmapdata.put(p.getPatientID(), p);
	}

	public boolean IspIDValid(int ID) {
        return hashmapdata.containsKey(ID);
	}

	public boolean IsStringIDValid(String ID){
		try{
			return hashmapdata.containsKey(Integer.parseInt(ID));
		}
		catch(Exception e){
			return false;
		}
	}



	public Patient SearchpID(int ID) {

		if(IspIDValid(ID)) {
		System.out.println(hashmapdata.get(ID));
			return hashmapdata.get(ID);
		} else {
			System.out.println("There is no patient with that ID");
			return null;
		}
	}

	public Object[][] SearchPID(int ID) {


		Object[][] output = new String[1][10];
		Patient pt = hashmapdata.get(ID);

		output[0][0] = pt.getFirstname();
		output[0][1] = pt.getLastname();
		output[0][2] = pt.getAddress();
		output[0][3] = pt.getBirthday();
		output[0][4] = String.valueOf(pt.getPatientID());
		output[0][5] = pt.getTribe();
		output[0][6] = pt.getPhonenumberString();
		output[0][7] = pt.getAlivestatus();
		output[0][8] = pt.getDepartment();
		output[0][9] = String.valueOf(pt.getBednumber());
		System.out.println(output[0][0]);
		return output;
	}




	public Object [][] SearchPFirstName(String firstNameToCompare) {

		List<Patient> patList = new ArrayList<Patient>();

		Iterator<Patient> iterator = hashmapdata.values().iterator();
		while (iterator.hasNext()) {
			Patient patient = iterator.next();
			if (patient.getFirstname().equals(firstNameToCompare)) {
				patList.add(patient);
			}
		}
		int i = 0;
		Object [][] output = new String[patList.size()][10];
		for(Patient pt: patList) {

			output[i][0] = pt.getFirstname();
			System.out.println(output[i][0]);
			output[i][1] = pt.getLastname();
			output[i][2] = pt.getAddress();
			output[i][3] = pt.getBirthday();
			output[i][4] = String.valueOf(pt.getPatientID());
			output[i][5] = pt.getTribe();
			output[i][6] = pt.getPhonenumberString();
			output[i][7] = pt.getAlivestatus();
			output[i][8] = pt.getDepartment();
			output[i][9] = String.valueOf(pt.getBednumber());

			i = i+1;
		}


		return output;

	}

	public Object[][] SearchPLastName(String lastNameToCompare) {

		List<Patient> patList = new ArrayList<Patient>();

		Iterator<Patient> iterator = hashmapdata.values().iterator();
		while (iterator.hasNext()) {
			Patient patient = iterator.next();
			if (patient.getLastname().equals(lastNameToCompare)) {
				patList.add(patient);
			}
		}
		int i = 0;
		Object[][] output = new String[patList.size()][10];
		for(Patient pt: patList) {

			output[i][0] = pt.getFirstname();
			output[i][1] = pt.getLastname();
			output[i][2] = pt.getAddress();
			output[i][3] = pt.getBirthday();
			output[i][4] = String.valueOf(pt.getPatientID());
			output[i][5] = pt.getTribe();
			output[i][6] = pt.getPhonenumberString();
			output[i][7] = pt.getAlivestatus();
			output[i][8] = pt.getDepartment();
			output[i][9] = String.valueOf(pt.getBednumber());

			i = i+1;
		}


		return output;

	}

	public void printHMD() {
		System.out.print(hashmapdata.values());
	}

	public void changePatient(int patID, String firstname, String lastname, String address, String phonenumber, String bDay, String bMonth,
			String bYear, String tribe, String isAlive) {


		if(IspIDValid(patID)) {

			Patient p = hashmapdata.get(patID);

			if(p.firstname != firstname || p.lastname != lastname ) {
				System.out.print("You cant change the name or birthday");
				return;
			}
			p.setAddress(address);
			p.setPhonenumber(phonenumber);
			p.setTribe(tribe);

		} else{
			System.out.println("This is not a valid ID");
		}
	}

	public void admitPatient(String Dep, String ID, String bed) {
		int id = Integer.valueOf(ID);
		Patient P = SearchpID(id);
		Department D = Department.parseDepartment(Dep);
		if(D==null) { // if the String does not match a department name. Return
			System.out.println("No department with that name") ;
			return;
		}

		if(D.Beds() == true) {
			if(OccupiedBeds(Dep) >= D.NoBeds()){
				System.out.println("No beds available in department: " + D.getName());
				return;
			}
			//System.out.println("Enter the bed number you want to assing");

			if(isBedavailable(bed, D.getName()) == true) {
				P.setDepartment(D.getName());
				P.setBednumber(bed);
			}else return;

		}else if (D.Beds()== false) {
			P.setDepartment(Dep);
		}


	}


	// Checks if a patient is assigned to the same bed at the same department

	public boolean isBedavailable(String t, String D){
		int i = Integer.valueOf(t);
		Iterator<Patient> iterator = hashmapdata.values().iterator();
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

		Iterator<Patient> iterator = hashmapdata.values().iterator();
		while (iterator.hasNext()) {

	        Patient patient = iterator.next();
			System.out.println(patient.getDepartment());
	        if (patient.getDepartment().contentEquals(s)) {
	        	av = av +1;
	        }
	    }
		return av;
	}


	public void DischargePatient(String ID) {
		int id = Integer.valueOf(ID);
		Patient P = SearchpID(id);
		P.setBednumber("0");
		P.setDepartment("None");
	}

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
				System.out.println(rs.getString(3));
				temp.setPatient(rs.getString(2), rs.getString(3), rs.getString(5), rs.getInt(7), rs.getString(4), rs.getString(8), rs.getString(9),"0");
				hashmapdata.put(temp.getPatientID(), temp);
			};
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public void closeData() {
//		clear the database and populate again with the hashmaps
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital_JAVA", "root", "sql");
			Statement stmt = con.createStatement();


			stmt.executeUpdate("DELETE FROM Patient");
			int key = 10001;
			while (hashmapdata.containsKey(key)) {
				stmt.executeUpdate("INSERT INTO Patient (Pati_Name, Pati_Surname, Pati_Bdate, Pati_Address, Pati_Phone,Pati_Tribe, Pati_Dept, Pati_ID)"
						+ "VALUES('" + hashmapdata.get(key).getFirstname() +"','"+ hashmapdata.get(key).getLastname()
						+"','"+ hashmapdata.get(key).getBirthday() + "','" + hashmapdata.get(key).getAddress()
						+"','"+ hashmapdata.get(key).getPhonenumberString() +"','"+ hashmapdata.get(key).getTribe() + "','"+ hashmapdata.get(key).getDepartment() + "','"+ hashmapdata.get(key).getPatientID()+ "')");
				// need to update the database first, hashmapdata.get(loop) to get the features.
				key++;
			};
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}



}
