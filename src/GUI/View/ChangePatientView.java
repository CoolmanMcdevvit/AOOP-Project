package GUI.View;

import GUI.Controller.ChangePatientController;
import GUI.Controller.PatRegistrationController;
import Hospital.src.main.java.Hospital.Patient;

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
    private JButton clicktomodify;
    private JPanel panel;

    public ChangePatientView(ChangePatientController controller){
        super("Update Patient Data: ", controller);
        this.controller = controller;
        initGUI();
    }

    public void initGUI(){
        setTitle("Change Patient Form");
        panel = getPanel();

        //Button
        clicktomodify = new JButton("Update");
        clicktomodify.setBounds(50,500,138,30);
        clicktomodify.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.update(getPatientTextFields());
            }
        });

        panel.add(clicktomodify);
        add(panel);
        pack();
    }

    public void setTextfields(Patient p){
        JTextField[] f =  getPatientTextFields();
        f[0].setText(p.getFirstname());
        f[1].setText(p.getLastname());
        f[2].setText(p.getBirthDay());
        f[3].setText(p.getBirthMonth());
        f[4].setText(p.getBirthYear());
        f[5].setText(p.getAddress());
        f[6].setText(p.getPhonenumberString());
        f[7].setText(p.getTribe());
        f[8].setText(p.getAlivestatus());
    }
}
