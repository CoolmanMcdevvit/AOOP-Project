package Hospital;

import java.awt.List;

public abstract class Department {
	
	public abstract String getName();
	public abstract boolean Beds();
	public abstract int NoBeds();
	
	
	public static Department parseDepartment(String d) {
		Department[] deps = new Department[] { new Emergency(), new Surgery(), new Medical() };
		for (Department dep : deps) {
			if(d.equals(dep.getName())) {
				return dep;
			}
		}
		return null;
	}	
	
	
}
