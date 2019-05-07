package GUI.Controller;

import GUI.Model.Homepage;
import GUI.Model.PatRegistration;
import GUI.View.HomePageView;
import GUI.View.PatientRegistrationView;

import javax.swing.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class PatRegistrationController extends PersonController{

    private PatientRegistrationView view;
    private HomePageView hview;
    private PatRegistration model;

    PatRegistrationController(PatRegistration mdl){
        this.model = mdl;
    }

    public boolean checkBirthday(JTextField[] f) {
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        format.setLenient(false);
        String date = f[2].getText() +"." + f[3].getText() + "." + f[4].getText();
        try {
            format.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }


    public void check(JTextField[] f) {
        if (checkBirthday(f) && checkForBlanks(f,8) && f[6].getText().length()==8 && (f[8].getText().toLowerCase().equals("yes") || f[8].getText().toLowerCase().equals("no"))) {
            model.registerPatient(f);
        }
    }

}
