package GUI.Model;

import Hospital.src.main.java.Hospital.HashMapData;
import Hospital.src.main.java.Hospital.Patient;


import javax.swing.*;
import java.util.Map;

public class PatChange implements Change{

    private Map<Integer, Patient> mapp;
    private Patient p;

    public PatChange(HashMapData patientdata){
        this.mapp = patientdata.getHashMapData();
    }

    public void update(JTextField[] f){
        p.setFirstname(f[0].getText());
        p.setLastname(f[1].getText());
        p.setBirthday(f[2].getText(),f[3].getText(),f[4].getText());
        p.setAddress(f[5].getText());
        p.setPhonenumber(f[6].getText());
        p.setTribe(f[7].getText());
        p.setAlivestatus(f[8].getText());
    }

    public Patient uidFind(String uid){
        this.p = mapp.get(Integer.parseInt(uid));
        return p;
    }
}
