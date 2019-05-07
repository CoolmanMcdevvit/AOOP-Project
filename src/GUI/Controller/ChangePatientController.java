package GUI.Controller;

import GUI.Model.PatChange;
import GUI.View.ChangePatientView;

import javax.swing.*;

//subclass of PersonController
public class ChangePatientController extends PersonController{

    //
    private PatChange model;

    //model passed to constructor to allow communication with model
    ChangePatientController(PatChange mdl){
        this.model = mdl;
    }

    //for updating patient data
    public void update(JTextField[] f){
        //checks if there are blanks in fields and then if Alive or dead is yes or no.
        if (checkForBlanks(f,8) && checkBirthday(f) && (f[8].getText().toLowerCase().equals("yes")||f[8].getText().toLowerCase().equals("no"))){
            model.update(f);
        }
    }

    //displays pop up optionPane asking for UID, this is then used to fill TextFields with User ID information
    void displayOptionPane(ChangePatientView view){
        //assigning UIDsearch as user entry into popup pane
        String uidsearch = JOptionPane.showInputDialog("please enter UID of Patient");
        //call model to search for uidsearch
        //try catch statement in case uid is string or user presses cancel
        try {
            //sets text fields in view to output of the search in the model
            view.setTextfields(model.uidFind(uidsearch));
        }
        //catch statement for incorrect inputs
        catch(Exception e){JOptionPane.showMessageDialog(null,
                "Patient Data will Not be entered due to no or incorrect id entered");
        }
    }
}
