package Hospital;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			String firstname, lastname, address, phonenumber, birthday, birthmonth, birthyear, tribe, isAlive;
			
			int i;
			int ii;
			
			System.out.println("WWWWWEEEEELLLLLLCOMMMMEEEE");
			System.out.println("What would you like to do?");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("1 - Register Patient");
			System.out.println("2 - Search Patient");
			System.out.println("3 - Change Patient");
			
			
			System.out.println("Please choose a number");
			i = input.nextInt();
			
			if (i==1) {
				
				Patient P = new Patient();
				firstname = P.setFirstname(null);
				
				P.Patient(firstname, lastname, address, phonenumber, birthday, birthmonth, birthyear, tribe, isAlive);
				
				Registration reg = new Registration(P);
				
				System.out.println(Registration.hashmapID.values());
				
				
			} else if (i==2) {
				Search search = new Search();
				System.out.println("What would you like to base your search on?");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("1 - ID");
				System.out.println("2 - First name");
				System.out.println("3 - Last name");
				System.out.println(" ");
				System.out.println("Please choose a number");
				ii = input.nextInt();
				
				search.SearchpID();
				if (ii==1) {
					
				}
			}
		
		
		
		
		System.out.println("WWWWWEEEEELLLLLLCOMMMMEEEE");

		
		
		
		
//		reg.printHashMapID();
//		
//		reg.printHashMapFirstname();
//		
//		search.SearchpID();
		}
	}
}
