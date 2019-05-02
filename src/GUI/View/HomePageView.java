package GUI.View;


import GUI.Controller.HomePageController;

import javax.swing.*;
import javax.swing.text.DateFormatter;
import javax.swing.text.DefaultFormatterFactory;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class HomePageView extends JFrame{
    private JTextField name, surname, birthdate,homeaddress,phonenumber,tribe,alivedead;
    private JFormattedTextField bd;
    private JButton patregbutton,patchangebutton , patfindbutton, admissionbutton;
    private HomePageController controller;


    public HomePageView(){
        initGUI();
    }

    public HomePageView(HomePageController controller){
        this.controller = controller;
    }

    public void initGUI(){
        // Stops program on close
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //defines layout
        setLayout(new GridBagLayout());
        //sets title of window
        setTitle("Hospital Management System");

        // for "headder" of frame
        JPanel toppanel = new JPanel(new FlowLayout(FlowLayout.LEFT,10,20));
        toppanel.setBackground(Color.BLUE);
        JLabel head = new JLabel("Hospital Management");
        head.setFont(new Font("Arial", Font.PLAIN, 18));
        toppanel.add(head);

        // creates new panel to add buttons to
        JPanel p1 = new JPanel();
        // defines layout of panel
        p1.setLayout(new GridBagLayout());

        // Set button values
        patregbutton = new JButton("Patient Registration");
        patchangebutton = new JButton("Change Patient Information");
        patfindbutton = new JButton("Find Patient");
        admissionbutton = new JButton("Admit patient");

        //defines what to do on button press
        patregbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.

            }
        });
//        JLabel panelheader = new JLabel("Please enter patient data");
//        panelheader.setFont(new Font("Arial", Font.BOLD, 15));
//        gc.gridx = 0; gc.gridy = 0; gc.ipady = 30; gc.fill = GridBagConstraints.HORIZONTAL;
//        p1.add(panelheader, gc);
//        gc.gridy = 1; gc.ipady = 0; gc.anchor = GridBagConstraints.WEST; gc.fill = GridBagConstraints.NONE;
//        p1.add(new JLabel("Name: "),gc);
//        gc.gridy = 2;
//        p1.add(new JLabel("Surname: "),gc);
//        gc.gridy = 3;
//        p1.add(new JLabel("Birth date (dd.mm.yyyy): "),gc);
//        gc.gridy = 4;
//        p1.add(new JLabel("Home Address: "),gc);
//        gc.gridy = 5;
//        p1.add(new JLabel("Phone Number: "),gc);
//        gc.gridy = 6;
//        p1.add(new JLabel("Tribe: "),gc);
//        gc.gridy = 7;
//        p1.add(new JLabel("Alive / Dead: "),gc);
//        name = new JTextField();
//        surname = new JTextField();
//        homeaddress = new JTextField();
//        phonenumber = new JTextField();
//        tribe = new JTextField();
//        alivedead = new JTextField();
//        bd = new JFormattedTextField(new DefaultFormatterFactory(new DateFormatter(new SimpleDateFormat("dd/mm/yyyy"))));
//        gc.gridy = 1; gc.gridx=1; gc.ipadx = 90; gc.fill = GridBagConstraints.HORIZONTAL;
//        p1.add(name,gc);
//        gc.gridy = 2;
//        p1.add(surname,gc);
//        gc.gridy = 3;
//        p1.add(bd,gc);
//        gc.gridy = 4;
//        p1.add(homeaddress,gc);
//        gc.gridy = 5;
//        p1.add(phonenumber,gc);
//        gc.gridy = 6;
//        p1.add(tribe,gc);
//        gc.gridy = 7;
//        p1.add(alivedead,gc);
//        patregbutton = new JButton("Register Patient");
//        patregbutton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                controller.checkPatientReg(name.getText(), surname.getText(), bd.getText(), homeaddress.getText(), phonenumber.getText(), tribe.getText(), alivedead.getText());
//            }
//        });
//        gc.gridx=1; gc.gridy= 8;
//        p1.add(patregbutton,gc);
//
//        patsearchbutton = new JButton("Search");
//        patsearchbutton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                //HomePageController.searchPatientReg(name.getText(), surname.getText(), brithdate.getText(), homeaddress.getText(), phonenumber.getText(), tribe.getText(), alivedead.getText())
//            }
//        });
//        gc.gridx=0;
//        p1.add(patsearchbutton,gc);



        JPanel p2 = new JPanel();

        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();

        JTabbedPane optionlist = new JTabbedPane();
        optionlist.add(p1,"Patient Management");
        optionlist.add(p2,"Panel #2");
        optionlist.add(p3,"Panel #3");
        optionlist.add(p4,"Panel #4");



        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5,5,5,5);
        c.fill = GridBagConstraints.BOTH; c.gridwidth = GridBagConstraints.REMAINDER;c.ipadx = 450;
        add(toppanel, c);
        c.gridwidth = GridBagConstraints.REMAINDER;
        add(optionlist, c);
        pack();



    }
}
