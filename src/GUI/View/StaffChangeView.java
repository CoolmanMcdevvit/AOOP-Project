package GUI.View;

import GUI.Controller.StaffChangeController;
import Hospital.src.main.java.Hospital.Staff;

import javax.swing.*;

public class StaffChangeView extends StaffInfoView{

    private StaffChangeController controller;

    public StaffChangeView(StaffChangeController controller){
        super("Please enter Staff Data:",controller);
        this.controller = controller;
        initGUI();
    }

    public void initGUI(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = getPanel();


        JButton clicktoupdate = new JButton("update");
        clicktoupdate.setBounds(50,500,138,30);
        clicktoupdate.addActionListener(e -> controller.update(getStaffTextFields()));
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
