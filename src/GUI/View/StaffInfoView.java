package GUI.View;

import GUI.Controller.PersonController;

import javax.swing.*;

class StaffInfoView extends PersonInfoView {
    private JTextField jobrole, department;

    StaffInfoView(String toplabel, PersonController controller){
        super(toplabel, controller);
        JPanel panel = getPanel();
        addStaffLabels(panel);
        addStaffTextFields(panel);
        buttonAdder(panel, getTextFields());
    }

    private void addStaffLabels(JPanel panel){

        JLabel jobrolelabel = new JLabel("Job Role");
        jobrolelabel.setBounds(50, 200, 150, 40);
        panel.add(jobrolelabel);

        JLabel departmentlabel = new JLabel("Department");
        departmentlabel.setBounds(50, 260, 150, 40);
        panel.add(departmentlabel);
    }

    private void addStaffTextFields(JPanel panel){
        jobrole = new JTextField();
        jobrole.setBounds(200, 200, 180, 30);
        panel.add(jobrole);

        department = new JTextField();
        department.setBounds(200, 260, 180, 30);
        panel.add(department);
    }

    JTextField[] getStaffTextFields(){
        JTextField[] fields = new JTextField[4];
        JTextField[] originalfields = getTextFields();
        fields[0] = originalfields[0];
        fields[1]= originalfields[1];
        fields[2] = jobrole;
        fields[3] = department;
        return fields;
    }


}
