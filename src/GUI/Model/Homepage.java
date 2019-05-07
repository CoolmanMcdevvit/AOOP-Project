package GUI.Model;
import java.sql.*;
import java.util.Scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Homepage {

public String patientRegModel(String n, String sn, String bd, String ha,String pn, String t, String ad){
        if ((ad.toLowerCase().equals("alive") || ad.toLowerCase().equals("dead") && pn.length() == 8)) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital_JAVA", "root", "sql");
                Statement stmt = con.createStatement();
            }
            catch (Exception e) {
                System.out.println(e);
            }

            Main.patientSignUp(n,sn,bd,ha,pn,t,ad);
            return "Success";
        }
        else{
            return "error with information entered";
        }
    }
}
