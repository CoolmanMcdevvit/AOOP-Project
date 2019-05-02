package GUI.Controller;

import GUI.Model.Session;
import GUI.View.HomePageView;
import GUI.View.LoginView;
import sun.rmi.runtime.Log;

public class ApplicationController {
    //insert controllers to call here
    private LoginController logincontroller;
    private HomePageController homePagecontroller;
    private RegistrationController registrationcontroller;

    public void login(){
        logincontroller = new LoginController();
        logincontroller.display();
    }

    public void registration(){
        registrationcontroller = new RegistrationController();
//        registrationcontroller.display();

    }

    public void HomePage(Session s){
        HomePageView h = new HomePageView();
        homePagecontroller = new HomePageController(s);
        homePagecontroller.setView(h);
        homePagecontroller.display();

    }
    public static void main(String[] args){
        ApplicationController app = new ApplicationController();
        app.login();
    }
}
