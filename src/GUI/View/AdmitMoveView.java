package GUI.View;

import GUI.Controller.AdmitMoveController;

import javax.swing.*;
import java.awt.*;

public class AdmitMoveView extends JFrame{

    public AdmitMoveController controller;
    private JTextField id, department, bed;

    public AdmitMoveView(AdmitMoveController controller){
        this.controller = controller;
        initGUI();
    }

    public void initGUI(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admit/Move Patient");
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(900, 600);
        setLayout(null);
        setBackground(Color.WHITE);
        setMinimumSize(new Dimension(600, 400));

        JLabel toplabel = new JLabel("Please enter new or updated information for patient: ");
        toplabel.setFont(new Font("Arial", Font.BOLD, 15));
        toplabel.setBounds(50,20,500,40);
        panel.add(toplabel);

        JLabel idlabel = new JLabel("ID: ");
        idlabel.setBounds(50, 80, 150, 40);
        panel.add(idlabel);

        JLabel departmentlabel = new JLabel("Department: ");
        departmentlabel.setBounds(50, 140, 150, 40);
        panel.add(departmentlabel);

        JLabel bedlabel = new JLabel("Bed Number: ");
        bedlabel.setBounds(50, 200, 150, 40);
        panel.add(bedlabel);

        id = new JTextField();
        id.setBounds(200, 80, 180, 30);
        panel.add(id);

        department = new JTextField();
        department.setBounds(200, 140, 180, 30);
        panel.add(department);

        bed =  new JTextField();
        bed.setBounds(200, 200, 180, 30);
        panel.add(bed);

        JButton home = new JButton("Home");
        home.setBounds(350, 250, 138, 30);
        home.addActionListener(e -> controller.returnHome());
        panel.add(home);

        JButton admit = new JButton("Admit");
        admit.setBounds(200, 250, 138, 30);
        admit.addActionListener(e -> controller.admit(id.getText(),department.getText(),bed.getText()));
        panel.add(admit);

        JButton move = new JButton("Move");
        move.setBounds(50,250,138,30);
        move.addActionListener(e -> controller.move(id.getText(),department.getText(),bed.getText()));
        panel.add(move);

        JButton discharge = new JButton("Discharge");
        discharge.setBounds(50, 300, 438, 30);
        discharge.addActionListener(e -> controller.dischargePatient(id.getText()));
        panel.add(discharge);


        add(panel);
        pack();
    }
}
