package GUI.Controller;

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

    PatRegistrationController(PatRegistration model){
        this.model = model;
    }


    public void check(JTextField[] f) {
        if (checkBirthday(f) && checkForBlanks(f) && (f[8].getText().toLowerCase().equals("yes") || f[8].getText().toLowerCase().equals("no"))) {
            model.registerPatient(f);
        }
    }

}
