package GUI.Controller;

import GUI.Model.Session;
import GUI.View.HomePageView;
import GUI.View.PatientRegistrationView;

public class ApplicationController {
    //insert controllers to call here
    private LoginController logincontroller;
    private HomePageController homePagecontroller;
    private PatRegistrationController patregistrationcontroller;

    public void login(){
        logincontroller = new LoginController();
        logincontroller.display();
    }

    public void registration(){
        patregistrationcontroller = new PatRegistrationController();
        PatientRegistrationView view = new PatientRegistrationView(patregistrationcontroller);
        patregistrationcontroller.setView(view );
        patregistrationcontroller.display();

    }

    public void HomePage(Session s){
        homePagecontroller = new HomePageController(s);
        HomePageView h = new HomePageView(homePagecontroller);
        homePagecontroller.setView(h);
        homePagecontroller.display();

    }
    public static void main(String[] args){
        ApplicationController app = new ApplicationController();
        app.login();
    }
}
