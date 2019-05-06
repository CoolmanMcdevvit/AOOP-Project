package GUI.View;

import GUI.Controller.PersonController;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class PersonInfoView extends JFrame{

    private JLabel namelabel, surnamelabel, birthdatelabel, homeadresslabel,phonenumberlabel;
    protected JLabel toplabel;
    private JTextField name, surname,homeaddress,phonenumber, field7, field8;
    private JFormattedTextField bdd, bdm, bdy;
    private JPanel panel;
    protected PatientInfoView view;
    private JButton cleartext, home;
    private PersonController controller;

    public PersonInfoView(String toplabelinput, PersonController controller){
        this.controller = controller;
        this.panel = setDefaults();
        addpersonLabels(panel, toplabelinput);
        setPersonTextfields(panel);
    }

    public void addpersonLabels(JPanel panel, String headlabel){
        toplabel = new JLabel(headlabel);
        toplabel.setFont(new Font("Arial", Font.BOLD, 15));
        toplabel.setBounds(50,20,350,40);
        panel.add(toplabel);

        namelabel = new JLabel("Name");
        namelabel.setBounds(50, 80, 150, 40);
        panel.add(namelabel);

        surnamelabel = new JLabel("Surname");
        surnamelabel.setBounds(50, 140, 150, 40);
        panel.add(surnamelabel);

        birthdatelabel = new JLabel("Birth Date");
        birthdatelabel.setBounds(50, 200, 150, 40);
        panel.add(birthdatelabel);

        homeadresslabel = new JLabel("Home Address");
        homeadresslabel.setBounds(50, 260, 150, 40);
        panel.add(homeadresslabel);

        phonenumberlabel = new JLabel("Phone Number");
        phonenumberlabel.setBounds(50, 320, 150, 40);
        panel.add(phonenumberlabel);
    }

    public void setPersonTextfields(JPanel panel) {
        name = new JTextField();
        name.setBounds(200, 80, 180, 30);
        panel.add(name);

        surname = new JTextField();
        surname.setBounds(200, 140, 180, 30);
        panel.add(surname);

        bdd = new JFormattedTextField(new SimpleDateFormat("dd"));
        bdd.setBounds(200, 200, 60, 30);
        panel.add(bdd);

        bdm = new JFormattedTextField(new SimpleDateFormat("mm"));
        bdm.setBounds(260, 200, 60, 30);
        panel.add(bdm);

        bdy = new JFormattedTextField(new SimpleDateFormat("yyyy"));
        bdy.setBounds(320, 200, 60, 30);
        panel.add(bdy);

        homeaddress = new JTextField();
        homeaddress.setBounds(200, 260, 180, 30);
        panel.add(homeaddress);

        phonenumber = new JTextField();
        phonenumber.setBounds(200, 320, 180, 30);
        panel.add(phonenumber);

        field7 = new JTextField();
        field7.setBounds(200, 380, 180, 30);
        panel.add(field7);


        field8 = new JTextField();
        field8.setBounds(200, 440, 180, 30);
        panel.add(field8);
    }

    public void buttonAdder(JPanel panel, JTextField[] fields){
        cleartext = new JButton("Clear Text");
        cleartext.setBounds(200, 500, 138, 30);
        cleartext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.clear(fields);
            }
        });
        panel.add(cleartext);

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
    }

    public JPanel setDefaults(){
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(900, 650);
        setLayout(null);
        setBackground(Color.WHITE);
        setSize(970, 700);
        setMinimumSize(new Dimension(550, 600));
        return panel;
    }


    public JPanel getPanel(){
        return panel;
    }

    public JTextField[] getTextFields(){
        JTextField[] fields = new JTextField[9];
        fields[0] = name;
        fields[1] = surname;
        fields[2] = bdd;
        fields[3] = bdm;
        fields[4] = bdy;
        fields[5] = homeaddress;
        fields[6] = phonenumber;
        fields[7] = field7;
        fields[8] = field8;
        return fields;
    }
}
