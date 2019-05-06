package GUI.Model;

import javax.swing.*;

public class PatRegistration {

    public void registerPatient(JTextField[] fields) {
        Patient p = new Patient();
        p.createPatient(fields[0].getText(), fields[1].getText(), fields[5].getText(), fields[6].getText(), fields[2].getText(), fields[3].getText(), fields[4].getText(), fields[7].getText(), fields[8].getText());
        HashMapData hmd = new HashMapData();
        hmd.registerPatient(p);
        hmd.printHMD();
    }
}
