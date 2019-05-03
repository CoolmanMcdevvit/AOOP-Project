package Hospital;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Iterator;


public class Search extends HashMapData {
	
	//////////////////////////IS ID VALID SEARCH//////////////////////////////////////////
	
	public boolean IspIDValid(int ID, Map<Integer, Patient> hmp) {
		if (hmp.containsKey(ID)){
			return true;
		} else {
			return false;
		}
	}
	
	public boolean IssIDValid(int ID, Map<Integer, Staff> hmp) {
		if (hmp.containsKey(ID)){
			return true;
		} else {
			return false;
		}
	}
	
	
	/////////////////////////ID SEARCH//////////////////////////////////////////
	
	public Patient SearchpID(int ID, Map<Integer, Patient> hmp) {
		
		if(IspIDValid(ID, hmp)) {
		System.out.println(hmp .get(ID));
			return hmp.get(ID);
		} else {
			System.out.println("There is no patient with that ID");
			return null;
		}
	}
	
	public Staff SearchsID(int ID, Map<Integer, Staff> hmp) {
			
			if(IssIDValid(ID, hmp)) {
			System.out.println(hmp .get(ID));
				return hmp.get(ID);
			} else {
				System.out.println("There is no staff with that ID");
				return null;
			}
		}
	
	//////////////////////////FIRST NAME SEARCH//////////////////////////////////////////
	
	public List<Patient> SearchPFirstName(String firstNameToCompare, Map<Integer, Patient> hmp) {
		
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
			System.out.println("There is no patient registered with that first name");
			return null;
		} else {
			return patList;
		}
	}
	
	
	public List<Staff> SearchSFirstName(String firstNameToCompare, Map<Integer, Staff> hmp) {
			
			List<Staff> staffList = new ArrayList<Staff>();
			
			Iterator<Staff> iterator = hmp.values().iterator();
			while (iterator.hasNext()) {
		        Staff staff = iterator.next();
		        if (staff.getFirstname().equals(firstNameToCompare)) {  
		        	System.out.println(hmp.get(staff.getStaffID()));
		        	staffList.add(staff);
		        }
		    }
			
			if (staffList.isEmpty()) {
				System.out.println("There is no staff registered with that first name");
				return null;
			} else {
				return staffList;
			}
		}
	
	
	//////////////////////////LAST NAME SEARCH//////////////////////////////////////////
	
	public List<Patient> SearchPLastName(String lastNameToCompare, Map<Integer, Patient> hmp) {
		
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
	
	public List<Staff> SearchSLastName(String lastNameToCompare, Map<Integer, Staff> hmp) {
			
		List<Staff> staffList = new ArrayList<Staff>();
		
		Iterator<Staff> iterator = hmp.values().iterator();
		while (iterator.hasNext()) {
	        Staff staff = iterator.next();
	        if (staff.getLastname().equals(lastNameToCompare)) {
	        	System.out.println(hmp.get(staff.getStaffID()));
	        	staffList.add(staff);
	        }
	    }
		
		if (staffList.isEmpty()) {
			System.out.println("There is no staff registered with that last name");
			return staffList;
		} else {
			return staffList;
		}	
	}
	
		
}

		
