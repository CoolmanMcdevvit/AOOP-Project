package Hospital;

import java.util.Map;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Main {
	
	public static void main(String[] args) {
		HashMapData hmd = new HashMapData();
		StaffMap sm = new StaffMap();
		hmd.initializeData();
		sm.initializeData();
		boolean switch_ = true;
		
		//Patient p = new Patient();
		//Patient S = new Patient();
		//p.setPatient("Solvi", "Palsson", "hommagata", 2323, "15.07.1996", "api", true, 123);
		//S.setPatient("Steinn", "Erlendsson", "hommagata", 243, "16.06.1991", "api", true, 231);
		
		//hmd.registerPatient(p);
		//hmd.registerPatient(S);
		//System.out.println(hmd.getthings());
		hmd.printHMD();

		while(switch_) {
			String firstname, lastname, address, phonenumber, birthday, birthmonth, birthyear, tribe, isAlive;
			Scanner input = new Scanner(System.in);
			int i;
			int ii;
			
			System.out.println("WWWWWEEEEELLLLLLCOMMMMEEEE");System.out.println("What would you like to do?");System.out.println(" ");System.out.println(" ");
			System.out.println("1 - Register Patient");System.out.println("2 - Search Patient");System.out.println("3 - Change Patient");
			System.out.println("4 - Print every patient");System.out.println("5 - Admit patient");System.out.println("6 - Create Staff");
			System.out.println("7 - Search Staff");System.out.println("8 - Change Staff");System.out.println("9 - Print every staff");
			System.out.println("10 - Quit and Save");System.out.println("Please choose a number");
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
				
			} else if (i==2) {

				
				while (true) {
					System.out.println("What would you like to base your search on?");System.out.println(" ");System.out.println("1 - ID");System.out.println("2 - First name");System.out.println("3 - Last name");System.out.println("Please choose a number");

					ii = input.nextInt();
					
					if (ii==1) {
						int ID = 1;
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
				hmd.changePatient(ID, "Ken", "simon", "hommagata", "12345678", "15.", "07", "1996", "Buxi", "Nein");
				hmd.printHMD();
				
			} else if (i == 4){
				Document document = new Document();
			    try
			    {
			       PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Patientlist.pdf"));
			       document.open();
			       document.add(new Paragraph(hmd.printHMD()));
			       document.close();
			       writer.close();
			    } catch (DocumentException e)
			    {
			       e.printStackTrace();
			    } catch (FileNotFoundException e)
			    {
			       e.printStackTrace();
			    }
			} else if(i==5){
				
				String test = "Medical";
				String id = "10001";
				hmd.admitPatient(test, id);
				hmd.printHMD();
				hmd.DischargePatient(id);
				hmd.printHMD();
			} else if (i==6) {
				Staff qq = new Staff();
				qq.createStaff("Susan", "Ma", "Nurse", "Inpatient");
				sm.registerStaff(qq);
				sm.printSM();
			} else if (i==7) {
			} else if (i==8) {
			
				System.out.println("Please put in a valid ID of the Staff you wish to change");
				int ID = 1;
				sm.changeStaff(ID, "Byan", "Sean", "inpatient", "Doctor");
			} else if (i==9) {
				Document document = new Document();
			    try
			    {
			       PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Stafflist.pdf"));
			       document.open();
			       document.add(new Paragraph(sm.printSM()));
			       document.close();
			       writer.close();
			    } catch (DocumentException e)
			    {
			       e.printStackTrace();
			    } catch (FileNotFoundException e)
			    {
			       e.printStackTrace();
			    }
				
			} else if (i==10) {
				hmd.closeData();
				sm.closeData();
				switch_ = false;
			}
			else {
				System.out.println("The number you chose is not valid please try again");
			}
		}
	}
}
