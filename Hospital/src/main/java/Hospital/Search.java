package Hospital;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Search {
	
	boolean validpID;
	Collection<Patient> patients;
	
	public void IspIDValid(int ID) {
		if (Registration.hashmapID.containsKey(ID)){
			this.validpID = true;
		} else {
			this.validpID = false;
		}
	}
	
	public Patient SearchpID(int ID) {
		
		IspIDValid(ID);
		
		if(validpID) {
			return Registration.hashmapID.get(ID);
		} else {
			System.out.println("There is no patient with that ID");
			return null;
		}
	}
	
	
	
	public Patient SearchFirstName(String firstNameToCompare) {
		
		Iterator<Patient> iterator = patients.iterator();
		while (iterator.hasNext()) {
	        Patient patient = iterator.next();
	        if (patient.getFirstname().equals(firstNameToCompare)) {
	            return patient;
	        }
	    	}
		System.out.println("There is no one with that first name");
		return null;
		}

	
	public Patient SearchLastName(String lastNameToCompare) {
			
		Iterator<Patient> iterator = patients.iterator();
		while (iterator.hasNext()) {
	        Patient patient = iterator.next();
	        if (patient.getLastname().equals(lastNameToCompare)) {
	            return patient;
	        }
	    	}return null;	    	
		}
		
}

		
