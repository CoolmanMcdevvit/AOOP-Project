package GUI.Controller;

import GUI.Model.Session;
import GUI.View.ChangePatientView;
import GUI.View.HomePageView;
import GUI.View.PatientInfoView;
import GUI.View.PatientRegistrationView;

import javax.swing.*;

public class ApplicationController {
    //insert controllers to call here
    private LoginController logincontroller;
    private HomePageController homePagecontroller;
    private PatRegistrationController patientregistrationcontroller;
    private ChangePatientController changepatientcontroller;


    public void login(){
        logincontroller = new LoginController();
        logincontroller.display();
    }

    public void HomePage(Session s){
        homePagecontroller = new HomePageController(s);
        HomePageView h = new HomePageView(homePagecontroller);
        homePagecontroller.setView(h);
        homePagecontroller.display();
    }

    public void registration(HomePageView hview){
        patientregistrationcontroller = new PatRegistrationController();
        PatientRegistrationView view = new PatientRegistrationView(patientregistrationcontroller);
        patientregistrationcontroller.setView(view,hview);
        patientregistrationcontroller.display();
    }

    public void changePatient(HomePageView hview){
        changepatientcontroller = new ChangePatientController();
        ChangePatientView view = new ChangePatientView(changepatientcontroller);
        changepatientcontroller.setView(view,hview);
        changepatientcontroller.display();
    }


    public static void main(String[] args){
        ApplicationController app = new ApplicationController();
        app.login();
    }
}
