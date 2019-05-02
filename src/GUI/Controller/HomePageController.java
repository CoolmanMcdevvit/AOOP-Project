package GUI.Controller;

import GUI.Model.Homepage;
import GUI.Model.Session;
import GUI.View.HomePageView;

public class HomePageController{
    private HomePageView view;
    private Homepage model;
    private ApplicationController application;
    private Session session;

    public HomePageController(Session s){
        this.session = s;
        this.view = new HomePageView(this);
        this.model = new Homepage();
    }

    public void registrationPress(){

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

    public void display(){view.setVisible(true);}
}
