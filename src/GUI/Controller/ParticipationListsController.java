package GUI.Controller;

import GUI.View.HomePageView;
import GUI.View.ParticipationListsView;



public class ParticipationListsController {

    private HomePageView hview;
    private ParticipationListsView view;

    void setView(ParticipationListsView view, HomePageView hview) {
        this.view = view;
        this.hview = hview;
    }

    void display() {
        view.setVisible(true);
    }

    public void returnHome(){
        view.dispose();
        hview.setVisible(true);

    }

}
