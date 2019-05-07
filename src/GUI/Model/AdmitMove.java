package GUI.Model;

import Hospital.src.main.java.Hospital.HashMapData;
import Hospital.src.main.java.Hospital.Patient;

import javax.swing.*;
import java.util.Map;

public class AdmitMove {

    private Patient patient;
    private HashMapData hmd;

    public AdmitMove(HashMapData hmd){
        this.hmd = hmd;
    }


    public void admitPatient(String id, String dep, String bed){
        if(hmd.IsStringIDValid(id)){
            hmd.admitPatient(dep, id,bed);
        }
    }

    public void movePatient(String id, String dep, String bed){
        if(hmd.IsStringIDValid(id)){
            hmd.admitPatient(dep, id,bed);
        }
    }

    public void dischargePatient(String id){
        if(hmd.IsStringIDValid(id)){
            hmd.DischargePatient(id);
        }
    }

}


