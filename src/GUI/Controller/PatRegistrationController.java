package GUI.Controller;

import GUI.Model.PatRegistration;

import javax.swing.*;

//subclass of PersonController
public class PatRegistrationController extends PersonController{

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
