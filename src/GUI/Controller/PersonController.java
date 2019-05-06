package GUI.Controller;

import GUI.View.HomePageView;
import GUI.View.PersonInfoView;

import javax.swing.*;

public class PersonController {

    private HomePageView hview;
    private PersonInfoView view;


    public void setView(PersonInfoView view, HomePageView hview) {
        this.view = view;
        this.hview = hview;
    }

    public void display() {
        view.setVisible(true);
    }

    public void returnHome() {
        view.dispose();
        hview.setVisible(true);
    }

    public void clear(JTextField[] fields) {
        for (int i = 0; i < 9; i++) {
            fields[i].setText("");
        }
    }
}
