package Hospital;

import java.util.Map;

public class Registration extends HashMapData {
	
	
	public void registerPatient(Patient p, Map<Integer, Patient> hdm) {
		hdm.put(p.getPatientID(), p);	
	}
	
	public void registerStaff(Staff s, Map<Integer, Staff> hdm) {
		hdm.put(s.getStaffID(), s);
	}
	
	
	
}
