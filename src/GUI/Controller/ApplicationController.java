package GUI.Controller;

import sun.rmi.runtime.Log;

public class ApplicationController {
    //insert controllers to call here
    private LoginController logincontroller;

    public void login(){
        logincontroller = new LoginController();
        logincontroller.display();
    }
}
