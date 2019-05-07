package GUI.Controller;

import GUI.View.AdmitMoveView;
import GUI.View.HomePageView;

import javax.swing.*;

public class AdmitMoveController{

    private AdmitMoveView view;
    private HomePageView hview;

    public void setView(AdmitMoveView view, HomePageView hview){
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

    public void admit(JTextField id,JTextField dep,JTextField bed){}

    public void move(JTextField id,JTextField dep,JTextField bed){}
}
