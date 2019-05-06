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
        setStaffTextfields(panel);
        buttonAdder(panel, getStaffTextFields());
    }

    public void addStaffLabels(JPanel panel){

        jobrolelabel = new JLabel("Job Role");
        jobrolelabel.setBounds(50, 380, 150, 40);
        panel.add(jobrolelabel);

        departmentlabel = new JLabel("Department");
        departmentlabel.setBounds(50, 440, 150, 40);
        panel.add(departmentlabel);

    }

    public void setStaffTextfields(JPanel panel){
        jobrole = new JTextField();
        jobrole.setBounds(200, 380, 180, 30);
        panel.add(jobrole);


        department = new JTextField();
        department.setBounds(200, 440, 180, 30);
        panel.add(department);

    }

    public JTextField[] getStaffTextFields(){
        JTextField[] fields = new JTextField[9];
        JTextField[] personfields;
        personfields = getTextFields();
        for(int i =0; i<7; i++){
            fields[i] = personfields[i];
        }
        fields[7] = jobrole;
        fields[8] = department;
        return fields;
    }

}
