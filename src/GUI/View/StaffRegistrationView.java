package GUI.View;

import GUI.Controller.StaffRegistrationController;

import javax.swing.*;

public class StaffRegistrationView extends StaffInfoView {

    private StaffRegistrationController controller;

    public StaffRegistrationView(StaffRegistrationController controller){
        super("Please enter Staff Data:",controller);
        this.controller = controller;
        initGUI();
    }

    public void initGUI(){
        JPanel panel = getPanel();
        setTitle("Staff Registration");

        JButton cleartext = new JButton("Clear Text");
        cleartext.setBounds(200, 500, 138, 30);
        cleartext.addActionListener(e -> controller.clear(getStaffTextFields(),3));
        panel.add(cleartext);

        JButton clicktoregister = new JButton("Register");
        clicktoregister.setBounds(50,500,138,30);
        clicktoregister.addActionListener(e -> controller.check(getStaffTextFields()));
        panel.add(clicktoregister);

        pack();
        setLocationRelativeTo(null);
    }
}
