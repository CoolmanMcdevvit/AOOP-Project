package GUI.View;

import GUI.Controller.ChangePatientController;
import Hospital.src.main.java.Hospital.Patient;

import javax.swing.*;


public class ChangePatientView extends PatientInfoView {

    private ChangePatientController controller;

    public ChangePatientView(ChangePatientController controller){
        super("Update Patient Data: ", controller);
        this.controller = controller;
        initGUI();
    }

    public void initGUI(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Change Patient Form");
        JPanel panel = getPanel();

        //Button
        JButton clicktomodify = new JButton("Update");
        clicktomodify.setBounds(50,500,138,30);
        clicktomodify.addActionListener(e -> {
            controller.update(getPatientTextFields());
            //controller.check(getTextFields());
        });

        panel.add(clicktomodify);
        add(panel);
        pack();
    }

    public void setTextfields(Patient p){
        JTextField[] f =  getPatientTextFields();
        f[0].setText(p.getFirstname());
        f[1].setText(p.getLastname());
        f[2].setText(p.getBirthDay());
        f[3].setText(p.getBirthMonth());
        f[4].setText(p.getBirthYear());
        f[5].setText(p.getAddress());
        f[6].setText(p.getPhonenumberString());
        f[7].setText(p.getTribe());
        f[8].setText(p.getAlivestatus());
    }
}
