package Hospital;

import java.util.Map;

public class Change extends Search {

	
	
	public void changePatientFirstName(int patID, Map<Integer, Patient> hmp, String firstname) {
		
		Search s = new Search();
		s.SearchpID(patID, hmp);
		
		if(s.IspIDValid(patID, hmp)) {
			Patient p = hmp.get(patID);
			p.setFirstname(firstname);
		}else {
			System.out.println("There is noone with that Id in the system");
		}	
	}
	
	
	
	
	
	
	
	
	
		
			
			
			
//			while (true) {
//				int i;
//				System.out.println("Please choose what you would like to change");
//				System.out.println("1 - First name");
//				System.out.println("2 - Last name");
//				System.out.println("3 - Address");
//				System.out.println("4 - Phonenumber");
//				System.out.println("5 - Birthday");
//				System.out.println("6 - Tribe");
//				System.out.println("7 - IsAlive");
//				System.out.println("8 - I am done for now");
//				
//				Scanner inn = new Scanner(System.in);
//				i = inn.nextInt();
//				
//				if (i == 1) {
//					p.setFirstname(null);
//				}else if (i == 2) {
//					p.setLastname(null);
//				}else if (i == 3) {
//					p.setAddress(null);
//				}else if (i == 4) {
//					p.setPhonenumber(0);
//				}else if (i == 5) {
//					p.setBirthday(0);
//					p.setBirthmonth(0);
//					p.setBirthyear(0);
//				}else if (i == 6) {
//					p.setTribe(null);
//				}else if (i == 7) {
//					p.setAlivestatus(true);
//				}else if (i == 8) {
//					break;
//				}
//				
//			}
//		} else{
//			System.out.println("This is not a valid ID");
//		}
//	}

	
	
	
}
