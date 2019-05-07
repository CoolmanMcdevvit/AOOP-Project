package GUI.Model;

import Hospital.src.main.java.Hospital.HashMapData;

public class FindPatientModel implements  FindInterface{

    private HashMapData hmd;

    public FindPatientModel(HashMapData hmd){
        this.hmd = hmd;
    }

    public Object [][] nameSearch(String search){
        return hmd.SearchPFirstName(search);
    }
    public Object [][] surnameSearch(String search){
        return hmd.SearchPLastName(search);
    }
    public Object [][] idSearch(Integer search){
        System.out.println(search);
        return hmd.SearchPID(search);
    }

}
