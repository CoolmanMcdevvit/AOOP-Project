package GUI.Controller;

import GUI.Model.Homepage;
import GUI.Model.PatRegistration;
import GUI.View.HomePageView;
import GUI.View.PatientRegistrationView;

import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class PatRegistrationController extends PersonController{

    private PatientRegistrationView view;
    private HomePageView hview;
    private PatRegistration model;

    PatRegistrationController(PatRegistration mdl){
        this.model = mdl;
    }


    public void check(JTextField[] f) {
        if (checkBirthday(f) && checkForBlanks(f) && f[6].getText().length()==8 && (f[8].getText().toLowerCase().equals("yes") || f[8].getText().toLowerCase().equals("no"))) {
            System.out.print(model);
            model.registerPatient(f);
        }
    }

}
