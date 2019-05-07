package GUI.Controller;

import GUI.View.FindView;
import GUI.View.HomePageView;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

//superclass controller for Find controllers
public class FindController {

    private FindView view;
    private HomePageView hview;

    //sets FindViews and Homepageview  as Attributes to class
    public void setView(FindView view, HomePageView hview){
        this.view = view;
        this.hview = hview;
    }

    // Sets Findviews as visible
    public void display(){
        view.setVisible(true);
    }

    //when home button pressed in FindView's closes the FindView window and sets homepageview as visible
    public void returnHome(){
        view.dispose();
        hview.setVisible(true);
    }

}
