package GUI.Model;

import java.util.*;

public class User {
    private static int username;
    private Map<Integer, ArrayList<String>> map;


    public void setUsername(int username){
        User.username = username;}

    public boolean findUsername(int username){
        // dummy hashmap for testing - replace with actual hashmap
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("hello");
        l1.add("goodbye");
        ArrayList<String> l2 = new ArrayList<>();
        l2.add("hell");
        l2.add("good");
        ArrayList<String> l3 = new ArrayList<>();
        l3.add("h");
        l3.add("g");
        map = new HashMap<>();
        map.put(1,l1);
        map.put(2,l2);
        map.put(3,l3);
        return map.containsKey(username);
    }

    public boolean matchPassword(String password){return map.get(username).get(1).equals(password);}
}
