package GUI.Model;

public class User {
    private String username;
    private String password;

    public void setUsername(String username){this.username = username;}

    public String getUsername(){return  username;}

    public boolean matchPassword(String password){return this.password.equals(password);} // define this.password as
                                                                                    // password associated with user in database


}
