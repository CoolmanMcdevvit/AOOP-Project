package GUI.View;

import GUI.Controller.FindController;

import javax.swing.*;
import java.awt.*;


public class FindView extends JFrame {

    private FindController controller;

    private JPanel panel;
    private JTextField searchtextfield;
    private ButtonGroup radiobuttons;

    FindView(FindController controller){
        this.controller = controller;
        initGUI();
    }

    public void initGUI(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel = new JPanel();
        setLayout(null);
        panel.setLayout(null);
        setTitle("Find Patient Window");
        setBackground(Color.WHITE);
        setSize(970,700);
        //panel.setSize(800,250);
        panel.setBounds(5,5,850,130);
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        setMinimumSize(new Dimension(900,600));




        searchtextfield = new JTextField();
        searchtextfield.setBounds(160,30,320,30);
        panel.add(searchtextfield);


        JButton homebutton = new JButton("Home");
        homebutton.setBounds(320,70,160,30);
        homebutton.addActionListener(e -> controller.returnHome());
        panel.add(homebutton);

        setLocationRelativeTo(null);

        radiobuttons = new ButtonGroup();

        JRadioButton namebutton = new JRadioButton("Name");
        namebutton.setBounds(30,20,100,20);
        namebutton.setActionCommand("Name");
        radiobuttons.add(namebutton);
        panel.add(namebutton);
        namebutton.setSelected(true);

        JRadioButton surnamebutton = new JRadioButton("Surname");
        surnamebutton.setBounds(30,50,100,20);
        surnamebutton.setActionCommand("Surname");
        radiobuttons.add(surnamebutton);
        panel.add(surnamebutton);

        JRadioButton uidbutton = new JRadioButton("UID");
        uidbutton.setBounds(30,80,100,20);
        uidbutton.setActionCommand("UID");
        radiobuttons.add(uidbutton);
        panel.add(uidbutton);

    }



    JTextField getTextfield(){
        return searchtextfield;
    }

    public JPanel getPanel(){
        return panel;
    }

    ButtonGroup getRadiobuttons(){
        return radiobuttons;
    }


}


