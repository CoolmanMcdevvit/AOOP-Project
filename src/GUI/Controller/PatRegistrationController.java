package GUI.Controller;

import GUI.Model.Homepage;
import GUI.Model.PatRegistration;
import GUI.View.HomePageView;
import GUI.View.PatientRegistrationView;

import javax.swing.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

//subclass of PersonController
public class PatRegistrationController extends PersonController{

    private PatientRegistrationView view;
    private HomePageView hview;
    private PatRegistration model;

    PatRegistrationController(PatRegistration mdl){
        this.model = mdl;
    }


    //checks field values are valid then passes to model
    public void check(JTextField[] f) {
        if (checkBirthday(f) && checkForBlanks(f,9) && f[6].getText().length()==8 && (f[8].getText().toLowerCase().equals("yes") || f[8].getText().toLowerCase().equals("no"))) {
            model.regsisterInput(f);
        }
    }

}
