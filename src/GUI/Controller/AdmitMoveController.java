package GUI.Controller;

import GUI.Model.AdmitMove;
import GUI.View.AdmitMoveView;
import GUI.View.HomePageView;


public class AdmitMoveController{

    private AdmitMoveView view;
    private HomePageView hview;
    private AdmitMove model;

    //Passes model as constructor to controller to allow communication between classes
    AdmitMoveController(AdmitMove mdl){
        this.model = mdl;
    }
    //sets view and homepage view variables
    void setView(AdmitMoveView view, HomePageView hview){
        this.view = view;
        this.hview = hview;
    }

    //sets homepageview as not visible then sets AdmitMoveView as visible
    void display() {
        hview.setVisible(false);
        view.setVisible(true);
    }

    //when homepage button pressed this closes the AdmitMoveView then makes homepageview visible again
    public void returnHome() {
        view.dispose();
        hview.setVisible(true);
    }

    // admits patient to department and bed
    public void admit(String id,String dep,String bed){
        // checks if fields have non-blank string values before sending to model
        if(!id.equals("") && !dep.equals("") && !bed.equals("")){
            model.admitPatient(id,dep,bed);
        }
    }
    //changes patients department and bed
    public void move(String id,String dep,String bed){
        // checks if fields have non-blank string values before sending to model
        if(!id.equals("") && !dep.equals("") && !bed.equals("")){
            model.movePatient(id,dep,bed);
        }
    }
    //removes patients from hospital department and bed number
    public void dischargePatient(String id){
        if(!id.equals("")){
            model.dischargePatient(id);
        }
    }
}
