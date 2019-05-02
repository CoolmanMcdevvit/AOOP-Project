package Hospital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Set;

public class Registration {
	
	Scanner input = new Scanner(System.in);
	
	public static Map<Integer, Patient> hashmapID = new HashMap<Integer, Patient>();
	
	//public static ArrayList<Patient> arrayListPatients = new ArrayList<Patient>();

	//public static ArrayList<Patient> arrayListPatients = new ArrayList<Patient>();
	
	
	
	public Registration(Patient p) {

		hashmapID.put(p.getPatientID(), p);
		//arrayListPatients.add(p);
		
	}
	
	
	
	

}
