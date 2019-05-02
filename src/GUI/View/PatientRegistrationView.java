package GUI.View;

import GUI.Controller.PatRegistrationController;

import javax.swing.*;
import javax.swing.text.DateFormatter;
import javax.swing.text.DefaultFormatterFactory;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;


public class PatientRegistrationView extends JFrame {

    private PatRegistrationController controller;
    private JTextField name, surname, birthdate,homeaddress,phonenumber,tribe,alivedead;
    private JFormattedTextField bdd, bdm, bdy;
    private JButton clicktoregister;

    public PatientRegistrationView(PatRegistrationController controller){
        this.controller = controller;
        initGUI();
    }

    public void initGUI(){
        // Stops program on close
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //sets title of window
        setTitle("Patient Registration");

        // for "header" of frame
        JPanel panel = new JPanel();
        //defines layout
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        JLabel panelheader = new JLabel("Please enter patient data");
        panelheader.setFont(new Font("Arial", Font.BOLD, 15));
        gc.gridx = 0; gc.gridy = 0; gc.ipady = 30; gc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(panelheader, gc);
        gc.gridy = 1; gc.ipady = 0; gc.anchor = GridBagConstraints.WEST; gc.fill = GridBagConstraints.NONE;
        panel.add(new JLabel("Name: "),gc);
        gc.gridy = 2;
        panel.add(new JLabel("Surname: "),gc);
        gc.gridy = 3;
        panel.add(new JLabel("Birth date (dd.mm.yyyy): "),gc);
        gc.gridy = 4;
        panel.add(new JLabel("Home Address: "),gc);
        gc.gridy = 5;
        panel.add(new JLabel("Phone Number: "),gc);
        gc.gridy = 6;
        panel.add(new JLabel("Tribe: "),gc);
        gc.gridy = 7;
        panel.add(new JLabel("Alive / Dead: "),gc);
        name = new JTextField();
        surname = new JTextField();
        homeaddress = new JTextField();
        phonenumber = new JTextField();
        tribe = new JTextField();
        alivedead = new JTextField();
        bdd = new JFormattedTextField(new DefaultFormatterFactory(new DateFormatter(new SimpleDateFormat("dd"))));
        bdm = new JFormattedTextField(new DefaultFormatterFactory(new DateFormatter(new SimpleDateFormat("mm"))));
        bdy = new JFormattedTextField(new DefaultFormatterFactory(new DateFormatter(new SimpleDateFormat("yyyy"))));
        gc.gridy = 1; gc.gridx=1; gc.ipadx = 90; gc.fill = GridBagConstraints.REMAINDER;
        panel.add(name,gc);
        gc.gridy = 2; gc.fill = GridBagConstraints.REMAINDER;
        panel.add(surname,gc);
        gc.gridy = 3; gc.fill = GridBagConstraints.REMAINDER;
        panel.add(bdd,gc);
        gc.gridy = 4; gc.gridx=1;
        panel.add(bdm,gc);
        gc.gridx=2;
        panel.add(bdy,gc);
        gc.gridx=3;
        panel.add(homeaddress,gc);
        gc.gridy = 5; gc.gridx=1;  gc.fill = GridBagConstraints.REMAINDER;
        panel.add(phonenumber,gc);
        gc.gridy = 6; gc.fill = GridBagConstraints.REMAINDER;
        panel.add(tribe,gc);
        gc.gridy = 7; gc.fill = GridBagConstraints.REMAINDER;
        panel.add(alivedead,gc);
        clicktoregister = new JButton("Register Patient");
        clicktoregister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.checkPatientReg(name.getText(), surname.getText(), bdd.getText(),bdm.getText(),bdy.getText(), homeaddress.getText(), phonenumber.getText(), tribe.getText(), alivedead.getText());
            }
        });
        gc.gridx=1; gc.gridy= 8;
        panel.add(clicktoregister,gc);
    }
}
