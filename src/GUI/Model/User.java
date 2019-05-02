package GUI.Model;

import java.util.*;

public class User {
    private static int username;
    private String password;
    private int key;
    private Map<Integer, ArrayList<String>> map;


    public void setUsername(int username){this.username = username;}

    public int getUsername(){return  username;}

    public boolean findUsername(int username){
        // dummy hashmap for testing - replace with actual hashmap
        ArrayList l1 = new ArrayList();
        l1.add("hello");
        l1.add("goodbye");
        ArrayList l2 = new ArrayList();
        l2.add("hell");
        l2.add("good");
        ArrayList l3 = new ArrayList();
        l3.add("h");
        l3.add("g");
        map = new HashMap<Integer, ArrayList<String>>();
        map.put(1,l1);
        map.put(2,l2);
        map.put(3,l3);
        return map.containsKey(username);
    }

    public boolean matchPassword(String password){return map.get(username).get(1).equals(password);}
}
