package GUI.View;

import GUI.Controller.FacilityStatusController;
import GUI.Controller.FindPatientController;
import GUI.Controller.ParticipationListsController;
import GUI.Controller.PersonController;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class ParticipationListsView extends JFrame{

    private JLabel admittednumberlabel,departmentslabel,inpatientlabel,outpatientlabel,emergencylabel;
    private JPanel panel;
    private JTextField inpatientnumber,outpatientnumber,emergencynumber;
    private ParticipationListsController controller;
    private JButton homebutton, exportbutton;
    private JComboBox<String> dropdownmenu;





    public ParticipationListsView(ParticipationListsController controller){
        this.controller = controller;
        initGUI();
    }
    public void initGUI(){

        panel = new JPanel();
        setLayout(null);
        panel.setLayout(null);
        setTitle("Facility Status Window");
        setBackground(Color.WHITE);
        panel.setBounds(5,5,330,280);
        setMinimumSize(new Dimension(340,290));




        admittednumberlabel = new JLabel("Select Department");
        admittednumberlabel.setFont(new Font("Arial", Font.BOLD, 23));
        admittednumberlabel.setBounds(60,20,220,40);
        panel.add(admittednumberlabel);


        String[] choices = {"Emergency","Inpatient","Outpatient"};
        dropdownmenu = new JComboBox<String>(choices);
        dropdownmenu.setBounds(60,70,200,100);
        panel.add(dropdownmenu);

        homebutton = new JButton("Home");
        homebutton.setBounds(45,200,110,30);
        panel.add(homebutton);

        homebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.returnHome();
            }
        });

        exportbutton = new JButton("Export");
        exportbutton.setBounds(165,200,110,30);
        panel.add(exportbutton);



        add(panel);
        pack();
        setLocationRelativeTo(null);


    }}
