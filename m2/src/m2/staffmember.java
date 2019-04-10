package m2;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Comparator;

public class staffmember {
	private String firstname;
	private String surname;
	private String jobrole;
	private int serialnumber;
	private String email;
	
	public staffmember() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String toString(){
        return firstname + " - " + surname + " - " + jobrole + " - " + serialnumber + " - " + email;
    }
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getJobrole() {
		return jobrole;
	}
	public void setJobrole(String jobrole) {
		this.jobrole = jobrole;
	}
	public int getSerialnumber() {
		return serialnumber;
	}
	public void setSerialnumber(int serialnumber) {
		this.serialnumber = serialnumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

		public static void main(String[] args) {
			LinkedList<staffmember> Staff = new LinkedList<>();
			boolean B;
			
			B=true;
			Scanner s = new Scanner(System.in);
			while(B) {
				String email, Fname, Sname, Jrole;
				Integer serialnumber;
				
				staffmember t = new staffmember();
				
				
				System.out.print("Enter firstname: ");
				Fname=s.nextLine();
				t.setFirstname(Fname);
				
				System.out.print("Enter surname: ");
				Sname = s.nextLine();
				t.setSurname(Sname);
				
				System.out.print("Enter email: ");
				email = s.nextLine();
				t.setEmail(email);
				
				System.out.print("Enter job role");
				Jrole = s.nextLine();
				t.setJobrole(Jrole);
				
				System.out.print("Enter serialnumber: ");
				serialnumber = s.nextInt();
				s.nextLine();
				t.setSerialnumber(serialnumber);
				
				Staff.push(t);
				
//				System.out.print("Do you wish to continue [y/n]? ");
//				char k = s.next().charAt(0);
//				s.hasNextLine();
//				if(k != 'y') {
//					B=false;
//				}
				System.out.println(Staff);
			}
			
			s.close();
			
		
		}
	

}