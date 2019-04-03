package m1111;


public class Registration {
	
	public void registerPatient() {
		Patient p = new Patient();
		
		p.setName();
		p.setSurename();
		p.setAddress();
		p.setTribe();
		p.setPhonenumber();		
		p.setComment();		
		p.setDay();
		p.setMonth();
		p.setYear();		
		p.setPatientnumber();	
		p.toString();
		p.setAlive();
		System.out.println(p.toString());
	}
	
	public void registerStaff() {
		Staff s = new Staff();
		
		s.setName();
		s.setSurename();
		s.setJobRole();
		s.setStaffNumber();
		s.setEmail();
		System.out.println(s.toString());
		
	}
		
}
