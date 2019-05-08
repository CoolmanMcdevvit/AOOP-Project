package GUI.Model;

import Hospital.src.main.java.Hospital.Department;
import Hospital.src.main.java.Hospital.Staff;
import Hospital.src.main.java.Hospital.StaffMap;

import javax.swing.*;

public class StaffRegistration implements Registration {

    private StaffMap data;

    public StaffRegistration(StaffMap staffdata){
        this.data = staffdata;
    }

    @Override
    public void regsisterInput(JTextField[] fields) {

            Staff s = new Staff();
            s.createStaff(fields[0].getText(), fields[1].getText(), fields[2].getText(), fields[3].getText());
            data.registerStaff(s);
            data.printHMD();

    }
}
