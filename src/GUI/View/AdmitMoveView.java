package GUI.View;

import GUI.Controller.AdmitMoveController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdmitMoveView extends JFrame{

    public AdmitMoveController controller;
    private JLabel toplabel, idlabel, departmentlabel, bedlabel;
    private JPanel panel;
    private JTextField id, department, bed;
    private JButton home, admit, move;

    public AdmitMoveView(AdmitMoveController controller){
        this.controller = controller;
        initGUI();
    }

    public void initGUI(){
        setTitle("Admit/Move Patient");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(900, 600);
        setLayout(null);
        setBackground(Color.WHITE);
        setMinimumSize(new Dimension(600, 350));

        toplabel = new JLabel("Please enter new or updated information for patient: ");
        toplabel.setFont(new Font("Arial", Font.BOLD, 15));
        toplabel.setBounds(50,20,500,40);
        panel.add(toplabel);

        idlabel = new JLabel("ID: ");
        idlabel.setBounds(50, 80, 150, 40);
        panel.add(idlabel);

        departmentlabel = new JLabel("Department: ");
        departmentlabel.setBounds(50, 140, 150, 40);
        panel.add(departmentlabel);

        bedlabel = new JLabel("Bed Number: ");
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

        home = new JButton("Home");
        home.setBounds(350, 250, 138, 30);
        home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                controller.returnHome();
            }
        });
        panel.add(home);

        admit = new JButton("Admit");
        admit.setBounds(200, 250, 138, 30);
        admit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.admit(id,department,bed);
            }
        });
        panel.add(admit);

        move = new JButton("Move");
        move.setBounds(50,250,138,30);
        move.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.move(id,department,bed);
            }
        });
        panel.add(move);

        add(panel);
        pack();
    }
}
