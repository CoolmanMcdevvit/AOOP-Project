package GUI.Controller;

import GUI.Model.Session;
import GUI.Model.User;
import GUI.View.LoginView;

public class LoginController {

    private ApplicationController app;
    private LoginView view;
    private Session session;
    private int username;

    public LoginController(){
        this.app = new ApplicationController();
        this.view = new LoginView(this);
    }

    public void CheckLogin(String usename, String password){
        username = Integer.parseInt(usename);
        User user = new User();
        user.setUsername(username);
        if ((user.findUsername(username)) && user.matchPassword(password)){
            Session session = new Session(username);
            session.setUser(user);
            view.setVisible(false);
            app.HomePage(session);
        }
    }
    public void display(){view.setVisible(true);}
}
