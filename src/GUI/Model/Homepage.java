package GUI.Model;

public class Homepage {

public String patientRegModel(String n, String sn, String bd, String ha,String pn, String t, String ad){
        if ((ad.toLowerCase().equals("alive") || ad.toLowerCase().equals("dead") && pn.length() == 8)) {
//            Main.patientSignUp(n,sn,bd,ha,pn,t,ad);
            return "Success";
        }
        else{
            return "error with information entered";
        }
    }
}
