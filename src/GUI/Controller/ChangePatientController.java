package GUI.Controller;

import GUI.Model.Session;
import GUI.View.ChangePatientView;
import GUI.View.HomePageView;
import GUI.View.PatientRegistrationView;
import GUI.View.RegistrationView;

import javax.swing.*;

public class ChangePatientController{

    //private PatientRegistrationView view;
    private ChangePatientView view;
    private HomePageView hview;
    private JOptionPane uidstring;

    public void check(String[] f) {
        int c = 0;
        for(int i=0; i<8; i++){
            if(!f[i].equals("")){
                c+=1;
            }
        }
        if(c == 8){
            System.out.print(f[1]);
        }

    }

    public void setView(ChangePatientView view, HomePageView hview){
        this.view = view;
        this.hview = hview;
    }

    public void display(){
        String uidsearch = JOptionPane.showInputDialog("please enter UID of Patient");
        // call model to search for uidsearch
        view.setVisible(true);}

    public void returnHome(){
        view.dispose();
        hview.setVisible(true);

    }
}