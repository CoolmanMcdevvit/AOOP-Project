package Hospital.src.main.java.Hospital;

import java.util.HashMap;
import java.util.Map;

public class StaffMap {
	
	private Map<Integer, Staff> hashmapStaff;

	public StaffMap() {
		hashmapStaff = new HashMap<Integer, Staff>();
		
	}
	public Map<Integer, Staff> getHashMapStaff(){
		return hashmapStaff;
	}

	
	public void registerStaff(Staff s) {
		hashmapStaff.put(s.getStaffID(), s);
		
	}
	
	public boolean IssIDValid(int ID) {
        return hashmapStaff.containsKey(ID);
	}
	
	public Staff SearchsID(int ID) {
		
		if(IssIDValid(ID)) {
		System.out.println(hashmapStaff.get(ID));
			return hashmapStaff.get(ID);
		} else {
			System.out.println("There is no staff with that ID");
			return null;
		}
	}
	public void printHMD() {
		System.out.print(hashmapStaff.values());
	}
}
