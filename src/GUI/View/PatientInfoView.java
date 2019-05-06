package GUI.View;

import GUI.Controller.PersonController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class PatientInfoView extends PersonInfoView{

    private JLabel tribelabel,alivelabel;
    private JTextField tribe,alivedead;

    private JPanel panel;
    protected PatientInfoView view;

    public PatientInfoView(String toplabel, PersonController controller){
        super(toplabel, controller);
        this.panel = getPanel();
        addPatientLabels(panel);
        buttonAdder(panel, getTextFields());
    }

    public void addPatientLabels(JPanel panel){

        tribelabel = new JLabel("Tribe");
        tribelabel.setBounds(50, 380, 150, 40);
        panel.add(tribelabel);

        alivelabel = new JLabel("Alive");
        alivelabel.setBounds(50, 440, 150, 40);
        panel.add(alivelabel);
    }

}
