package GUI.Model;


import java.util.ArrayList;

public class Session {

    private String role;
    private User user;
    public Session(int key){
        setRole(key);
    }

    public void setUser(User user){this.user = user;}

    public User getUser(){return this.user;}

    public int getUsername(){return user.getUsername();}

    public void setRole(int key){
        ArrayList temp = new ArrayList();
        this.role = "2"; //return Registration.get(key).get(1);
    }

    public String getRole(){
        return role;
    }
}
