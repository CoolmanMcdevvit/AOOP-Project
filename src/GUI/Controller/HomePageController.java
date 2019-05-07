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
        model.populate();
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
            application.findPatient(view, model.patientdata);
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
    public void updateDatabasePress(){try{model.update();
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

    public void display(){view.setVisible(true);}
}
