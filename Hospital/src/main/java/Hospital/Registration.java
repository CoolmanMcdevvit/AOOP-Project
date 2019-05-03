package Hospital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Set;

public class Registration {
	
	
	public static Map<Integer, Patient> hashmapID = new HashMap<Integer, Patient>();
	

	
	
	
	public void registerPatient(Patient p) {

		hashmapID.put(p.getPatientID(), p);
		
	}
	
	
	
	

}
