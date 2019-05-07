package Hospital.src.main.java.Hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

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
	public Object[][] StaffSearchID(int ID) {


		Object[][] output = new String[1][5];
		Staff st = hashmapStaff.get(ID);

		output[0][0] = st.getFirstname();
		output[0][1] = st.getLastname();
		output[0][2] = String.valueOf(st.getStaffID());
		output[0][3] = st.getEmail();
		output[0][4] = st.getJobRole();


		return output;
	}

	public Object[][] SearchSFirstName(String firstNameToCompare) {

		List<Staff> staffList = new ArrayList<Staff>();

		Iterator<Staff> iterator = hashmapStaff.values().iterator();
		while (iterator.hasNext()) {
			Staff staff = iterator.next();
			if (staff.getFirstname().equals(firstNameToCompare)) {
				System.out.println(hashmapStaff.get(staff.getStaffID()));
				staffList.add(staff);
			}
		}
		int i = 0;
		Object[][] output = new String[staffList.size()][5];
		for(Staff st: staffList) {

			output[i][0] = st.getFirstname();
			output[i][1] = st.getLastname();
			output[i][2] = String.valueOf(st.getStaffID());
			output[i][3] = st.getEmail();
			output[i][4] = st.getJobRole();

			i = i+1;
		}
		return output;
	}

	public Object[][] SearchSLastName(String lastNameToCompare) {

		List<Staff> staffList = new ArrayList<Staff>();

		Iterator<Staff> iterator = hashmapStaff.values().iterator();
		while (iterator.hasNext()) {
			Staff staff = iterator.next();
			if (staff.getLastname().equals(lastNameToCompare)) {
				System.out.println(hashmapStaff.get(staff.getStaffID()));
				staffList.add(staff);
			}
		}
		int i = 0;
		Object[][] output = new String[staffList.size()][5];
		for(Staff st: staffList) {

			output[i][0] = st.getFirstname();
			output[i][1] = st.getLastname();
			output[i][2] = String.valueOf(st.getStaffID());
			output[i][3] = st.getEmail();
			output[i][4] = st.getJobRole();

			i = i+1;
		}
		return output;
	}
	public void printHMD() {
		System.out.print(hashmapStaff.values());
	}

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
}
