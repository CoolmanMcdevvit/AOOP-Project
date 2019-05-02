package GUI.Controller;

//import GUI.Model.Homepage;
import GUI.Model.Session;
import GUI.View.HomePageView;

public class HomePageController{
    private HomePageView view;
    private Session model;
    private ApplicationController application;

    public HomePageController(Session s){
        this.model = s;
        this.application = new ApplicationController();
    }

    public void patRegistrationPress(){
        if(model.getRole().equals("registration clerk")){
            application.registration();
        }
    }

    public void patChangePress() {
        if (model.getRole().equals("registration clerk")) {
            application.registration();
        }
    }

    public void patFindPress() {
        if (model.getRole().equals("registration clerk")) {
            application.registration();
        }
    }

    public void patAdmissionPress() {
        if (model.getRole().equals("registration clerk")) {
            application.registration();
        }
    }

//    public void checkPatientReg(String n, String sn, String bd, String ha,String pn, String t, String ad) {
//        homepage.patientRegModel(n,sn,bd,ha,pn,t,ad);
//    }
//    public void regPopup(){
//        application.registration();
//    }
//    public void searchPatientReg(String n, String sn, String bd, String ha,String pn, String t, String ad){
//
//    }

    public void setView(HomePageView view){
        this.view = view;
    }

    public void display(){view.setVisible(true);}
}
