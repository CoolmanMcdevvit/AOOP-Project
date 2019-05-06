package GUI.View;

import GUI.Controller.PersonController;
import GUI.Controller.StaffRegistrationController;

import javax.swing.*;

public class StaffInfoView extends PersonInfoView {
    private JPanel panel;
    private JLabel jobrolelabel, departmentlabel;
    private JTextField jobrole, department;

    public StaffInfoView(String toplabel, PersonController controller){
        super(toplabel, controller);
        this.panel = getPanel();
        addStaffLabels(panel);
        buttonAdder(panel, getTextFields());
    }

    public void addStaffLabels(JPanel panel){

        jobrolelabel = new JLabel("Job Role");
        jobrolelabel.setBounds(50, 380, 150, 40);
        panel.add(jobrolelabel);

        departmentlabel = new JLabel("Department");
        departmentlabel.setBounds(50, 440, 150, 40);
        panel.add(departmentlabel);

    }


}
