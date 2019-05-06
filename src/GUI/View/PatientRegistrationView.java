package GUI.View;

import GUI.Controller.PatRegistrationController;
import sun.java2d.windows.GDIRenderer;

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
