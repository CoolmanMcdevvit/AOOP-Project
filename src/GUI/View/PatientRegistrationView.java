package GUI.View;

import GUI.Controller.PatRegistrationController;

import javax.swing.*;
import java.awt.*;


public class PatientRegistrationView extends PatientInfoView {

    private PatRegistrationController controller;


    public PatientRegistrationView(PatRegistrationController controller){
        super("Please enter Patient Data: ", controller);
        this.controller = controller;
        initGUI();
    }

    public void initGUI(){
        setTitle("Registration Form");
        JPanel panel = getPanel();
        setMinimumSize(new Dimension(550, 600));

        //Button
        JButton cleartext = new JButton("Clear Text");
        cleartext.setBounds(200, 500, 138, 30);
        cleartext.addActionListener(e -> controller.clear(getPatientTextFields(),8));
        panel.add(cleartext);

        JButton clicktoregister = new JButton("Register");
        clicktoregister.setBounds(50,500,138,30);
        clicktoregister.addActionListener(e -> controller.check(getPatientTextFields()));
        panel.add(clicktoregister);
        add(panel);

        pack();
        setLocationRelativeTo(null);

    }
}
