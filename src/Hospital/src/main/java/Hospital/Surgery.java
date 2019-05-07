package Hospital.src.main.java.Hospital;

public class Surgery extends Department{

	@Override
	public String getName() {
		return "Surgery";
	}
	
	@Override
	public int NoBeds() {
		return 50;
	}
	

	@Override
	public boolean Beds() {
		return true;
	}
}
