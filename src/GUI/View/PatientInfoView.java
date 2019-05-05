package GUI.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class PatientInfoView extends JFrame{

    private HomePageView hview;
    private JLabel namelabel, surnamelabel, birthdatelabel, homeadresslabel,phonenumberlabel,tribelabel,alivelabel;
    private JTextField name, surname,homeaddress,phonenumber,tribe,alivedead;
    private JFormattedTextField bdd, bdm, bdy;
    private JButton cleartext,home;
    private JPanel panel;
    protected PatientInfoView view;

    PatientInfoView(){
        this.panel = setDefaults();
        addLabels(panel);
        setTextfields(panel);
        buttonAdder(panel);
    }

    public void addLabels(JPanel panel){

        namelabel = new JLabel("Name");
        namelabel.setBounds(50, 80, 150, 40);
        panel.add(namelabel);

        surnamelabel = new JLabel("Surname");
        surnamelabel.setBounds(50, 140, 150, 40);
        panel.add(surnamelabel);

        birthdatelabel = new JLabel("Birth Date");
        birthdatelabel.setBounds(50, 200, 150, 40);
        panel.add(birthdatelabel);

        homeadresslabel = new JLabel("Home Address");
        homeadresslabel.setBounds(50, 260, 150, 40);
        panel.add(homeadresslabel);

        phonenumberlabel = new JLabel("Phone Number");
        phonenumberlabel.setBounds(50, 320, 150, 40);
        panel.add(phonenumberlabel);

        tribelabel = new JLabel("Tribe");
        tribelabel.setBounds(50, 380, 150, 40);
        panel.add(tribelabel);

        alivelabel = new JLabel("Alive");
        alivelabel.setBounds(50, 440, 150, 40);
        panel.add(alivelabel);
    }

    public void setTextfields(JPanel panel){
        name = new JTextField();
        name.setBounds(200, 80, 180, 30);
        panel.add(name);

        surname = new JTextField();
        surname.setBounds(200, 140, 180, 30);
        panel.add(surname);

        bdd = new JFormattedTextField(new SimpleDateFormat("dd"));
        bdd.setBounds(200, 200, 60, 30);
        panel.add(bdd);

        bdm = new JFormattedTextField(new SimpleDateFormat("mm"));
        ;
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

        tribe = new JTextField();
        tribe.setBounds(200, 380, 180, 30);
        panel.add(tribe);

        alivedead = new JTextField();
        alivedead.setBounds(200, 440, 180, 30);
        panel.add(alivedead);
    }

    public void buttonAdder(JPanel panel){
        cleartext = new JButton("Clear Text");
        cleartext.setBounds(200, 500, 138, 30);
        cleartext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name.setText("");
                surname.setText("");
                bdd.setText("");
                bdm.setText("");
                bdy.setText("");
                homeaddress.setText("");
                phonenumber.setText("");
                tribe.setText("");
                alivedead.setText("");
            }
        });
        panel.add(cleartext);

    }

    public JPanel setDefaults(){
        panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(900, 650);
        setLayout(null);
        setBackground(Color.WHITE);
        setSize(970, 700);
        setMinimumSize(new Dimension(550, 600));
        return panel;
    }

    public JPanel getPanel(){
        return panel;
    }

    public String[] getTextFieldsValues(){
        String[] fields = new String[9];
        fields[0] = name.getText();
        fields[1] = surname.getText();
        fields[2] = bdd.getText();
        fields[3] = bdm.getText();
        fields[4] = bdy.getText();
        fields[5] = homeaddress.getText();
        fields[6] = phonenumber.getText();
        fields[7] = tribe.getText();
        fields[8] = alivedead.getText();
        return fields;
        }
    }
