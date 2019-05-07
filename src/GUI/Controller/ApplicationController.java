package GUI.Controller;

import GUI.Model.FindPatientModel;
import GUI.Model.PatRegistration;
import GUI.Model.Session;
import GUI.Model.*;
import GUI.View.*;
import Hospital.src.main.java.Hospital.HashMapData;
import Hospital.src.main.java.Hospital.StaffMap;


public class ApplicationController {



    // initial login view, creates login controller and calls display method
    public void login(){
        //insert controllers to call here
        LoginController logincontroller = new LoginController();
        logincontroller.display();
    }

    //Main Page with access to all other views (excl Login)
    public void HomePage(Session s){
        //Creates Homepage controller
        HomePageController homePagecontroller = new HomePageController(s);
        //assigns Homepagecontroller to Homepageview constructor
        HomePageView h = new HomePageView(homePagecontroller);
        //sets variables then displays view
        homePagecontroller.setView(h);
        homePagecontroller.display();
    }

    // requires HashMap class (holds Patient information) to be part of Registration constructor to ensure that same hashmap is always worked on.
    public void registration(HomePageView hview, HashMapData hmd){
        //passing HashMapData class to Registration model so it is able to manipulate the data
        PatRegistration patregistration = new PatRegistration(hmd);
        //same prinicple as HomePage
        PatRegistrationController patientregistrationcontroller = new PatRegistrationController(patregistration);
        PatientRegistrationView view = new PatientRegistrationView(patientregistrationcontroller);
        patientregistrationcontroller.setView(view,hview);
        patientregistrationcontroller.display();
    }


    // all below share same principle as the registration method
    public void changePatient(HomePageView hview, HashMapData hmd){
        //insert models here
        PatChange patchange = new PatChange(hmd);
        ChangePatientController changepatientcontroller = new ChangePatientController(patchange);
        ChangePatientView view = new ChangePatientView(changepatientcontroller);
        changepatientcontroller.setView(view,hview);
        changepatientcontroller.display();
        changepatientcontroller.displayOptionPane(view);
    }

    public void findPatient(HomePageView hview, HashMapData hmd){
        FindPatientModel findpatientmodel = new FindPatientModel(hmd);
        FindPatientController findpatientcontroller = new FindPatientController(findpatientmodel);
        FindPatientView view = new FindPatientView(findpatientcontroller);
        findpatientcontroller.setView(view,hview);
        findpatientcontroller.display();
    }

    public void admitMove(HomePageView hview, HashMapData hmd){
        AdmitMove admitmove = new AdmitMove(hmd);
        AdmitMoveController admitmovecontroller = new AdmitMoveController(admitmove);
        AdmitMoveView view = new AdmitMoveView(admitmovecontroller);
        admitmovecontroller.setView(view,hview);
        admitmovecontroller.display();
    }

    public void staffRegistration(HomePageView hview, StaffMap sm){
        StaffRegistration staffregistration = new StaffRegistration(sm);
        StaffRegistrationController staffregistrationcontroller = new StaffRegistrationController(staffregistration);
        StaffRegistrationView view = new StaffRegistrationView(staffregistrationcontroller);
        staffregistrationcontroller.setView(view, hview);
        staffregistrationcontroller.display();
    }


    public void staffChange(HomePageView hview, StaffMap sm){
        StaffChange staffchange = new StaffChange(sm);
        StaffChangeController staffchangecontroller = new StaffChangeController(staffchange);
        StaffChangeView view = new StaffChangeView(staffchangecontroller);
        staffchangecontroller.setView(view, hview);
        staffchangecontroller.display();
        staffchangecontroller.displayOptionPane(view);
    }

    public void facilityStatus(HomePageView hview, HashMapData hmd){
        FacilityStatusModel facilitystatusmodel = new FacilityStatusModel(hmd);
        FacilityStatusController facilitystatuscontroller = new FacilityStatusController(facilitystatusmodel);
        FacilityStatusView view = new FacilityStatusView(facilitystatuscontroller);
        facilitystatuscontroller.setView(view,hview);
        facilitystatuscontroller.display();
    }

    public void participationLists(HomePageView hview){
        ParticipationListsController participationlistscontroller = new ParticipationListsController();
        ParticipationListsView view = new ParticipationListsView(participationlistscontroller);
        participationlistscontroller.setView(view,hview);
        participationlistscontroller.display();
    }

    public void findStaff(HomePageView hview,StaffMap sm){
        FindStaffModel findstaffmodel = new FindStaffModel(sm);
        FindStaffController findstaffcontroller = new FindStaffController(findstaffmodel);
        FindStaffView view = new FindStaffView(findstaffcontroller);
        findstaffcontroller.setView(view,hview);
        findstaffcontroller.display();
    }


    // pushing the update database button will show either update or unsucessfull depending on outcome
    public void updateDatabase(){
        //Let's call function here


    }

    // main argument to launch GUI
    public static void main(String[] args){
        ApplicationController app = new ApplicationController();
        app.login();
    }
}
