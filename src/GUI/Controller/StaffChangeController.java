package GUI.Controller;

import GUI.View.HomePageView;
import GUI.View.StaffChangeView;

import javax.swing.*;

public class StaffChangeController extends PersonController {

    public HomePageView hview;
    public StaffChangeView view;

    public void check(JTextField[] j){

    }

    public void display(){
        String uidsearch = JOptionPane.showInputDialog("please enter UID of Patient");
        // call model to search for uidsearch
        view.setVisible(true);}


    public void setView(StaffChangeView view, HomePageView hview){
        this.view = view;
        this.hview = hview;
    }

}
