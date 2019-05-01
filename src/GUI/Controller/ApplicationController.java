package GUI.Controller;

import GUI.View.HomePageView;
import GUI.View.LoginView;
import sun.rmi.runtime.Log;

public class ApplicationController {
    //insert controllers to call here
    private LoginController logincontroller;
    private HomePageController homePagecontroller;

    public void login(){
        logincontroller = new LoginController();
        logincontroller.display();
    }

    public void HomePage(){


    }
    public static void main(String[] args){
        LoginController c = new LoginController();
        HomePageView H = new HomePageView();
        LoginView L = new LoginView(c);
        L.setVisible(true);
        H.setVisible(true);
    }
}
