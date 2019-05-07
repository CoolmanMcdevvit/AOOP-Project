package GUI.View;

import GUI.Controller.ChangePatientController;
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


public class FindPatientView extends JFrame {

    private FindPatientController controller;

    private JScrollPane resultspanel;
    private JPanel panel;
    private JLabel searchlabel;
    private JTextField searchtextfield;
    private JRadioButton uidbutton,namebutton,surnamebutton;
    private JButton searchbutton, homebutton;
    private JFrame frame;
    private JTable resultstable;
    private ButtonGroup radiobuttons;

    public FindPatientView(FindPatientController controller){
        this.controller = controller;
        initGUI();
    }

    private TableRowSorter<TableModel> rowSorter;

    public void initGUI(){
        frame = new JFrame();
        panel = new JPanel();
        setLayout(null);
        panel.setLayout(null);
        setTitle("Find Patient Window");
        setBackground(Color.WHITE);
        setSize(970,700);
        //panel.setSize(800,250);
        panel.setBounds(5,5,525,130);
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        setMinimumSize(new Dimension(550,600));

        String [] columns = {"ID","Name","SUR","NN","DD","EE","DD","TT"};
        Object[][] data={{"1","M","j","1222","asdads","123123","yes","jaimaican"},{"2","G","E","1222","asdads","123123","yes","jaimaican"},{"4","tTT","TTT","1222","asdads","123123","yes","jaimaican"}};


        searchtextfield = new JTextField();
        searchtextfield.setBounds(160,30,320,30);
        panel.add(searchtextfield);

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







        resultstable = new JTable(data,columns);
        resultstable.setBounds(30,180,400,350);

        //resultspanel.setViewportView(resultstable);
//        resultstable.setModel(new DefaultTableModel());
//        DefaultTableModel model = (DefaultTableModel)resultstable.getModel();
//        model.addColumn("Name");model.addColumn("Surname");


        searchbutton = new JButton("Search");
        searchbutton.setBounds(160,70,160,30);
        searchbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                //controller.findPatient(radiobuttons.getSelection().getActionCommand(),searchtextfield.getText());
//                int row = 0;
//                for(int i=0;i<data.length;i++){
//                    System.out.println("bum");
//                    model.addRow(new Object[0]);
//                    model.setValueAt(data[i][1],row,0);
//                    model.setValueAt(data[i][2],row,1);
//                    row++;
//                }
            }
        });
        panel.add(searchbutton);

        homebutton = new JButton("Home");
        homebutton.setBounds(320,70,160,30);
        homebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                controller.returnHome();
            }
        });
        panel.add(homebutton);


        resultspanel = new JScrollPane(resultstable);
        resultspanel.setBounds(5,150,525,400);
//        resultspanel.setBorder(BorderFactory.createLineBorder(Color.black));


        add(resultspanel);




        add(panel);

        pack();
        setLocationRelativeTo(null);

    }


}


