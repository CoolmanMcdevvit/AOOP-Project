package GUI.Controller;

import GUI.Model.Session;
import GUI.View.LoginView;

public class LoginController {

    private ApplicationController app;
    private LoginView view;
    private Session session;

    public void CheckLogin(String username, String password){
        //insert user model
        if ((!username.isEmpty()) && (password.equals("password"))){


        }
    }
    public void display(){view.setVisible(true);}
}
