package GUI.Controller;

import GUI.View.FindView;
import GUI.View.HomePageView;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class FindController {

    private FindView view;
    private HomePageView hview;

    public void setView(FindView view, HomePageView hview){
        this.view = view;
        this.hview = hview;
    }

    public void display(){
        view.setVisible(true);
    }

    public void returnHome(){
        view.dispose();
        hview.setVisible(true);
    }

}
