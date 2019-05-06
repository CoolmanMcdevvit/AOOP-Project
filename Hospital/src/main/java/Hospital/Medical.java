package Hospital;

public class Medical extends Department {
	
	@Override
	public String getName() {
		return "Medical";
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
