package Hospital;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		HashMapData hmd = new HashMapData();
		StaffMap sm = new StaffMap();
		
		
		Patient p = new Patient();
		Patient S = new Patient();
		p.setPatient("Solvi", "Palsson", "hommagata", 2323, "15.07.1996", "api", true);
		S.setPatient("Steinn", "Erlendsson", "hommagata", 243, "16.06.1991", "api", true);
		
		hmd.registerPatient(p);
		hmd.registerPatient(S);
		hmd.printHMD();

		while(true) {
			String firstname, lastname, address, phonenumber, birthday, birthmonth, birthyear, tribe, isAlive;
			Scanner input = new Scanner(System.in);
			int i;
			int ii;
			
			System.out.println("WWWWWEEEEELLLLLLCOMMMMEEEE");System.out.println("What would you like to do?");System.out.println(" ");System.out.println(" ");System.out.println("1 - Register Patient");System.out.println("2 - Search Patient");System.out.println("3 - Change Patient");System.out.println("4 - Print every patient");System.out.println("5 - Admit patient");System.out.println("Please choose a number");
			i = input.nextInt();
			
			if (i==1) {
				
				Patient P = new Patient();
				firstname = "Gunnar";
				lastname = "Helgason";
				address = "Fiskakvisl";
				phonenumber = "12345678";
				birthday = "3";
				birthmonth = "02";
				birthyear = "1";
				tribe = "Api";
				isAlive = "Yes";
				
				P.createPatient(firstname, lastname, address, phonenumber, birthday, birthmonth, birthyear, tribe, isAlive);
				
				hmd.registerPatient(P);
				
				hmd.printHMD();
				
				String test, test2, test3;
				test = P.getBirthDAY();
				test2 = P.getBirthMONTH();
				test3 = P.getBirthYEAR();
				System.out.println(" ");
				System.out.println(test);
				System.out.println(test2);
				System.out.println(test3);
				
			} else if (i==2) {

				
				while (true) {
					System.out.println("What would you like to base your search on?");System.out.println(" ");System.out.println("1 - ID");System.out.println("2 - First name");System.out.println("3 - Last name");System.out.println("Please choose a number");

					ii = input.nextInt();
					
					if (ii==1) {
						int ID = 10001;
						System.out.println("You are searching a patient based on ID: " + ID);
						hmd.SearchpID(ID);
						break;
						
					} else if (ii==2) {
						String FN = "Steinn";
						System.out.println("You are searching a patient based on First name: " + FN);
						hmd.SearchPFirstName(FN);
						break;
						
					} else if (ii==3) {
						String LN = "Helgason";
						System.out.println("You are searching a patient based on lastname: " + LN);
						hmd.SearchPLastName(LN);
						break;
					} else {
						System.out.println("This number is not valid please choose again");
					}
				}
				
			} else if (i == 3){
				System.out.println("Please put in a valid ID of the patient you wish to change");
				int ID = 10001;
				hmd.changePatient(ID, "Solvi", "Palsson", "hommagata", "12345678", "15.", "07", "1996", "Buxi", "Nein");
				hmd.printHMD();
				
			} else if (i == 4){
				System.out.println("Here is a list of all the Patients and their attributes");
				hmd.printHMD();
			} else if(i==5){
				
				String test = "Medical";
				String id = "10001";
				String Bed = "17";
				hmd.admitPatient(test, id, Bed);
				String test2 = "Medical";
				String id2 = "10002";
				String Bed2 = "18";
				hmd.printHMD();
				hmd.admitPatient(test2, id2, Bed2);
				hmd.printHMD();
				ArrayList<String> prufa = hmd.getAllPatientsinDepartments();
				System.out.print(prufa);
				
			}
			else {
				System.out.println("The number you chose is not valid please try again");
			}
		}
	}
}
