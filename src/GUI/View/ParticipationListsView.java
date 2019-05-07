package GUI.View;

import GUI.Controller.ParticipationListsController;

import javax.swing.*;
import java.awt.*;

public class ParticipationListsView extends JFrame{

    private ParticipationListsController controller;


    public ParticipationListsView(ParticipationListsController controller){
        this.controller = controller;
        initGUI();
    }
    public void initGUI(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        setLayout(null);
        panel.setLayout(null);
        setTitle("Facility Status Window");
        setBackground(Color.WHITE);
        panel.setBounds(5,5,330,280);
        setMinimumSize(new Dimension(340,290));


        JLabel admittednumberlabel = new JLabel("Select Department");
        admittednumberlabel.setFont(new Font("Arial", Font.BOLD, 23));
        admittednumberlabel.setBounds(60,20,220,40);
        panel.add(admittednumberlabel);


        String[] choices = {"Emergency","Inpatient","Outpatient"};
        JComboBox<String> dropdownmenu = new JComboBox<>(choices);
        dropdownmenu.setBounds(60,70,200,100);
        panel.add(dropdownmenu);

        JButton homebutton = new JButton("Home");
        homebutton.setBounds(45,200,110,30);
        panel.add(homebutton);

        homebutton.addActionListener(e -> controller.returnHome());

        JButton exportbutton = new JButton("Export");
        exportbutton.setBounds(165,200,110,30);
        panel.add(exportbutton);



        add(panel);
        pack();
        setLocationRelativeTo(null);


    }}
