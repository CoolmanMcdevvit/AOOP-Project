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

    // sets session, application and model as private variables of HomePageController class
    HomePageController(Session s){
        this.session = s;
        this.application = new ApplicationController();
        this.model = new Homepage();
        model.populate();
    }

    // all methods below check if user has correct role, sets HomePageView as not visible and then calls the Application Controller
    public void patRegistrationPress(){
        if(session.getRole().equals("registration clerk")){
            view.setVisible(false);
            //model.patientdata in these functions refers to the Patient Hashmap
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
            application.findPatient(view, model.patientdata);
        }
    }

    public void patAdmitMovePress(){
        if (session.getRole().equals("registration clerk")) {
            view.setVisible(false);
            application.admitMove(view, model.patientdata);
        }
    }

    public void staffRegistrationPress(){
        if (session.getRole().equals("registration clerk")) {
            view.setVisible(false);
            //model.staffdata in these functions refers to the Staff Hashmap
            application.staffRegistration(view, model.staffdata);
        }
    }

    public void staffChangePress(){
        if (session.getRole().equals("registration clerk")) {
            view.setVisible(false);
            application.staffChange(view, model.staffdata);
        }
    }

    public void facilityStatusPress(){
        if (session.getRole().equals("registration clerk")){
            view.setVisible(false);
            application.facilityStatus(view,model.patientdata);
        }
    }

    public void participationListsPress(){
        if (session.getRole().equals("registration clerk")){
            view.setVisible(false);
            application.participationLists(view);
        }
    }

    public void findStaffPress(){
        if (session.getRole().equals("registration clerk")){
            view.setVisible(false);
            application.findStaff(view,model.staffdata);
        }
    }
    public void updateDatabasePress(){
        try{model.update();
            JOptionPane.showMessageDialog(null,
                    "Database Updated",
                    "",
                    JOptionPane.WARNING_MESSAGE);}
        catch (Exception e){JOptionPane.showMessageDialog(null,
                "Unsuccessful Operation",
                "",
                JOptionPane.WARNING_MESSAGE);}
    }


    public void setView(HomePageView view){
        this.view = view;
    }

    void display(){view.setVisible(true);}
}
