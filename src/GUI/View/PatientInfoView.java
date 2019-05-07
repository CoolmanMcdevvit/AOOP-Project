package GUI.View;

import GUI.Controller.PersonController;

import javax.swing.*;
import java.text.SimpleDateFormat;

public class PatientInfoView extends PersonInfoView{

    private JTextField homeaddress, phonenumber, field7,field8;
    private JFormattedTextField bdd,bdm,bdy;

    protected PatientInfoView view;

    PatientInfoView(String toplabel, PersonController controller){
        super(toplabel, controller);
        JPanel panel = getPanel();
        addPatientLabels(panel);
        addTextFields(panel);
        buttonAdder(panel, getTextFields());
    }

    private void addPatientLabels(JPanel panel){

        JLabel birthdatelabel = new JLabel("Birth Date");
        birthdatelabel.setBounds(50, 200, 150, 40);
        panel.add(birthdatelabel);

        JLabel homeaddresslabel = new JLabel("Home Address");
        homeaddresslabel.setBounds(50, 260, 150, 40);
        panel.add(homeaddresslabel);

        JLabel phonenumberlabel = new JLabel("Phone Number");
        phonenumberlabel.setBounds(50, 320, 150, 40);
        panel.add(phonenumberlabel);

        JLabel tribelabel = new JLabel("Tribe");
        tribelabel.setBounds(50, 380, 150, 40);
        panel.add(tribelabel);

        JLabel alivelabel = new JLabel("Alive");
        alivelabel.setBounds(50, 440, 150, 40);
        panel.add(alivelabel);
    }

    private void addTextFields(JPanel panel){
        bdd = new JFormattedTextField(new SimpleDateFormat("dd"));
        bdd.setBounds(200, 200, 60, 30);
        panel.add(bdd);

        bdm = new JFormattedTextField(new SimpleDateFormat("mm"));
        bdm.setBounds(260, 200, 60, 30);
        panel.add(bdm);

        bdy = new JFormattedTextField(new SimpleDateFormat("yyyy"));
        bdy.setBounds(320, 200, 60, 30);
        panel.add(bdy);

        homeaddress = new JTextField();
        homeaddress.setBounds(200, 260, 180, 30);
        panel.add(homeaddress);

        phonenumber = new JTextField();
        phonenumber.setBounds(200, 320, 180, 30);
        panel.add(phonenumber);

        field7 = new JTextField();
        field7.setBounds(200, 380, 180, 30);
        panel.add(field7);


        field8 = new JTextField();
        field8.setBounds(200, 440, 180, 30);
        panel.add(field8);
    }

    JTextField[] getPatientTextFields(){
        JTextField[] fields = new JTextField[9];
        JTextField[] originalfields = getTextFields();
        fields[0] = originalfields[0];
        fields[1]= originalfields[1];
        fields[2] = bdd;
        fields[3] = bdm;
        fields[4] = bdy;
        fields[5] = homeaddress;
        fields[6] = phonenumber;
        fields[7] = field7;
        fields[8] = field8;
        return fields;
    }

    }
