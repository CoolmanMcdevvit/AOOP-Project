package GUI.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePageView extends JFrame{

    private JTextField name, surname, birthdate,homeaddress,phonenumber,tribe,alivedead;
    private JButton patregbutton;


    public HomePageView(){
        initGUI();
    }

    public void initGUI(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        setTitle("Hospital Management System");

        JPanel toppanel = new JPanel(new FlowLayout(FlowLayout.LEFT,10,20));
        toppanel.setBackground(Color.BLUE);
        JLabel head = new JLabel("Hospital Management");
        head.setFont(new Font("Arial", Font.PLAIN, 18));
        toppanel.add(head);
        GridBagConstraints gc = new GridBagConstraints();


        JPanel p1 = new JPanel();
        p1.setLayout(new GridBagLayout());
        JLabel panelheader = new JLabel("Please enter patient data");
        panelheader.setFont(new Font("Arial", Font.BOLD, 15));
        gc.gridx = 0; gc.gridy = 0; gc.ipady = 30; gc.fill = GridBagConstraints.HORIZONTAL;
        p1.add(panelheader, gc);
        gc.gridy = 1; gc.ipady = 0; gc.anchor = GridBagConstraints.WEST; gc.fill = GridBagConstraints.NONE;
        p1.add(new JLabel("Name: "),gc);
        gc.gridy = 2;
        p1.add(new JLabel("Surname: "),gc);
        gc.gridy = 3;
        p1.add(new JLabel("Birth date (dd/mm/yyyy): "),gc);
        gc.gridy = 4;
        p1.add(new JLabel("Home Address: "),gc);
        gc.gridy = 5;
        p1.add(new JLabel("Phone Number: "),gc);
        gc.gridy = 6;
        p1.add(new JLabel("Tribe: "),gc);
        gc.gridy = 7;
        p1.add(new JLabel("Alive / Dead: "),gc);
        name = new JTextField();
        surname = new JTextField();
        birthdate = new JTextField();
        homeaddress = new JTextField();
        phonenumber = new JTextField();
        tribe = new JTextField();
        alivedead = new JTextField();
        gc.gridy = 1; gc.gridx=1; gc.ipadx = 90; gc.fill = GridBagConstraints.HORIZONTAL;
        p1.add(name,gc);
        gc.gridy = 2;
        p1.add(surname,gc);
        gc.gridy = 3;
        p1.add(birthdate,gc);
        gc.gridy = 4;
        p1.add(homeaddress,gc);
        gc.gridy = 5;
        p1.add(phonenumber,gc);
        gc.gridy = 6;
        p1.add(tribe,gc);
        gc.gridy = 7;
        p1.add(alivedead,gc);
        patregbutton = new JButton("Register Patient");
        patregbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //HomePageController.checkLogin(name.getText(), surname.getText(), brithdate.getText(), homeaddress.getText(), phonenumber.getText(), tribe.getText(), alivedead.getText())
            }
        });
        gc.gridx=0; gc.gridy= 8; gc.gridwidth = GridBagConstraints.REMAINDER;
        p1.add(patregbutton,gc);


        JPanel p2 = new JPanel();

        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();

        JTabbedPane optionlist = new JTabbedPane();
        optionlist.add(p1,"Patient Registration");
        optionlist.add(p2,"Panel #2");
        optionlist.add(p3,"Panel #3");
        optionlist.add(p4,"Panel #4");



        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5,5,5,5);
        c.fill = GridBagConstraints.BOTH; c.gridwidth = GridBagConstraints.REMAINDER;c.ipadx = 450;
        add(toppanel, c);
        c.gridwidth = GridBagConstraints.REMAINDER;
        add(optionlist, c);



    }
}
