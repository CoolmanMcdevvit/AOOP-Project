package GUI.Model;

import Hospital.src.main.java.Hospital.HashMapData;
import Hospital.src.main.java.Hospital.StaffMap;


public class Homepage{

    public HashMapData patientdata;
    public StaffMap staffdata;


    public Homepage(){
        patientdata= new HashMapData();
        staffdata = new StaffMap();
    }
    public void populate(){
        patientdata.initializeData();
        staffdata.initializeData();
    }
    public void update(){
        patientdata.closeData();
        staffdata.closeData();
    }

}