package Hospital;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class Search {
	
	
	public boolean IspIDValid(int ID) {
		if (Registration.hashmapID.containsKey(ID)){
			return true;
		} else {
			return false;
		}
	}
	
	public Patient SearchpID(int ID) {
		
		
		
		if(IspIDValid(ID)) {
			System.out.println(Registration.hashmapID.get(ID));
			return Registration.hashmapID.get(ID);
		} else {
			System.out.println("There is no patient with that ID");
			return null;
		}
	}
	
	
	
	public List<Patient> SearchFirstName(String firstNameToCompare) {
		
		List<Patient> patList = new ArrayList<Patient>();
		
		Iterator<Patient> iterator = Registration.hashmapID.values().iterator();
		while (iterator.hasNext()) {
	        Patient patient = iterator.next();
	        if (patient.getFirstname().equals(firstNameToCompare)) {  
	        	System.out.println(Registration.hashmapID.get(patient.getPatientID()));
	        	patList.add(patient);
	        }
	    }
		
		if (patList.isEmpty()) {
			System.out.println("There is no one with that first name");
			return null;
		} else {
			return patList;
		}
	}
	
	public List<Patient> SearchLastName(String lastNameToCompare) {
		
		List<Patient> patList = new ArrayList<Patient>();
		
		Iterator<Patient> iterator = Registration.hashmapID.values().iterator();
		while (iterator.hasNext()) {
	        Patient patient = iterator.next();
	        if (patient.getLastname().equals(lastNameToCompare)) {
	        	System.out.println(Registration.hashmapID.get(patient.getPatientID()));
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
		
}

		
