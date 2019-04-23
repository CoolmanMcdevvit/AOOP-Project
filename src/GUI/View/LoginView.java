package GUI.View;
import GUI.Controller.LoginController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginView extends JFrame{

    private JTextField usernametxt = new JTextField();
    private JPasswordField passtxt = new JPasswordField();
    private JButton loginbtn = new JButton();
    private LoginController controller;

    public LoginView(LoginController controller){
    this.controller = controller;
    initGUI();
    }

    private void initGUI(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        setTitle("Login");
        setResizable(false);

        usernametxt = new JTextField(15);
        passtxt = new JPasswordField(15);
        loginbtn = new JButton("Login");
        loginbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.CheckLogin(usernametxt.getText(), String.valueOf(passtxt.getPassword()));
            }
        });

        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(2,2,2,2);
        c.gridx = 0; c.gridy = 0; c.ipadx = 20; c.ipady = 10;
        add(new JLabel("Username:"), c);
        c.gridx = 0; c.gridy = 1; c.ipadx = 20; c.ipady = 10;
        add(new JLabel("Password:"), c);
        c.gridx = 1; c.gridy = 0; c.ipadx = 30; c.ipady = 10;
        add(usernametxt, c);
        c.gridx = 1; c.gridy = 1; c.ipadx = 30; c.ipady = 10;
        add(passtxt, c);
        c.gridx = 1; c.gridy = 2; c.ipadx = 30; c.ipady = 10; c.fill = GridBagConstraints.HORIZONTAL;
        add(loginbtn, c);
        pack();
        setLocationRelativeTo(null);
    }
}
