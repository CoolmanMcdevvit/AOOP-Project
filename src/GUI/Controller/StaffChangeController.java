package GUI.Controller;

import GUI.Model.StaffChange;
import GUI.View.HomePageView;
import GUI.View.StaffChangeView;

import javax.swing.*;

public class StaffChangeController extends PersonController {

    public HomePageView hview;
    public StaffChangeView view;
    public StaffChange model;

    StaffChangeController(StaffChange mdl){
        this.model = mdl;
    }

    public void update(JTextField[] f){
        if(checkForBlanks(f,3)){
            model.update(f);
        }
    }


    public void displayOptionPane(StaffChangeView view){
        String uidsearch = JOptionPane.showInputDialog("please enter UID of Staff Memeber");
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
