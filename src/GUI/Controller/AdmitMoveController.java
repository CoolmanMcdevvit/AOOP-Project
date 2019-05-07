package GUI.Controller;

import GUI.Model.AdmitMove;
import GUI.View.AdmitMoveView;
import GUI.View.HomePageView;

import javax.swing.*;

public class AdmitMoveController{

    private AdmitMoveView view;
    private HomePageView hview;
    private AdmitMove model;

    AdmitMoveController(AdmitMove mdl){
        this.model = mdl;
    }
    public void setView(AdmitMoveView view, HomePageView hview){
        this.view = view;
        this.hview = hview;
    }

    public void display() {
        hview.setVisible(false);
        view.setVisible(true);
    }

    public void returnHome() {
        view.dispose();
        hview.setVisible(true);
    }

    public void admit(String id,String dep,String bed){
        if(!id.equals("") && !dep.equals("") && !bed.equals("")){
            model.admitPatient(id,dep,bed);
        }
    }

    public void move(String id,String dep,String bed){
        if(!id.equals("") && !dep.equals("") && !bed.equals("")){
            model.movePatient(id,dep,bed);
        }
    }
}
