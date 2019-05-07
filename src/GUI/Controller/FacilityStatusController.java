package GUI.Controller;

import GUI.View.FacilityStatusView;
import GUI.View.HomePageView;
import GUI.View.PersonInfoView;
import Hospital.src.main.java.Hospital.HashMapData;

public class FacilityStatusController {

    private HomePageView hview;
    private FacilityStatusView view;

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
    public int fillWithNumbers(String s){

        HashMapData hm = new HashMapData();
        return hm.OccupiedBeds(s);

    }
}
