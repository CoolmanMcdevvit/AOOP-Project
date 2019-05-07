package Hospital.src.main.java.Hospital;

import java.awt.List;

public class Emergency extends Department{
	
	@Override
	public String getName() {
		return "Emergency";
	}
	
	@Override
	public int NoBeds() {
		return 1000;
	}
	

	@Override
	public boolean Beds() {
		return false;
	}

	
	
}
