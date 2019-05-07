package GUI.View;

import GUI.Controller.ChangePatientController;
import GUI.Controller.PatRegistrationController;
import sun.java2d.windows.GDIRenderer;

import javax.swing.*;
import javax.swing.text.DateFormatter;
import javax.swing.text.DefaultFormatterFactory;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;


public class ChangePatientView extends PatientInfoView {

    private ChangePatientController controller;
    private JLabel toplabel;
    private JButton clicktomodify, home;
    private JPanel panel;
    private ChangePatientView view;

    public ChangePatientView(ChangePatientController controller){
        super("Registration Form", controller);
        this.controller = controller;
        initGUI();
    }

    public void initGUI(){
        setTitle("Registration Form");
        panel = getPanel();

        //Button
        clicktomodify = new JButton("Update");
        clicktomodify.setBounds(50,500,138,30);
        clicktomodify.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //controller.check(getTextFields());
            }
        });

        panel.add(clicktomodify);
        add(panel);
        pack();
    }
}
