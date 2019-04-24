package GUI.Controller;

import GUI.View.HomePageView;
import GUI.View.LoginView;
import sun.rmi.runtime.Log;

public class ApplicationController {
    //insert controllers to call here
    private LoginController logincontroller;

    public void login(){
        logincontroller = new LoginController();
        logincontroller.display();
    }
    public static void main(String[] args){
        LoginController c = new LoginController();
        HomePageView H = new HomePageView();
        H.setVisible(true);
    }
}
