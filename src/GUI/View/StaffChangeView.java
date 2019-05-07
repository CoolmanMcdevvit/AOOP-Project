package GUI.View;

import GUI.Controller.StaffChangeController;
import Hospital.src.main.java.Hospital.Staff;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StaffChangeView extends StaffInfoView{

    private StaffChangeController controller;
    private JPanel panel;
    private JButton clicktoupdate;

    public StaffChangeView(StaffChangeController controller){
        super("Please enter Staff Data:",controller);
        this.controller = controller;
        initGUI();
    }

    public void initGUI(){
        panel = getPanel();


        clicktoupdate = new JButton("update");
        clicktoupdate.setBounds(50,500,138,30);
        clicktoupdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.update(getStaffTextFields());
            }
        });
        panel.add(clicktoupdate);

        pack();
        setLocationRelativeTo(null);
    }

    public void setTextfields(Staff s) {
        JTextField[] f = getStaffTextFields();
        f[0].setText(s.getFirstname());
        f[1].setText(s.getLastname());
        f[2].setText(s.getJobRole());
        f[3].setText(s.getDepartment());
    }

}
