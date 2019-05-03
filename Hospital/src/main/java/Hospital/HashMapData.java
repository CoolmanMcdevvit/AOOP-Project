package Hospital;

import java.util.HashMap;
import java.util.Map;


public class HashMapData {
	
	protected Map<Integer, Patient> hashmapPatient = new HashMap<Integer, Patient>();
	protected Map<Integer, Staff> hashmapStaff = new HashMap<Integer, Staff>();
	
	
	
	public Map<Integer, Patient> gethashmapPatient() {
	
		return hashmapPatient;
	}
	
	public Map<Integer, Staff> gethashmapStaff() {
	
		return hashmapStaff;
	}

	
	
//	public void outputPDF() {
//		https://www.concretepage.com/itext/create-pdf-with-text-list-table-in-java-using-itext
//	}
//	
//
//	public void initializeData() {
//		hashmapPatient
//		populates the hashmaps with data from the sql database
//		
//	}
//	
//	
//	public void closeData() {
//		clear the database and populate again with the hashmaps
//	}
}
