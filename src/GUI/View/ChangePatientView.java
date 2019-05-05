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
    private ChangePatientView v;

    public ChangePatientView(ChangePatientController controller){
        super.view = v;
        this.controller = controller;
        initGUI();
    }

    public void initGUI(){
        setTitle("Registration Form");
        panel = getPanel();
        //Add  top label
        toplabel = new JLabel("Please change Patient Data: ");
        toplabel.setFont(new Font("Arial", Font.BOLD, 15));
        toplabel.setBounds(50,20,350,40);
        panel.add(toplabel);
        //Button
        clicktomodify = new JButton("Update");
        clicktomodify.setBounds(50,500,138,30);
        clicktomodify.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.check(getTextFieldsValues());
            }
        });
        home = new JButton("Home");
        home.setBounds(350, 500, 138, 30);
        home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                controller.returnHome();
            }
        });
        panel.add(home);

        panel.add(clicktomodify);
        add(panel);
        pack();
    }
}
