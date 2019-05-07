package GUI.Model;

import Hospital.src.main.java.Hospital.HashMapData;

public class AdmitMove {

    private HashMapData hmd;

    //HashMapData passed to constructor to ensure that always operating on same HashMap
    public AdmitMove(HashMapData hmd){
        this.hmd = hmd;
    }


    //calls the admitPatient method from HashMapData Class
    public void admitPatient(String id, String dep, String bed){
        //checks if ID is present in HashMapData
        if(hmd.IsStringIDValid(id)){
            //admits patient
            hmd.admitPatient(dep, id,bed);
        }
    }

    //moves patient to new Department and Bed specified
    public void movePatient(String id, String dep, String bed){
        if(hmd.IsStringIDValid(id)){
            hmd.admitPatient(dep, id,bed);
        }
    }
    //Discharges Patient with specified User ID
    public void dischargePatient(String id){
        if(hmd.IsStringIDValid(id)){
            hmd.DischargePatient(id);
        }
    }

}


