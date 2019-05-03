package Hospital;

import java.util.HashMap;
import java.util.Map;

public class Registration extends HashMapData {
	
	
	public void registerPatient(Patient p, Map<Integer, Patient> hdm) {
		hdm.put(p.getPatientID(), p);	
	}
	
	
}
