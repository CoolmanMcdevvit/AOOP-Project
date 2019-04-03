package m1111;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i;
		Scanner input = new Scanner(System.in);
		
		while (true){System.out.println(" ");
			System.out.println("___________________________________________________________________");
			System.out.println("___________________________________________________________________");
			System.out.println(" ");
			System.out.println("Welcome: Please select what you would like to do");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("To register new patient please press 1");
			System.out.println("  ");
			System.out.println("To register new staff please press 2");
			
			i = input.nextInt();
			
			if (i == 1) {
				Registration reg = new Registration();
				reg.registerPatient();
				System.out.println(" ");
				System.out.println("Patient successfully registered!");
			} else if (i == 2){
				Registration reg = new Registration();
				reg.registerStaff();
				System.out.println(" ");
				System.out.println("Staff successfully registered!");
			}else {
				System.out.println("The number you chose is not valid...");
				System.out.println("Please choose again");
				System.out.println("Welcome: Please select what you would like to do");
				System.out.println("  ");
				System.out.println("  ");
				System.out.println("To register new patient please press 1");
				System.out.println("  ");
				System.out.println("To register new staff please press 2");	
			}
		}
		

	}

}
