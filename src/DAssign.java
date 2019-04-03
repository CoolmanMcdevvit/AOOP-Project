import java.util.Scanner;

public class DAssign {
    public static void Init(){
        System.out.println("Welcome to Admission Control Server");
        System.out.println("Which Department is the patient in?");
        System.out.println("1 - Emergency");
        System.out.println("2 - Inpatient");
        System.out.println("3 - Outpatient");
        Scanner department = new Scanner(System.in);
        if (department.equals(1))
            //Emergency class stuff
            System.out.println("Emergency department chosen");
        if (department.equals(2))
            /*Inpatient class stuff
            Which means a bed is given for a patient*/
            System.out.println("Inpatient department chosen");
        if (department.equals(3))
            //Outpatient class stuff
            System.out.println("Outpatient department chosen");
}}
