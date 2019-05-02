package GUI.Controller;

import GUI.Model.Homepage;
import GUI.View.HomePageView;

public class HomePageController{
    private HomePageView view;
    private Homepage homepage;
    private ApplicationController application;

    public void checkPatientReg(String n, String sn, String bd, String ha,String pn, String t, String ad) {
        homepage.patientRegModel(n,sn,bd,ha,pn,t,ad);
    }
    public void regPopup(){
        application.registration();
    }
    public void searchPatientReg(String n, String sn, String bd, String ha,String pn, String t, String ad){

    }
}
