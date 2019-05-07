package GUI.Controller;

import GUI.Model.FacilityStatusModel;
import GUI.View.FacilityStatusView;
import GUI.View.HomePageView;
import GUI.View.PersonInfoView;
import Hospital.src.main.java.Hospital.HashMapData;
import Hospital.src.main.java.Hospital.Patient;

import java.util.HashMap;

public class FacilityStatusController {

    private HomePageView hview;
    private FacilityStatusView view;
    private FacilityStatusModel model;
    private Integer numofbeds;

    // defining model as private variable in FacilityStatusCOntroller
    public FacilityStatusController(FacilityStatusModel model){
        this.model  = model;
    }


    //assigns FacilityStatus and Homepage views as attributes to class
    public void setView(FacilityStatusView view, HomePageView hview) {
        this.view = view;
        this.hview = hview;
    }

    // sets FacilityStatusView as visible
    public void display() {
        view.setVisible(true);
    }


    // when home button pressed closes FacilityStatusview and sets homepageview as visible
    public void returnHome(){
        view.dispose();
        hview.setVisible(true);
    }

    //returns the number of beds that are in use in the requested department
    public int getNumbers(String s){
        numofbeds = model.fillWithNumbers(s);
        return numofbeds;
    }

}
