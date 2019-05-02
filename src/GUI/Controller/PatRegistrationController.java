package GUI.Controller;

import GUI.View.PatientRegistrationView;
import GUI.View.RegistrationView;

public class PatRegistrationController {

    private PatientRegistrationView view;


    public void checkPatientReg(String n, String sn, String bdd,String bdm,String bdy, String ha,String pn, String t, String ad) {
        if(!n.equals("") && !sn.equals("") && !bdd.equals("") && !bdm.equals("") && !bdy.equals("") && !ha.equals("") && pn.length()==8 && !t.equals("") && (ad.toLowerCase().equals("alive")||ad.toLowerCase().equals("dead"))){
            //Registration.patientRegModel(n,sn,bdd,bdm,bdy,ha,pn,t,ad);
        }
    }

    public void setView(PatientRegistrationView view){
        this.view= view;
    }

    public void display(){view.setVisible(true);}
}
