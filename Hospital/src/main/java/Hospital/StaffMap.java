package Hospital;

import java.util.HashMap;
import java.util.Map;

public class StaffMap {
	
	private Map<Integer, Staff> hashmapStaff;

	public StaffMap() {
		hashmapStaff = new HashMap<Integer, Staff>();
		
	}
	
	public void registerStaff(Staff s) {
		hashmapStaff.put(s.getStaffID(), s);
		
	}
	
	public boolean IssIDValid(int ID) {
		if (hashmapStaff.containsKey(ID)){
			return true;
		} else {
			return false;
		}
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
}
