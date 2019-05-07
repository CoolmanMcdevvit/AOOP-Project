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
        addStaffTextFields(panel);
        buttonAdder(panel, getTextFields());
    }

    public void addStaffLabels(JPanel panel){

        jobrolelabel = new JLabel("Job Role");
        jobrolelabel.setBounds(50, 200, 150, 40);
        panel.add(jobrolelabel);

        departmentlabel = new JLabel("Department");
        departmentlabel.setBounds(50, 260, 150, 40);
        panel.add(departmentlabel);
    }

    public void addStaffTextFields(JPanel panel){
        jobrole = new JTextField();
        jobrole.setBounds(200, 200, 180, 30);
        panel.add(jobrole);

        department = new JTextField();
        department.setBounds(200, 260, 180, 30);
        panel.add(department);
    }

    public JTextField[] getStaffTextFields(){
        JTextField[] fields = new JTextField[4];
        JTextField[] originalfields = getTextFields();
        fields[0] = originalfields[0];
        fields[1]= originalfields[1];
        fields[2] = jobrole;
        fields[3] = department;
        return fields;
    }


}
