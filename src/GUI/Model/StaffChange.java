package GUI.Model;


import Hospital.src.main.java.Hospital.Staff;
import Hospital.src.main.java.Hospital.StaffMap;

import javax.swing.*;
import java.util.Map;

public class StaffChange implements Change {

    private Map<Integer, Staff> mapp;
    private Staff staff;

    public StaffChange(StaffMap hsm){
        this.mapp = hsm.getHashMapStaff();
    }

    public Staff uidFind(String uid){
        this.staff = mapp.get(Integer.parseInt(uid));
        return staff;
    }

    @Override
    public void update(JTextField[] f) {
        staff.setFirstname(f[0].getText());
        staff.setLastname(f[1].getText());
        staff.setJobRole(f[2].getText());
        staff.setDepartment(f[3].getText());
    }
}
