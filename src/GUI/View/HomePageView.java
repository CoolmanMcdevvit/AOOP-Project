package GUI.View;


import GUI.Controller.HomePageController;

import javax.swing.*;
import java.awt.*;

public class HomePageView extends JFrame{
    private HomePageController controller;



    public HomePageView(HomePageController controller){
        this.controller = controller;
        initGUI();
    }

    public void initGUI(){
        // Stops program on close
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //defines layout
        setLayout(new GridBagLayout());
        //sets title of window
        setTitle("Hospital Management System");

        // for "headder" of frame
        JPanel toppanel = new JPanel(new FlowLayout(FlowLayout.LEFT,10,20));
        toppanel.setBackground(Color.WHITE);
        JLabel head = new JLabel("Hospital Management");
        head.setFont(new Font("Arial", Font.PLAIN, 18));
        toppanel.add(head);
        setLocationRelativeTo(null);

        // creates new panel to add buttons to
        JPanel p1 = new JPanel();
        // defines layout of panel
        p1.setLayout(new GridBagLayout());

        // Set button values
        JButton patregbutton = new JButton("Patient Registration");
        JButton patchangebutton = new JButton("Change Patient Information");
        JButton patfindbutton = new JButton("Find Patient");
        JButton patadmissionbutton = new JButton("Admit/Move/Discharge patient");
        JButton patdischargebutton = new JButton("Discharge Patient");

        //defines what to do on button press
        patregbutton.addActionListener(e -> controller.patRegistrationPress());
        patchangebutton.addActionListener(e -> controller.patChangePress());
        patfindbutton.addActionListener(e -> controller.patFindPress());
        patadmissionbutton.addActionListener(e -> controller.patAdmitMovePress());
        patdischargebutton.addActionListener(e -> {
            String uid = JOptionPane.showInputDialog("please enter UID of Patient");
        });

        // GridbagContraints defines location of components in panel
        GridBagConstraints gc = new GridBagConstraints();
        // x&y location, x directional size, fill all row, distance between components
        gc.gridx=0; gc.gridy=0; gc.ipadx = 150 ;gc.fill = GridBagConstraints.HORIZONTAL; gc.insets = new Insets(5,5,5,5);
        p1.add(patregbutton,gc);
        gc.fill = GridBagConstraints.HORIZONTAL; gc.gridy=1;
        p1.add(patchangebutton,gc);gc.weightx = 200;
        gc.fill = GridBagConstraints.HORIZONTAL; gc.gridy=2;
        p1.add(patfindbutton,gc);gc.weightx = 200;
        gc.fill = GridBagConstraints.HORIZONTAL; gc.gridy=3;
        p1.add(patadmissionbutton,gc);

        JPanel p2 = new JPanel();
        JButton staffregbutton = new JButton("Staff Registration");
        JButton staffchangebutton = new JButton("Change Staff Information");
        JButton stafffindbutton = new JButton("Find Staff Member");


        staffregbutton.addActionListener(e -> controller.staffRegistrationPress());
        staffchangebutton.addActionListener(e -> controller.staffChangePress());
        stafffindbutton.addActionListener(e -> controller.findStaffPress());

        p2.setLayout(new GridBagLayout());
        // x&y location, x directional size, fill all row, distance between components
        gc.gridx=0; gc.gridy=0; gc.ipadx = 150 ;gc.fill = GridBagConstraints.HORIZONTAL; gc.insets = new Insets(5,5,5,5);
        p2.add(staffregbutton,gc);
        gc.fill = GridBagConstraints.HORIZONTAL; gc.gridy=1;
        p2.add(staffchangebutton,gc);gc.weightx = 200;
        gc.fill = GridBagConstraints.HORIZONTAL; gc.gridy=2;
        p2.add(stafffindbutton,gc);gc.weightx = 200;

        JPanel p3 = new JPanel();
        p3.setLayout(new GridBagLayout());

        JButton facilitySButton = new JButton("Facility Status");
        gc.gridx=0; gc.gridy=0; gc.ipadx = 150 ;gc.fill = GridBagConstraints.HORIZONTAL; gc.insets = new Insets(5,5,5,5);
        p3.add(facilitySButton,gc);

        facilitySButton.addActionListener(e -> controller.facilityStatusPress());

        JButton participationLButton = new JButton("Participation lists");
        gc.fill = GridBagConstraints.HORIZONTAL; gc.gridy=1;
        p3.add(participationLButton,gc);gc.weightx = 200;

        participationLButton.addActionListener(e -> controller.participationListsPress());

        JButton updateDButton = new JButton("Update database");
        gc.fill = GridBagConstraints.HORIZONTAL; gc.gridy=2;
        p3.add(updateDButton,gc);gc.weightx = 200;

        updateDButton.addActionListener(e -> controller.updateDatabasePress());




        JTabbedPane optionlist = new JTabbedPane();
        optionlist.add(p1,"Patient Management");
        optionlist.add(p2,"Staff Management");
        optionlist.add(p3,"Facility Management");




        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5,5,5,5);
        c.fill = GridBagConstraints.BOTH; c.gridwidth = GridBagConstraints.REMAINDER;c.ipadx = 450;
        add(toppanel, c);
        c.gridwidth = GridBagConstraints.REMAINDER;
        add(optionlist, c);
        pack();



    }
}
