package GUI.Controller;

//import GUI.Model.Homepage;
import GUI.Model.Homepage;
import GUI.Model.Session;
import GUI.View.HomePageView;

import javax.swing.*;

public class HomePageController{
    private HomePageView view;
    private Session session;
    private ApplicationController application;
    private Homepage model;

    public HomePageController(Session s){
        this.session = s;
        this.application = new ApplicationController();
        this.model = new Homepage();
    }

    public void patRegistrationPress(){
        if(session.getRole().equals("registration clerk")){
            view.setVisible(false);
            application.registration(view,model.patientdata);
        }
    }

    public void patChangePress() {
        if (session.getRole().equals("registration clerk")){
            view.setVisible(false);
            application.changePatient(view, model.patientdata);
            }
        }


    public void patFindPress() {
        if (session.getRole().equals("registration clerk")) {
            view.setVisible(false);
            application.findPatient(view);
        }
    }

    public void patAdmitMovePress(){
        if (session.getRole().equals("registration clerk")) {
            application.admitMove(view, model.patientdata);
        }
    }

    public void staffRegistrationPress(){
        if (session.getRole().equals("registration clerk")) {
            application.staffRegistration(view, model.staffdata);
        }
    }

    public void staffChangePress(){
        if (session.getRole().equals("registration clerk")) {
            application.staffChange(view, model.staffdata);
        }
    }

    public void facilityStatusPress(){
        if (session.getRole().equals("registration clerk")){
            view.setVisible(false);
            application.facilityStatus(view);
        }
    }

    public void participationListsPress(){
        if (session.getRole().equals("registration clerk")){
            view.setVisible(false);
            application.participationLists(view);
        }
    }
    public void updateDatabasePress(){
        application.updateDatabase();
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
