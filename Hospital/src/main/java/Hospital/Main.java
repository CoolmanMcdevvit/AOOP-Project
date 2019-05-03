package Hospital;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		HashMapData hmd = new HashMapData();
		
		
		while(true) {
			String firstname, lastname, address, phonenumber, birthday, birthmonth, birthyear, tribe, isAlive;
			Scanner input = new Scanner(System.in);
			int i;
			int ii;
			
			System.out.println("WWWWWEEEEELLLLLLCOMMMMEEEE");
			System.out.println("What would you like to do?");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("1 - Register Patient");
			System.out.println("2 - Search Patient");
			System.out.println("3 - Change Patient");
			System.out.println("4 - Print every patient");
			
			
			System.out.println("Please choose a number");
			i = input.nextInt();
			
			if (i==1) {
				Scanner in = new Scanner(System.in);
				
				Patient P = new Patient();
				
				System.out.println("Firstname");
				firstname = in.nextLine();
				System.out.println("Lastname");
				lastname = in.nextLine();
				System.out.println("Address");
				address = in.nextLine();
				System.out.println("Phonenumber");
				phonenumber = in.nextLine();
				System.out.println("Birthday");
				birthday = in.nextLine();
				System.out.println("minth");
				birthmonth = in.nextLine();
				System.out.println("year");
				birthyear = in.nextLine();
				System.out.println("tribe");
				tribe = in.nextLine();
				System.out.println("isAlive");
				isAlive = in.nextLine();
				
				P.createPatient(firstname, lastname, address, phonenumber, birthday, birthmonth, birthyear, tribe, isAlive);
				
				Registration reg = new Registration();
				reg.registerPatient(P);
				
				
			} else if (i==2) {
				Search search = new Search();
				
				while (true) {
					System.out.println("What would you like to base your search on?");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println("1 - ID");
					System.out.println("2 - First name");
					System.out.println("3 - Last name");
					System.out.println(" ");
					System.out.println("Please choose a number");
					ii = input.nextInt();
					
					if (ii==1) {
						
						System.out.println("You are searching a patient based on ID");
						System.out.println("Please put in a valid ID");
						int ID = input.nextInt();
						search.SearchpID(ID);
						break;
						
					} else if (ii==2) {
						
						System.out.println("You are searching a patient based on First name");
						System.out.println("Please put in a First name");
						Scanner inn = new Scanner(System.in);
						String FN = inn.nextLine();
						search.SearchFirstName(FN);
						break;
						
					} else if (ii==3) {
						System.out.println("You are searching a patient based on Eftirnafn");
						System.out.println("Please put in a Last name");
						Scanner inn = new Scanner(System.in);
						String LN = inn.nextLine();
						search.SearchLastName(LN);
						break;
					} else {
						System.out.println("This number is not valid please choose again");
					}
				}
				
			} else if (i == 3){
				System.out.println("Please put in a valid ID of the patient you wish to change");
				int ID = input.nextInt();
				hmd.changePatient(ID);
				
			} else if (i == 4){
				System.out.println("Here is a list of all the Patients and their attributes");
				System.out.println(Registration.hashmapID.values());
			} else {
				System.out.println("The number you chose is not valid please try again");
			}
		}
	}
}
