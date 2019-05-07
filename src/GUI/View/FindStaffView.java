package GUI.View;

import GUI.Controller.FindStaffController;

import javax.swing.*;
import javax.swing.table.TableModel;

public class FindStaffView extends FindView {

    private JScrollPane resultspanel;
    private JTable resultstable;
    private TableModel tablemodel;
    private FindStaffController controller;


    public FindStaffView(FindStaffController controller){
        super(controller);
        this.controller = controller;
        JPanel panel = getPanel();
        addButton(panel);
    }

    private void addButton(JPanel panel){
        JButton searchbutton = new JButton("Search");
        searchbutton.setBounds(160,70,160,30);
        searchbutton.addActionListener(e -> {
            tablemodel = controller.findStaff(getRadiobuttons().getSelection().getActionCommand(),getTextfield().getText());
            resultstable = new JTable(tablemodel);
            resultstable.setBounds(30,180,850,350);
            resultspanel = new JScrollPane(resultstable);
            resultspanel.setBounds(5,150,850,400);
            add(resultspanel);

        });
        panel.add(searchbutton);
        add(panel);
        pack();
    }
}
