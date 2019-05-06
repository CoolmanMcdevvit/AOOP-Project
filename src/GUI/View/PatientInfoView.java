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
        setPatientTextfields(panel);
        buttonAdder(panel, getPatientTextFields());
    }

    public void addPatientLabels(JPanel panel){

        tribelabel = new JLabel("Tribe");
        tribelabel.setBounds(50, 380, 150, 40);
        panel.add(tribelabel);

        alivelabel = new JLabel("Alive");
        alivelabel.setBounds(50, 440, 150, 40);
        panel.add(alivelabel);
    }

    public void setPatientTextfields(JPanel panel){

        tribe = new JTextField();
        tribe.setBounds(200, 380, 180, 30);
        panel.add(tribe);

        alivedead = new JTextField();
        alivedead.setBounds(200, 440, 180, 30);
        panel.add(alivedead);
    }


    public JTextField[] getPatientTextFields(){
        JTextField[] fields = new JTextField[9];
        JTextField[] personfields;
        personfields = getTextFields();
        for(int i =0; i<7; i++){
            fields[i] = personfields[i];
        }
        fields[7] = tribe;
        fields[8] = alivedead;
        return fields;
        }
    }
