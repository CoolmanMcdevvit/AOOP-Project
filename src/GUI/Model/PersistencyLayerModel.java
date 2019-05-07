package GUI.Model;

import Hospital.src.main.java.Hospital.HashMapData;
import Hospital.src.main.java.Hospital.Patient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PersistencyLayerModel {

//    public void initializeData() {
////		HashMapData
////		populates the hashmaps with data from the sql database
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital_JAVA", "root", "sql");
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT * FROM Patient");
//            while (rs.next())
//            {
//                Patient temp = new Patient();
//                temp.setPatient(rs.getString(2), rs.getString(3), rs.getString(5), rs.getInt(7), rs.getString(4), rs.getString(8), rs.getString(9),rs.getString(10));
//                HashMapData.put(temp.getPatientID(), temp);
//            };
//            con.close();
//        }
//        catch(Exception e) {
//            System.out.println(e);
//        }
//    }
}
