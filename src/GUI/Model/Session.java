package GUI.Model;


public class Session {

    private String role;
    private User user;
    public Session(){
        setRole();
    }

    public void setUser(User user){this.user = user;}

    private void setRole(){
        this.role = "registration clerk"; //return Registration.get(key).get(1);
    }

    public String getRole(){
        return role;
    }
}
