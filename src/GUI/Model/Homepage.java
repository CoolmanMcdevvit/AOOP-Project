package GUI.Model;

import Hospital.src.main.java.Hospital.HashMapData;
import Hospital.src.main.java.Hospital.Patient;
import Hospital.src.main.java.Hospital.StaffMap;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Homepage{

    public HashMapData patientdata;
    public StaffMap staffdata;


    public Homepage(){
        patientdata= new HashMapData();
        staffdata = new StaffMap();
    }
    public void populate(){
        patientdata.initializeData();
    }
    public void update(){
        staffdata.closeData();}

}