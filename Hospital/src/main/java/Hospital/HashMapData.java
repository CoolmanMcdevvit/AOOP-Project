package Hospital;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class HashMapData {
	
	private Map<Integer, Patient> HashMapData;
//	protected Map<Integer, Staff> hashmapStaff = new HashMap<Integer, Staff>();
	
	public HashMapData() {
		HashMapData = new HashMap<Integer, Patient>();	
	}
	
	public void registerPatient(Patient p) {
		for (Patient patient: HashMapData.values()) {
			if(p.firstname.isEmpty() || p.getBirthday() == null || p.getAddress()== null) {
				System.out.println("Invalid inptus.... check again");
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
			Patient Pa = new Patient();
			Pa.setFirstname("Nobody_has_that_name");
			patList.add(Pa);
			return patList;
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

	public void printHMD() {
		System.out.print(HashMapData.values());
	}
	
	public void changePatient(int patID, String firstname, String lastname, String address, String phonenumber, String bDay, String bMonth,
			String bYear, String tribe, String isAlive) {
		
		
		if(IspIDValid(patID)) {
			
			Patient p = HashMapData.get(patID);
			
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
	
	public void admitPatient(String Dep, String ID, String Bed) {
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
			if(isBedavailable(Bed, D.getName()) == true) {
				P.setDepartment(D.getName());
				P.setBednumber(Bed);
			}else return;
			
		}else if (D.Beds()== false) {
			P.setDepartment(Dep);
		}
		
		
	}
	
	
	// Checks if a patient is assigned to the same bed at the same department
	
	public boolean isBedavailable(String t, String D){
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
		P.setBednumber("0");
		P.setDepartment("None");
	}

//	public List<Patient> getAllPatientsFromDepartment(String DepName) {
//		Department D = Department.parseDepartment(DepName);
//		List<Patient> patList = new ArrayList<Patient>();
//		Iterator<Patient> iterator = HashMapData.values().iterator();
//		while (iterator.hasNext()) {
//	        Patient patient = iterator.next();
//	        if ( patient.getDepartment().equals(D)) {
//	        	patList.add(patient);
//	        }
//	    }
//		
//		return patList;
//	}
	
	public ArrayList<String> getAllPatientsinDepartments(){

		
		String[] deps = {"Emergency","Medical", "Surgery"};
		int t = 0;
		for (String s: deps) {
			Iterator<Patient> iterator = HashMapData.values().iterator();
			int temp = 0;
			while(iterator.hasNext()) {
				Patient patient = iterator.next();
				if(patient.getDepartment().equals(s)) {
					temp = temp+1;
				}
			}
			deps[t]=deps[t]+ " " + String.valueOf(temp);
			t+=1;
			
		}
		ArrayList<String> Gegg = new ArrayList<String>(Arrays.asList(deps));

		return Gegg;
		
	}


}
