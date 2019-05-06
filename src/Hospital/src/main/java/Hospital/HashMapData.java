package Hospital.src.main.java.Hospital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class HashMapData {
	
	public  HashMap<Integer, Patient> hashmapdata;
//	protected Map<Integer, Staff> hashmapStaff = new HashMap<Integer, Staff>();

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



	public Patient SearchpID(int ID) {

		if(IspIDValid(ID)) {
		System.out.println(hashmapdata.get(ID));
			return hashmapdata.get(ID);
		} else {
			System.out.println("There is no patient with that ID");
			return null;
		}
	}


public List<Patient> SearchPFirstName(String firstNameToCompare) {

		List<Patient> patList = new ArrayList<Patient>();

		Iterator<Patient> iterator = hashmapdata.values().iterator();
		while (iterator.hasNext()) {
	        Patient patient = iterator.next();
	        if (patient.getFirstname().equals(firstNameToCompare)) {
	        	System.out.println(hashmapdata.get(patient.getPatientID()));
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

	Iterator<Patient> iterator = hashmapdata.values().iterator();
	while (iterator.hasNext()) {
        Patient patient = iterator.next();
        if (patient.getLastname().equals(lastNameToCompare)) {
        	System.out.println(hashmapdata.get(patient.getPatientID()));
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
			String i = "17";
			if(isBedavailable(i, D.getName()) == true) {
				P.setDepartment(D.getName());
				P.setBednumber(i);
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
	

}
