package GUI.Controller;

import GUI.View.FacilityStatusView;
import GUI.View.HomePageView;
import GUI.View.ParticipationListsView;
import GUI.View.PersonInfoView;
import Hospital.src.main.java.Hospital.HashMapData;


public class ParticipationListsController {

    private HomePageView hview;
    private ParticipationListsView view;

    public void setView(ParticipationListsView view, HomePageView hview) {
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

}
