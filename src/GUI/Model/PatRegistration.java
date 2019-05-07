package GUI.Model;

import Hospital.src.main.java.Hospital.HashMapData;
import Hospital.src.main.java.Hospital.Patient;

import javax.swing.*;


public class PatRegistration implements Registration {

    private HashMapData data;

    public PatRegistration(HashMapData patientdata){
        this.data = patientdata;
    }

    public void regsisterInput(JTextField[] fields) {
        Patient p = new Patient();
        p.createPatient(fields[0].getText(), fields[1].getText(), fields[5].getText(), fields[6].getText(), fields[2].getText(), fields[3].getText(), fields[4].getText(), fields[7].getText(), fields[8].getText());
        data.registerPatient(p);
        data.printHMD();
    }
}