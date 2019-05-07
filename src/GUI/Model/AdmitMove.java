package GUI.Model;

import Hospital.src.main.java.Hospital.HashMapData;
import Hospital.src.main.java.Hospital.Patient;

import javax.swing.*;

public class AdmitMove {

    private Patient patient;
    private HashMapData hmd;

    public AdmitMove(HashMapData hmd){
        this.hmd = hmd;
    }


    public void admitPatient(JTextField id, JTextField dep, JTextField bed){
        if(hmd.IspIDValid(id)){

        }
    }
}
