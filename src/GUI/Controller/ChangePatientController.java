package GUI.Controller;

import GUI.Model.PatChange;
import GUI.View.ChangePatientView;
import GUI.View.HomePageView;

import javax.swing.*;

public class ChangePatientController extends PersonController{

    //private PatientRegistrationView view;
    private ChangePatientView view;
    private HomePageView hview;
    private JOptionPane uidstring;
    private PatChange model;

    //UID Return -> fill textfields
    ChangePatientController(PatChange mdl){
        this.model = mdl;
    }

    public void update(JTextField[] f){
        if (checkForBlanks(f,7) && checkBirthday(f) && (f[8].getText().toLowerCase().equals("yes")||f[8].getText().toLowerCase().equals("no"))){
            model.update(f);
        }
    }

    public void displayOptionPane(ChangePatientView view){
        String uidsearch = JOptionPane.showInputDialog("please enter UID of Patient");
        //call model to search for uidsearch
        try {
            view.setTextfields(model.uidFind(uidsearch));
        }
        catch(Exception e){JOptionPane.showMessageDialog(null,
                "Patient Data will Not be entered due to no or incorrect id entered" +
                JOptionPane.WARNING_MESSAGE);
        }
    }
}
