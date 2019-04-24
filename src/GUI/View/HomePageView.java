package GUI.View;

import javax.swing.*;
import java.awt.*;

public class HomePageView extends JFrame{

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
        gc.gridx = 0; gc.gridy = 0; gc.anchor = GridBagConstraints.WEST;
        p1.add(new JLabel("Name: "),gc);
        gc.gridy = 1;
        p1.add(new JLabel("Surname: "),gc);
        gc.gridy = 2;
        p1.add(new JLabel("Birth date (dd/mm/yyyy): "),gc);
        gc.gridy = 3;
        p1.add(new JLabel("Home Address: "),gc);
        gc.gridy = 4;
        p1.add(new JLabel("Phone Number: "),gc);
        gc.gridy = 5;
        p1.add(new JLabel("Tribe: "),gc);
        gc.gridy = 6;
        p1.add(new JLabel("Alive / Dead: "),gc);
        gc.gridx=1; gc.gridy=0; gc.ipadx = 90; gc.fill = GridBagConstraints.HORIZONTAL;
        p1.add(new JTextField(),gc);
        gc.gridy = 1;
        p1.add(new JTextField(),gc);
        gc.gridy = 2;
        p1.add(new JTextField(),gc);
        gc.gridy = 3;
        p1.add(new JTextField(),gc);
        gc.gridy = 4;
        p1.add(new JTextField(),gc);
        gc.gridy = 5;
        p1.add(new JTextField(),gc);
        gc.gridy = 6;
        p1.add(new JTextField(),gc);

        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();

        JTabbedPane optionlist = new JTabbedPane();
        optionlist.add(p1,"Panel #1");
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
