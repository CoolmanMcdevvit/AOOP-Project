package Hospital;

public class Department {
	
	private String departmentName;
	private int availBeds;
	
	private static int numberOfBeds = 200;
	private static int availableBeds = 200;
	
	
	
	
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public static int getNumberOfBeds() {
		return numberOfBeds;
	}
	public static void setNumberOfBeds(int numberOfBeds) {
		Department.numberOfBeds = numberOfBeds;
	}
	public int getAvailableBeds() {
		return availableBeds;
	}
	public void setAvailableBeds(int plusminus) {   ///depends on discharge or admission if you get +1 or -1
		availableBeds = availableBeds + plusminus; 
		this.availBeds = availableBeds;
	}
	
	
	
	
}
