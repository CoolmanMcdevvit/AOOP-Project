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

    //checks login values are valid
    public void CheckLogin(String usename, String password){
        //username will be uniqe ID number
        username = Integer.parseInt(usename);
        //creates user and the sets their username
        User user = new User();
        user.setUsername(username);
        //checks username and password are a match
        if ((user.findUsername(username)) && user.matchPassword(password)){
            //creates session for user with the set username
            Session session = new Session(username);
            session.setUser(user);
            view.dispose();
            app.HomePage(session);
        }
    }

    public void display(){view.setVisible(true);}
}
