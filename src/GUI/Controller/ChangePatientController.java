package GUI.Controller;

import GUI.View.ChangePatientView;
import GUI.View.HomePageView;

import javax.swing.*;

public class ChangePatientController extends PersonController{

    //private PatientRegistrationView view;
    private ChangePatientView view;
    private HomePageView hview;
    private JOptionPane uidstring;

    public void check(JTextField[] f) {
        int c = 0;
        for(int i=0; i<8; i++){
            if(!f[i].getText().equals("")){
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