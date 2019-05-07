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

    public FacilityStatusController(FacilityStatusModel model){
        this.model  = model;
    }

    public void setView(FacilityStatusView view, HomePageView hview) {
        this.view = view;
        this.hview = hview;
    }

    public void display() {
        view.setVisible(true);
    }

    public void returnHome(){
        view.dispose();
        hview.setVisible(true);
    }

    public int getNumbers(String s){
        numofbeds = model.fillWithNumbers(s);
        return numofbeds;
    }

}
