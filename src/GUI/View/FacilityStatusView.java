package GUI.View;

import GUI.Controller.FacilityStatusController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FacilityStatusView extends JFrame{

    private FacilityStatusController controller;


    public FacilityStatusView(FacilityStatusController controller){
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
        panel.setBounds(5,5,440,320);
        setMinimumSize(new Dimension(450,325));


        JLabel admittednumberlabel = new JLabel("Number of admitted");
        admittednumberlabel.setFont(new Font("Arial", Font.BOLD, 15));
        admittednumberlabel.setBounds(220,20,200,40);
        panel.add(admittednumberlabel);

        JLabel departmentslabel = new JLabel("Departments");
        departmentslabel.setFont(new Font("Arial", Font.BOLD, 15));
        departmentslabel.setBounds(50,20,200,40);
        panel.add(departmentslabel);

        JLabel inpatientlabel = new JLabel("Inpatient");
        inpatientlabel.setBounds(50, 80, 150, 40);
        panel.add(inpatientlabel);

        JLabel outpatientlabel = new JLabel("Outpatient");
        outpatientlabel.setBounds(50, 140, 150, 40);
        panel.add(outpatientlabel);

        JLabel emergencylabel = new JLabel("Emergency");
        emergencylabel.setBounds(50, 200, 150, 40);
        panel.add(emergencylabel);


        JLabel inpatientnumber = new JLabel(String.valueOf(controller.getNumbers("Surgery")));
        inpatientnumber.setBounds(200, 80, 180, 30);
        panel.add(inpatientnumber);

        JLabel outpatientnumber = new JLabel(String.valueOf(controller.getNumbers("Medical")));
        outpatientnumber.setBounds(200, 140, 180, 30);
        panel.add(outpatientnumber);

        JLabel emergencynumber = new JLabel(String.valueOf(controller.getNumbers("Emergency")));
        emergencynumber.setBounds(200, 200, 180, 30);
        panel.add(emergencynumber);

        JButton homebutton = new JButton("Home");
        homebutton.setBounds(115,250,220,35);
        panel.add(homebutton);

        homebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.returnHome();
            }
        });



        add(panel);
        pack();
        setLocationRelativeTo(null);


    }}

