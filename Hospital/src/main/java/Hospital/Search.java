package Hospital;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class Search extends HashMapData {
	
	
	public boolean IspIDValid(int ID, Map<Integer, Patient> hmp) {
		if (hmp.containsKey(ID)){
			return true;
		} else {
			return false;
		}
	}
	
	public Patient SearchpID(int ID, Map<Integer, Patient> hmp) {
		
		if(IspIDValid(ID, hmp)) {
		System.out.println(hmp .get(ID));
			return hmp.get(ID);
		} else {
			System.out.println("There is no patient with that ID");
			return null;
		}
	}
	
	
	public List<Patient> SearchFirstName(String firstNameToCompare, Map<Integer, Patient> hmp) {
		
		List<Patient> patList = new ArrayList<Patient>();
		
		Iterator<Patient> iterator = hmp.values().iterator();
		while (iterator.hasNext()) {
	        Patient patient = iterator.next();
	        if (patient.getFirstname().equals(firstNameToCompare)) {  
	        	System.out.println(hmp.get(patient.getPatientID()));
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
	
	
	public List<Patient> SearchLastName(String lastNameToCompare, Map<Integer, Patient> hmp) {
		
		List<Patient> patList = new ArrayList<Patient>();
		
		Iterator<Patient> iterator = hmp.values().iterator();
		while (iterator.hasNext()) {
	        Patient patient = iterator.next();
	        if (patient.getLastname().equals(lastNameToCompare)) {
	        	System.out.println(hmp.get(patient.getPatientID()));
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

		
