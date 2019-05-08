package GUI.View;

import GUI.Controller.PersonController;

import javax.swing.*;
import java.awt.*;

public class PersonInfoView extends JFrame{

    private JTextField name, surname;
    private JPanel panel;
    protected PatientInfoView view;
    private PersonController controller;

    // superclass for basic information common to staff and patients, person controller used as superclass in controller package
    PersonInfoView(String toplabelinput, PersonController controller){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.controller = controller;
        this.panel = setDefaults();
        addpersonLabels(panel, toplabelinput);
        setPersonTextfields(panel);
    }
    // setting default size etc. common to all subclasses
    private JPanel setDefaults(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(900, 650);
        setLayout(null);
        setBackground(Color.WHITE);
        setSize(970, 700);
        setMinimumSize(new Dimension(550, 600));
        return panel;
    }

    // setting labels common to staff and patients
    private void addpersonLabels(JPanel panel, String headlabel){
        JLabel toplabel = new JLabel(headlabel);
        toplabel.setFont(new Font("Arial", Font.BOLD, 15));
        toplabel.setBounds(50,20,350,40);
        panel.add(toplabel);

        JLabel namelabel = new JLabel("Name");
        namelabel.setBounds(50, 80, 150, 40);
        panel.add(namelabel);

        JLabel surnamelabel = new JLabel("Surname");
        surnamelabel.setBounds(50, 140, 150, 40);
        panel.add(surnamelabel);

    }

    //adding common textfields
    private void setPersonTextfields(JPanel panel) {
        name = new JTextField();
        name.setBounds(200, 80, 180, 30);
        panel.add(name);

        surname = new JTextField();
        surname.setBounds(200, 140, 180, 30);
        panel.add(surname);
    }

    //setting common buttons
    void buttonAdder(JPanel panel, JTextField[] fields){
        JButton cleartext = new JButton("Clear Text");
        cleartext.setBounds(200, 550, 140, 30);
        cleartext.addActionListener(e -> {
            //controller.clear(fields);
        });
        panel.add(cleartext);

        add(panel);
        JButton home = new JButton("Home");
        home.setBounds(350, 500, 138, 30);
        home.addActionListener(e -> controller.returnHome());
        panel.add(home);
    }


    //getter so subclasses are able to edit same panel that buttons, labelts etc are held on
    public JPanel getPanel(){
        return panel;
    }

    //returns JTextfields for easier information retrieval
    JTextField[] getTextFields(){
        JTextField[] fields = new JTextField[2];
        fields[0] = name;
        fields[1] = surname;
        return fields;
    }
}
