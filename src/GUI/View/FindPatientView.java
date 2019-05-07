package GUI.View;

import GUI.Controller.FindPatientController;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FindPatientView extends FindView{

    private JScrollPane resultspanel;
    private JLabel searchlabel;
    private JButton searchbutton;
    private JTable resultstable;
    private TableModel tablemodel;
    private FindPatientController controller;
    private JPanel panel;


    public FindPatientView(FindPatientController controller){
        super(controller);
        this.controller = controller;
        this.panel = getPanel();
        addButton(panel);

    }

    public void addButton(JPanel panel){
        searchbutton = new JButton("Search");
        searchbutton.setBounds(160,70,160,30);
        searchbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                tablemodel = controller.findPatient(getRadiobuttons().getSelection().getActionCommand(),getTextfield().getText());
                resultstable = new JTable(tablemodel);
                resultstable.setBounds(30,180,850,350);
                resultspanel = new JScrollPane(resultstable);
                resultspanel.setBounds(5,150,850,400);
                add(resultspanel);

            }
        });
        panel.add(searchbutton);
        add(panel);
        pack();
    }

}
