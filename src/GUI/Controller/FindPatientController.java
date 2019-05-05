package GUI.Controller;

import GUI.View.FindPatientView;
import GUI.View.HomePageView;
import GUI.View.PatientRegistrationView;

import javax.swing.*;



public class FindPatientController {

    private FindPatientView view;
    private HomePageView hview;


    public void setView(FindPatientView view, HomePageView hview){
        this.view = view;
        this.hview = hview;
    }

    public void display(){
        view.setVisible(true);
    }

    public void returnHome(){
        view.dispose();
        hview.setVisible(true);

    }
}
