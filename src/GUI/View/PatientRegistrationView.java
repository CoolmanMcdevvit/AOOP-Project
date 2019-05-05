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
    private JLabel toplabel;
    private JButton clicktoregister, home;
    private JPanel panel;


    public PatientRegistrationView(PatRegistrationController controller){
        this.controller = controller;
        initGUI();
    }

    public void initGUI(){
        System.out.println(view);
        setTitle("Registration Form");
        panel = getPanel();
        setMinimumSize(new Dimension(550, 600));

        //Add label
        toplabel = new JLabel("Please enter Patient Data: ");
        toplabel.setFont(new Font("Arial", Font.BOLD, 15));
        toplabel.setBounds(50,20,350,40);
        panel.add(toplabel);


        //Button
        clicktoregister = new JButton("Register");
        clicktoregister.setBounds(50,500,138,30);
        clicktoregister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.check(getTextFieldsValues());
            }
        });
        panel.add(clicktoregister);
        add(panel);
        home = new JButton("Home");
        home.setBounds(350, 500, 138, 30);
        home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                controller.returnHome();
            }
        });
        panel.add(home);
        pack();
        setLocationRelativeTo(null);

    }
}
