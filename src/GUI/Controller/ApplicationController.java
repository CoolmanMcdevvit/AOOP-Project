package GUI.Controller;

import GUI.Model.FindPatientModel;
import GUI.Model.PatRegistration;
import GUI.Model.Session;
import GUI.Model.*;
import GUI.View.*;
import Hospital.src.main.java.Hospital.HashMapData;
import Hospital.src.main.java.Hospital.StaffMap;

import javax.swing.*;

public class ApplicationController {
    //insert controllers to call here
    private LoginController logincontroller;
    private HomePageController homePagecontroller;
    private PatRegistrationController patientregistrationcontroller;
    private ChangePatientController changepatientcontroller;
    private FindPatientController findpatientcontroller;
    private StaffRegistrationController staffregistrationcontroller;
    private StaffChangeController staffchangecontroller;
    private PatRegistration patregistration;
    private AdmitMoveController admitmovecontroller;
    private StaffRegistration staffregistration;
    private FacilityStatusController facilitystatuscontroller;
    private ParticipationListsController participationlistscontroller;
    private PatChange patchange;
    private StaffChange staffchange;
    private FindPatientModel findpatientmodel;
    private AdmitMove admitmove;
    private FindStaffModel findstaffmodel;
    private FindStaffController findstaffcontroller;
    private FacilityStatusModel facilitystatusmodel;




    public void login(){
        logincontroller = new LoginController();
        logincontroller.display();
    }

    public void HomePage(Session s){
        homePagecontroller = new HomePageController(s);
        HomePageView h = new HomePageView(homePagecontroller);
        homePagecontroller.setView(h);
        homePagecontroller.display();
    }

    public void registration(HomePageView hview, HashMapData hmd){
        patregistration = new PatRegistration(hmd);
        patientregistrationcontroller = new PatRegistrationController(patregistration);
        PatientRegistrationView view = new PatientRegistrationView(patientregistrationcontroller);
        patientregistrationcontroller.setView(view,hview);
        patientregistrationcontroller.display();
    }

    public void changePatient(HomePageView hview, HashMapData hmd){
        patchange = new PatChange(hmd);
        changepatientcontroller = new ChangePatientController(patchange);
        ChangePatientView view = new ChangePatientView(changepatientcontroller);
        changepatientcontroller.setView(view,hview);
        changepatientcontroller.display();
        changepatientcontroller.displayOptionPane(view);
    }

    public void findPatient(HomePageView hview, HashMapData hmd){
        findpatientmodel = new FindPatientModel(hmd);
        findpatientcontroller = new FindPatientController(findpatientmodel);
        FindPatientView view = new FindPatientView(findpatientcontroller);
        findpatientcontroller.setView(view,hview);
        findpatientcontroller.display();
    }

    public void admitMove(HomePageView hview, HashMapData hmd){
        admitmove = new AdmitMove(hmd);
        admitmovecontroller = new AdmitMoveController(admitmove);
        AdmitMoveView view = new AdmitMoveView(admitmovecontroller);
        admitmovecontroller.setView(view,hview);
        admitmovecontroller.display();
    }

    public void staffRegistration(HomePageView hview, StaffMap sm){
        staffregistration = new StaffRegistration(sm);
        staffregistrationcontroller = new StaffRegistrationController(staffregistration);
        StaffRegistrationView view = new StaffRegistrationView(staffregistrationcontroller);
        staffregistrationcontroller.setView(view, hview);
        staffregistrationcontroller.display();
    }


    public void staffChange(HomePageView hview, StaffMap sm){
        staffchange = new StaffChange(sm);
        staffchangecontroller = new StaffChangeController(staffchange);
        StaffChangeView view = new StaffChangeView(staffchangecontroller);
        staffchangecontroller.setView(view, hview);
        staffchangecontroller.display();
        staffchangecontroller.displayOptionPane(view);
    }

    public void facilityStatus(HomePageView hview, HashMapData hmd){
        facilitystatusmodel = new FacilityStatusModel(hmd);
        facilitystatuscontroller = new FacilityStatusController(facilitystatusmodel);
        FacilityStatusView view = new FacilityStatusView(facilitystatuscontroller);
        facilitystatuscontroller.setView(view,hview);
        facilitystatuscontroller.display();
    }

    public void participationLists(HomePageView hview){
        participationlistscontroller = new ParticipationListsController();
        ParticipationListsView view = new ParticipationListsView(participationlistscontroller);
        participationlistscontroller.setView(view,hview);
        participationlistscontroller.display();
    }

    public void findStaff(HomePageView hview,StaffMap sm){
        findstaffmodel = new FindStaffModel(sm);
        findstaffcontroller = new FindStaffController(findstaffmodel);
        FindStaffView view = new FindStaffView(findstaffcontroller);
        findstaffcontroller.setView(view,hview);
        findstaffcontroller.display();
    }


    public static void main(String[] args){
        ApplicationController app = new ApplicationController();
        app.login();
    }
}
