package GUI.View;

import GUI.Controller.ChangePatientController;
import GUI.Controller.FindController;
import GUI.Controller.FindPatientController;
import GUI.Controller.PatRegistrationController;
import Hospital.src.main.java.Hospital.Patient;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.DateFormatter;
import javax.swing.text.DefaultFormatterFactory;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;


public class FindView extends JFrame {

    private FindController controller;

    private JPanel panel;
    private JTextField searchtextfield;
    private JRadioButton uidbutton,namebutton,surnamebutton;
    private JButton homebutton;
    private ButtonGroup radiobuttons;

    public FindView(FindController controller){
        this.controller = controller;
        initGUI();
    }

    private TableRowSorter<TableModel> rowSorter;

    public void initGUI(){
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


        homebutton = new JButton("Home");
        homebutton.setBounds(320,70,160,30);
        homebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                controller.returnHome();
            }
        });
        panel.add(homebutton);

        setLocationRelativeTo(null);

        radiobuttons = new ButtonGroup();

        namebutton = new JRadioButton("Name");
        namebutton.setBounds(30,20,100,20);
        namebutton.setActionCommand("Name");
        radiobuttons.add(namebutton);
        panel.add(namebutton);
        namebutton.setSelected(true);

        surnamebutton = new JRadioButton("Surname");
        surnamebutton.setBounds(30,50,100,20);
        surnamebutton.setActionCommand("Surname");
        radiobuttons.add(surnamebutton);
        panel.add(surnamebutton);

        uidbutton = new JRadioButton("UID");
        uidbutton.setBounds(30,80,100,20);
        uidbutton.setActionCommand("UID");
        radiobuttons.add(uidbutton);
        panel.add(uidbutton);

    }



    public JTextField getTextfield(){
        return searchtextfield;
    }

    public JPanel getPanel(){
        return panel;
    }

    public ButtonGroup getRadiobuttons(){
        return radiobuttons;
    }


}


