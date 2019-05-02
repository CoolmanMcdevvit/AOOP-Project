package GUI.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class User {
    private static String username;
    private String password;



    public void setUsername(String username){this.username = username;}

    public String getUsername(){return  username;}

    public boolean findUsername(String username){
        // dummy hashmap for testing
        Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();

    }

    public boolean matchPassword(String password){return this.password.equals(password);} // define this.password as
                                                                                    // password associated with user in database

}
