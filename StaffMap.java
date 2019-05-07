package Hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StaffMap {
	
	private Map<Integer, Staff> hashmapStaff;

	public StaffMap() {
		hashmapStaff = new HashMap<Integer, Staff>();
		
	}
	
	public Map<Integer, Staff> gethashmapStaff() {
		
		return hashmapStaff;
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
	public String printSM() {
		System.out.print(hashmapStaff.values());
		return hashmapStaff.values().toString();
	}
	
	public void initializeData() {
//		HashMapData
//		populates the hashmaps with data from the sql database
		try{
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital_JAVA", "root", "sql");
		    Statement stmt = con.createStatement();
		    ResultSet rs = stmt.executeQuery("SELECT * FROM Staff");
		    while (rs.next())
            {
            	Staff temp = new Staff();
            	temp.createStaff(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
            	hashmapStaff.put(temp.getStaffID(), temp);
            };
		    con.close();
		}
		catch(Exception e) {
	        System.out.println(e);
		}
	}


	//	
	//}
	//	
	//	
	public void closeData() {
//		clear the database and populate again with the hashmaps
	    try{
	  		Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital_JAVA", "root", "sql");
		    Statement stmt = con.createStatement();
		    
		    stmt.executeUpdate("DELETE FROM Staff");
		    int key = 1;
		    while (hashmapStaff.containsKey(key)) {
		    	stmt.executeUpdate("INSERT INTO Staff (St_Name, St_Surname, St_Role, St_SerialNum, St_Email, St_Phone, St_Dept)" 
	                + "VALUES('" + hashmapStaff.get(key).getFirstname() +"','"+ hashmapStaff.get(key).getLastname()
	                +"','"+ hashmapStaff.get(key).getJobRole() + "','" + hashmapStaff.get(key).getStaffID()
	                +"','"+ hashmapStaff.get(key).getEmail() +"','"+ hashmapStaff.get(key).getPhonenumber() + "','"+ hashmapStaff.get(key).getDepartment() +"')"); 
	                // need to update the database first, HashMapData.get(loop) to get the features.
		    	key++;
	        };
	        
	  		con.close();
	    }
		catch(Exception e) {
	        System.out.println(e);
		}
	 }
	
	 public void changeStaff(int STID, String firstname, String lastname, String department, String jobRole) {
		
		
		if(IssIDValid(STID)) {
			
			Staff p = hashmapStaff.get(STID);
			
			if(p.getFirstname() != firstname || p.getLastname() != lastname ) {
				System.out.print("You cant change the name or birthday");
				p.setDepartment(department);
				p.setJobRole(jobRole);
				return;
			}
			
			
			
		} else{
			System.out.println("This is not a valid ID");
		}
	 }
}
