package GUI.Controller;

import GUI.Model.StaffRegistration;
import GUI.View.HomePageView;
import GUI.View.StaffRegistrationView;

import javax.swing.*;

public class StaffRegistrationController extends PersonController {

    private StaffRegistrationView view;
    private HomePageView hview;
    private StaffRegistration model;


    StaffRegistrationController(StaffRegistration mdl){
        this.model = mdl;
    }

    // ensures there are no blanks in input from JTextfields and passes to model to update StaffMap
    public void check(JTextField[] f){
        if (checkForBlanks(f,4)) {
            model.regsisterInput(f);
        }
    }
}
