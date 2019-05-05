package GUI.View;

import GUI.Controller.ChangePatientController;
import GUI.Controller.PatRegistrationController;
import sun.java2d.windows.GDIRenderer;

import javax.swing.*;
import javax.swing.text.DateFormatter;
import javax.swing.text.DefaultFormatterFactory;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;


public class ChangePatientView extends JFrame {

    private ChangePatientController controller;
    private JLabel namelabel, surnamelabel, birthdatelabel, homeadresslabel,phonenumberlabel,tribelabel,alivelabel, toplabel;
    private JTextField name, surname, birthdate,homeaddress,phonenumber,tribe,alivedead;
    private JTextField bdd, bdm, bdy;
    private JButton clicktoregister, cleartext,home,clicktomodify;
    private JPanel panel;
    private JFrame frame;

    public ChangePatientView(ChangePatientController controller){
        this.controller = controller;
        initGUI();
    }

    public void initGUI(){
        frame = new JFrame();
        panel = new JPanel();
        setLayout(null);
        panel.setLayout(null);
        setTitle("Registration Form");
        setBackground(Color.WHITE);
        setSize(970,700);
        panel.setSize(900,650);
        setMinimumSize(new Dimension(550,600));

        //All labels
        toplabel = new JLabel("Please change Patient Data: ");
        toplabel.setFont(new Font("Arial", Font.BOLD, 15));
        toplabel.setBounds(50,20,350,40);
        panel.add(toplabel);

        namelabel = new JLabel("Name");
        namelabel.setBounds(50,80,150,40);
        panel.add(namelabel);

        surnamelabel = new JLabel("Surname");
        surnamelabel.setBounds(50,140,150,40);
        panel.add(surnamelabel);

        birthdatelabel = new JLabel("Birth Date");
        birthdatelabel.setBounds(50,200,150,40);
        panel.add(birthdatelabel);

        homeadresslabel = new JLabel("Home Address");
        homeadresslabel.setBounds(50,260,150,40);
        panel.add(homeadresslabel);

        phonenumberlabel = new JLabel("Phone Number");
        phonenumberlabel.setBounds(50,320,150,40);
        panel.add(phonenumberlabel);

        tribelabel = new JLabel("Tribe");
        tribelabel.setBounds(50,380,150,40);
        panel.add(tribelabel);

        alivelabel = new JLabel("Alive");
        alivelabel.setBounds(50,440,150,40);
        panel.add(alivelabel);


        //All text Fields

        name = new JTextField();
        name.setBounds(200,80,180,30);
        panel.add(name);

        surname = new JTextField();
        surname.setBounds(200,140,180,30);
        panel.add(surname);

        bdd = new JFormattedTextField( new SimpleDateFormat("DD"));
        bdd.setBounds(200,200,60,30);
        panel.add(bdd);

        bdm = new JFormattedTextField( new SimpleDateFormat("MM"));;
        bdm.setBounds(260,200,60,30);
        panel.add(bdm);

        bdy = new JFormattedTextField( new SimpleDateFormat("YYYY"));
        bdy.setBounds(320,200,60,30);
        panel.add(bdy);

        homeaddress = new JTextField();
        homeaddress.setBounds(200,260,180,30);
        panel.add(homeaddress);

        phonenumber = new JTextField();
        phonenumber.setBounds(200,320,180,30);
        panel.add(phonenumber);

        tribe = new JTextField();
        tribe.setBounds(200,380,180,30);
        panel.add(tribe);

        alivedead = new JTextField();
        alivedead.setBounds(200,440,180,30);
        panel.add(alivedead);

        //Button
        clicktomodify = new JButton("Update");
        clicktomodify.setBounds(50,500,138,30);
        clicktomodify.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.checkPatientReg(name.getText(), surname.getText(), bdd.getText(),bdm.getText(),bdy.getText(), homeaddress.getText(), phonenumber.getText(), tribe.getText(), alivedead.getText());
            }
        });
        panel.add(clicktomodify);

        cleartext = new JButton("Clear Text");
        cleartext.setBounds(200,500,138,30);
        cleartext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name.setText("");surname.setText("");bdd.setText("");bdm.setText("");bdy.setText("");homeaddress.setText("");phonenumber.setText("");tribe.setText("");alivedead.setText("");
            }
        });
        panel.add(cleartext);

        home = new JButton("Home");
        home.setBounds(350,500,138,30);
        home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.returnHome();
            }
        });
        panel.add(home);
        add(panel);
        pack();
        setLocationRelativeTo(null);

    }
}
