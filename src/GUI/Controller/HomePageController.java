package GUI.Controller;

//import GUI.Model.Homepage;
import GUI.Model.Session;
import GUI.View.HomePageView;

import javax.swing.*;

public class HomePageController{
    private HomePageView view;
    private Session session;
    private ApplicationController application;

    public HomePageController(Session s){
        this.session = s;
        this.application = new ApplicationController();
    }

    public void patRegistrationPress(){
        if(session.getRole().equals("registration clerk")){
            view.setVisible(false);
            application.registration(view);
        }
    }

    public void patChangePress() {
        if (session.getRole().equals("registration clerk")){
            view.setVisible(false);
            application.changePatient(view);
            }
        }


    public void patFindPress() {
        if (session.getRole().equals("registration clerk")) {
            application.registration(view);
        }
    }

    public void patAdmissionPress() {
        if (session.getRole().equals("registration clerk")) {
            application.registration(view);
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
