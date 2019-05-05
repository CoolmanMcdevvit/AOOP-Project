package GUI.View;

import GUI.Controller.ChangePatientController;
import GUI.Controller.FindPatientController;
import GUI.Controller.PatRegistrationController;
import sun.java2d.windows.GDIRenderer;

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



//        searchlabel = new JLabel("Search");
//        searchlabel.setBounds(270,10,250,40);
//        searchlabel.setFont(new Font("Arial",Font.BOLD,30));
//        panel.add(searchlabel);

        searchtextfield = new JTextField();
        searchtextfield.setBounds(160,30,320,30);
        panel.add(searchtextfield);

        searchbutton = new JButton("Search");
        searchbutton.setBounds(160,70,160,30);
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

        namebutton = new JRadioButton("Name");
        namebutton.setBounds(30,25,80,20);
        panel.add(namebutton);

        surnamebutton = new JRadioButton("Surname");
        surnamebutton.setBounds(30,55,80,20);
        panel.add(surnamebutton);

        uidbutton = new JRadioButton("UID");
        uidbutton.setBounds(30,85,80,20);
        panel.add(uidbutton);


        resultspanel = new JScrollPane();
        resultspanel.setLayout(null);
        resultspanel.setBounds(5,150,525,400);
        resultspanel.setBorder(BorderFactory.createLineBorder(Color.black));

        resultstable = new JTable();
        //resultstable.setModel(new DefaultTableModel(data,columnNames));
        resultspanel.add(resultstable);





        add(panel);
        add(resultspanel);
        pack();
        setLocationRelativeTo(null);

    }
}
