package GUI.View;

import GUI.Controller.PatRegistrationController;

import javax.swing.*;
import javax.swing.text.DateFormatter;
import javax.swing.text.DefaultFormatterFactory;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class PatientRegistrationView extends PatientInfoView {

    private PatRegistrationController controller;
    private JButton clicktoregister, home;
    private JPanel panel;
    private JButton cleartext;


    public PatientRegistrationView(PatRegistrationController controller){
        super("Please enter Patient Data: ", controller);
        this.controller = controller;
        initGUI();
    }

    public void initGUI(){
        setTitle("Registration Form");
        panel = getPanel();
        setMinimumSize(new Dimension(550, 600));

        //Button
        cleartext = new JButton("Clear Text");
        cleartext.setBounds(200, 500, 138, 30);
        cleartext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clear(getPatientTextFields(),8);
            }
        });
        panel.add(cleartext);

        clicktoregister = new JButton("Register");
        clicktoregister.setBounds(50,500,138,30);
        clicktoregister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.check(getPatientTextFields());
            }
        });
        panel.add(clicktoregister);
        add(panel);

        pack();
        setLocationRelativeTo(null);

    }
}
