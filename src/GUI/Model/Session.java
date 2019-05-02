package GUI.Model;


import java.util.ArrayList;

public class Session {
    //User, Role + gets
    private String role;
    private User user;
    public Session(int key){
        this.role = getRole(key);
    }

    public void setUser(User user){this.user = user;}

    public User getUser(){return this.user;}

    public int getUsername(){return user.getUsername();}

    public String getRole(int key){
        ArrayList temp = new ArrayList();
        return "2";
//        return Registration.get(key).get(1);
    }
}
