package GUI.Model;

public class Homepage {
private Patient p;
private Register r;

public void patientRegModel(String n, String sn, String bd, String ha,String pn, String t, String ad){
        if ((ad.toLowerCase().equals("alive") || ad.toLowerCase().equals("dead") && pn.length() == 8) && !n.isEmpty() && !sn.isEmpty() && !bd.isEmpty() && !ha.isEmpty() && !t.isEmpty() && !ad.isEmpty()) {
            //Main.patientSignUp(n,sn,bd,ha,pn,t,ad);
            p = new Patient(n,sn,bd,ha,pn,t,ad);
            r = new Register();
            r.register(p);

        }
        else{

        }
    }
}
