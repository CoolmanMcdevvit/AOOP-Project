package GUI.Controller;

import GUI.View.HomePageView;
import GUI.View.PatientRegistrationView;

import javax.swing.*;

public class PatRegistrationController extends PersonController{

    private PatientRegistrationView view;
    private HomePageView hview;


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
}
