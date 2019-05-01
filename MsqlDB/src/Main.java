import java.sql.*;
import java.util.Scanner;



class Main {
    public static void patientSignUp(String name, String surname, String address, String phone, string bdate, int dept, int alive)
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital_JAVA", "root", "sql");
            Statement stmt = con.createStatement();
//            Scanner s = new Scanner(System.in);
//            String Pati_Name, Pati_Surname, Pati_Address, Pati_Bdate, Pati_Phone;
//            int Pati_Dept, Pati_Tribe, Pati_Alive;
//            System.out.print("Welcome to the Patient sign up function ");
//            System.out.print("Enter firstname: ");
//            Pati_Name = s.nextLine();
//            System.out.print("Enter lastname: ");
//            Pati_Surname = s.nextLine();
//            System.out.print("Enter address: ");
//            Pati_Address = s.nextLine();
//            System.out.print("Enter birth date: (DD.MM.YYYY)");
//            Pati_Bdate = s.nextLine();
//            System.out.print("Enter phone number: ");
//            Pati_Phone = s.nextLine();
//            System.out.print("Enter department: (emergency = 1, inpatient = 2, outpatient = 3, Not assigned = 4)");
//            Pati_Dept = s.nextInt();
//            System.out.print("Enter tribe: (Asia = 1, US = 2, EU = 3, Africa = 4, Australia = 5, Others = 6");
//            Pati_Tribe = s.nextInt();
//            System.out.print("Enter life status: (alive = 1, dead = 2)");
//            Pati_Alive = s.nextInt();
            
            stmt.executeUpdate("INSERT INTO Patient (Pati_Name, Pati_Surname, Pati_Address, Pati_Phone, Pati_Bdate, Pati_Tribe, Pati_Dept, Pati_Alive)" 
                    + "VALUES('" + name +"','"+ surname +"','"+ address + "','" + phone
                    +"','"+ bdate +"',"+ tribe + ','+ dept + ','+ alive + ")");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void Patient_update(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital_JAVA", "root", "sql");
            Statement stmt = con.createStatement();
            Scanner s = new Scanner(System.in);
            System.out.println("Welcome to the Patient update function: ");
            System.out.println("How many items do you have to change? ");
            int counter = s.nextInt();
            System.out.println("Please provide the ID");
            int ID = s.nextInt();
            s.nextLine();
            String sql = "select * from Patient WHERE " + "Pati_ID = " + ID;
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next())
            {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " 
                        + rs.getString(4) +" "+ rs.getString(5) +" "+ rs.getString(6) +" "+ 
                        rs.getString(7) +" "+ rs.getString(8) +" "+ rs.getString(9));
            }
            String item, change;
            for (int i=0; i<counter; i++)
            {
                System.out.println("Which item do you wanna change? ");
                item = s.nextLine();
                System.out.print("What do you want to change it to? ");
                change = s.nextLine();
                sql = "UPDATE Patient SET " + item +" = '" + change + "' WHERE Pati_ID = " + ID;
                System.out.println(sql);
                stmt.executeUpdate(sql);
            }
            sql = "select * from Patient WHERE " + "Pati_ID = " + ID;
            rs = stmt.executeQuery(sql);
            while (rs.next())
            {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " 
                        + rs.getString(4) +" "+ rs.getString(5) +" "+ rs.getString(6) +" "+ 
                        rs.getString(7) +" "+ rs.getString(8) +" "+ rs.getString(9));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void Patient_search(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital_JAVA", "root", "sql");
            Statement stmt = con.createStatement();
            Scanner s = new Scanner(System.in);
            String Pati_Name, Pati_Surname;
            System.out.print("Welcome to the patient searching function: ");
            System.out.print("Enter firstname: ");
            Pati_Name = s.nextLine();
            System.out.print("Enter lastname: ");
            Pati_Surname = s.nextLine();
            String sql = "select * from Patient WHERE " + "Pati_Name = " +"'"+ Pati_Name + "' AND Pati_Surname = '" + Pati_Surname + "'";
            //System.out.print(sql);
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next())
            {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " 
                        + rs.getString(4) +" "+ rs.getString(5) +" "+ rs.getString(6) +" "+ 
                        rs.getString(7) +" "+ rs.getString(8) +" "+ rs.getString(9));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void Bed_avail(String dept){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital_JAVA", "root", "sql");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select Pati_Dept from Patient");
            int counter_bed = 0;
            //if (rs.absolute(1)) //start counting from 1 or replace by the col name
            while (rs.next()){
                if (rs.getString(1).equals(dept))
                //the number inside the get function refers to the original position of the table construction, not query
                    counter_bed ++;
            }

            rs = stmt.executeQuery("select * from Facility");
            while (rs.next()){
                if (rs.getString(1).equals(dept)){
                    System.out.println("Total bed available for '" + dept + "' department is " + (rs.getInt(2) - counter_bed));
                    break;}
            }
            
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void Staff_sign_up(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital_JAVA", "root", "sql");
            Statement stmt = con.createStatement();
            Scanner s = new Scanner(System.in);
            String St_Name, St_Surname;
            int St_Role, St_Dept;
            System.out.print("Welcome to the Staff sign up function ");
            System.out.print("Enter firstname: ");
            St_Name = s.nextLine();
            System.out.print("Enter lastname: ");
            St_Surname = s.nextLine();
            System.out.print("Enter role: (Doctor = 1, Nurse = 2, Clerk = 3, ICT officer = 4)");
            St_Role = s.nextInt();
            System.out.print("Enter department: (emergency = 1, inpatient = 2, outpatient = 3, not specificed[ICT/ clerk] = 4)");
            St_Dept = s.nextInt();
            //System.out.println("VALUES('" + St_Name +"','"+ St_Surname +"',"+ St_Role +','+ St_Dept + ")");
            
            stmt.executeUpdate("INSERT INTO Staff (St_Name, St_Surname, St_Role, St_Dept)" 
                    + "VALUES('" + St_Name +"','"+ St_Surname +"',"+ St_Role +','+ St_Dept + ")");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void Staff_search(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital_JAVA", "root", "sql");
            Statement stmt = con.createStatement();
            Scanner s = new Scanner(System.in);
            String St_Name, St_Surname;
            System.out.print("Welcome to the staff searching function: ");
            System.out.print("Enter firstname: ");
            St_Name = s.nextLine();
            System.out.print("Enter lastname: ");
            St_Surname = s.nextLine();
            String sql = "select * from Staff WHERE " + "St_Name = " +"'"+ St_Name + "' AND St_Surname = '" + St_Surname + "'";
            //System.out.print(sql);
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next())
            {
                System.out.print(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " 
                        + rs.getString(4) +" "+ rs.getString(5) +" "+ rs.getString(6));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void Staff_update(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital_JAVA", "root", "sql");
            Statement stmt = con.createStatement();
            Scanner s = new Scanner(System.in);
            System.out.println("Welcome to the Staff update function: ");
            System.out.println("How many items do you have to change? ");
            int counter = s.nextInt();
            System.out.println("Please provide the ID");
            int ID = s.nextInt();
            s.nextLine();
            String sql = "select * from Staff WHERE " + "St_SerialNum = " + ID;
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next())
            {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " 
                        + rs.getString(4) +" "+ rs.getString(5) +" "+ rs.getString(6));
            }
            String item, change;
            for (int i=0; i<counter; i++)
            {
                System.out.println("Which item do you wanna change? ");
                item = s.nextLine();
                System.out.print("What do you want to change it to? ");
                change = s.nextLine();
                sql = "UPDATE Staff SET " + item +" = '" + change + "' WHERE St_SerialNum = " + ID;
                System.out.println(sql);
                stmt.executeUpdate(sql);
            }
            sql = "select * from Staff WHERE " + "St_SerialNum = " + ID;
            rs = stmt.executeQuery(sql);
            while (rs.next())
            {
                System.out.print(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " 
                        + rs.getString(4) +" "+ rs.getString(5) +" "+ rs.getString(6));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void main(String args[]) {
        Patient_search();
    }
}
